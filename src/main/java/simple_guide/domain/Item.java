package simple_guide.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import simple_guide.global.Association;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Association
    private Long memberId;

    private String itemName;

    @Builder
    private Item(final Long memberId, final String itemName) {
        this.memberId = memberId;
        this.itemName = itemName;
    }
}
