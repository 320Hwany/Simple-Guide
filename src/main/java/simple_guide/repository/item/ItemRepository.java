package simple_guide.repository.item;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import simple_guide.domain.Item;
import simple_guide.domain.QItem;
import simple_guide.mapper.item.dto.ItemResponse;
import simple_guide.mapper.item.dto.QItemResponse;

import java.util.List;

import static simple_guide.domain.QItem.*;

@Repository
public class ItemRepository {

    private final ItemJpaRepository itemJpaRepository;
    private final JPAQueryFactory queryFactory;

    public ItemRepository(final ItemJpaRepository itemJpaRepository,
                          final JPAQueryFactory queryFactory) {
        this.itemJpaRepository = itemJpaRepository;
        this.queryFactory = queryFactory;
    }

    public List<ItemResponse> findItemResponseByMemberId(final long memberId) {
        return queryFactory.select(new QItemResponse(
                        item.itemName
                ))
                .from(item)
                .where(item.memberId.eq(memberId))
                .fetch();
    }
}
