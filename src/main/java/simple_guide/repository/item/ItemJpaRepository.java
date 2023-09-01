package simple_guide.repository.item;

import org.springframework.data.jpa.repository.JpaRepository;
import simple_guide.domain.Item;

public interface ItemJpaRepository extends JpaRepository<Item, Long> {
}
