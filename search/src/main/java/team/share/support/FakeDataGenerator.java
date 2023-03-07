package team.share.support;

import team.share.dto.SearchView;

import javax.transaction.NotSupportedException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FakeDataGenerator {

    private FakeDataGenerator() throws NotSupportedException {
        throw new NotSupportedException("지원하지 않음");
    }

    public static List<SearchView> generate(Long number) {

        return IntStream.range(0, number.intValue())
                .mapToObj(it -> SearchView.builder()
                        .id(number)
                        .name("푸우-" + number)
                        .build()
                )
                .collect(toList());
    }
}
