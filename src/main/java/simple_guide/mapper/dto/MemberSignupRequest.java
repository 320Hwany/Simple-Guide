package simple_guide.mapper.dto;

import lombok.Builder;

@Builder
public record MemberSignupRequest(
        String name,
        int age
) {
}
