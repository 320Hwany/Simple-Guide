package simple_guide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simple_guide.domain.Member;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {
}
