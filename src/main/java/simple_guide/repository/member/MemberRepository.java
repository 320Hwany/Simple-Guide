package simple_guide.repository.member;

import org.springframework.stereotype.Repository;
import simple_guide.domain.Member;

@Repository
public class MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    public MemberRepository(final MemberJpaRepository memberJpaRepository) {
        this.memberJpaRepository = memberJpaRepository;
    }

    public void save(final Member member) {
        memberJpaRepository.save(member);
    }
}
