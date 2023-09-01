package simple_guide.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import simple_guide.domain.Member;

@Repository
public class MemberRepository {

    private final MemberJpaRepository memberJpaRepository;
    private final JPAQueryFactory queryFactory;

    public MemberRepository(final MemberJpaRepository memberJpaRepository,
                            final JPAQueryFactory queryFactory) {
        this.memberJpaRepository = memberJpaRepository;
        this.queryFactory = queryFactory;
    }

    public void save(final Member member) {
        memberJpaRepository.save(member);
    }
}
