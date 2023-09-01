package simple_guide.mapper.member.dto;

import lombok.Builder;

@Builder
public record MemberSignupRequest(
        String name,
        int age
) {
}
