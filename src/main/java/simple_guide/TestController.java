package simple_guide;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import simple_guide.domain.Member;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    private final TestData testData;

    public TestController(final TestData testData) {
        this.testData = testData;
    }

    @PostMapping("/test/insert")
    public void testInsert() {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Member member = Member.builder()
                    .name(String.valueOf(i))
                    .age(i)
                    .build();

            members.add(member);
        }
        testData.batchInsert(members);
    }
}