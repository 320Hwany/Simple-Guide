package simple_guide.controller.item;

import org.springframework.web.bind.annotation.*;
import simple_guide.mapper.item.dto.ItemResponse;
import simple_guide.service.item.ItemService;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items/{memberId}")
    private List<ItemResponse> getItemResponses(@PathVariable final long memberId) {
        return itemService.findItemResponseByMemberId(memberId);
    }
}
