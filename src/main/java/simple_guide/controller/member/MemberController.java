package simple_guide.controller.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simple_guide.mapper.member.dto.MemberSignupRequest;
import simple_guide.service.member.MemberService;

@RequestMapping("/api")
@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(final MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public void signup(@RequestBody final MemberSignupRequest dto) {
        memberService.signup(dto);
    }
}
