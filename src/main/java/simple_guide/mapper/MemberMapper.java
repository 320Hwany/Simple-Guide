package simple_guide.mapper;

import simple_guide.domain.Member;
import simple_guide.mapper.dto.MemberSignupRequest;

public class MemberMapper {

    private MemberMapper() {
    }

    public static Member toEntity(final MemberSignupRequest dto) {
        return Member.builder()
                .name(dto.name())
                .age(dto.age())
                .build();
    }
}
