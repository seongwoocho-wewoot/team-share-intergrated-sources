package team.share.support;

import constant.SearchType;
import team.share.dto.SearchView;

import javax.transaction.NotSupportedException;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FakeDataGenerator {

    private FakeDataGenerator() throws NotSupportedException {
        throw new NotSupportedException("지원하지 않음");
    }

    public static List<SearchView> generate(Long number) {

//        return innerGenerateByFixedNumber(number);
        return innerGenerateManually();
    }

    private static List<SearchView> innerGenerateManually() {

        return List.of(
                new SearchView(1L, "사랑스러운 치삼 만화 1", SearchType.TYPE_A),
                new SearchView(2L, "사랑스러운 치삼 만화 2", SearchType.TYPE_B),
                new SearchView(3L, "사랑스러운 치삼 만화 3", SearchType.TYPE_C),
                new SearchView(4L, "사랑스러운 치삼 만화 4", SearchType.TYPE_A),
                new SearchView(5L, "사랑스러운 치삼 만화 5", SearchType.TYPE_B)
        );
    }

    private static List<SearchView> innerGenerateByFixedNumber(Long number) {
        return IntStream.range(0, number.intValue())
                .mapToObj(it -> SearchView.builder()
                        .id(number)
                        .name("사랑스러운 치삼 만화" + number)
                        .type(SearchType.TYPE_A)
                        .build()
                )
                .collect(toList());
    }
}
