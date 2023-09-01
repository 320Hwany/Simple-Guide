package simple_guide.service.member;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import simple_guide.domain.Member;
import simple_guide.mapper.member.MemberMapper;
import simple_guide.mapper.member.dto.MemberSignupRequest;
import simple_guide.repository.member.MemberRepository;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(final MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void signup(final MemberSignupRequest dto) {
        Member member = MemberMapper.toEntity(dto);
        memberRepository.save(member);
    }
}
