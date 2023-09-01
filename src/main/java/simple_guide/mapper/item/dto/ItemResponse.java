package simple_guide.mapper.item.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;

@Builder
public record ItemResponse(
        String itemName
) {
    @QueryProjection
    public ItemResponse {
    }
}
