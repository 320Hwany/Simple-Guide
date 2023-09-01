package simple_guide.service.item;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import simple_guide.mapper.item.dto.ItemResponse;
import simple_guide.repository.item.ItemRepository;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(final ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional(readOnly = true)
    public List<ItemResponse> findItemResponseByMemberId(final long memberId) {
        return itemRepository.findItemResponseByMemberId(memberId);
    }
}
