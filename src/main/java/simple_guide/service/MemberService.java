package simple_guide.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import simple_guide.domain.Member;
import simple_guide.mapper.MemberMapper;
import simple_guide.mapper.dto.MemberSignupRequest;
import simple_guide.repository.MemberRepository;

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
