package simple_guide;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import simple_guide.domain.Member;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TestData {

    private final JdbcTemplate jdbcTemplate;

    public TestData(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 배치 insert 테스트 용도

    public void batchInsert(List<Member> members) {
        jdbcTemplate.batchUpdate(
                "INSERT INTO member (name, age) VALUES (?, ?)",
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(final PreparedStatement ps, final int i) throws SQLException {
                        Member member = members.get(i);
                        ps.setString(1, member.getName());
                        ps.setInt(2, member.getAge());
                    }

                    @Override
                    public int getBatchSize() {
                        return members.size();
                    }
                }
        );
    }
}