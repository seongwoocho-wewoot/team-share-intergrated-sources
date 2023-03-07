package team.share.repository;

import team.share.dto.SearchView;
import team.share.support.FakeDataGenerator;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class SearchQueryRepository {

    public List<SearchView> findSearchDataBy(String content, String searchType) {

        List<SearchView> views = FakeDataGenerator.generate(5L);

        return views.stream()
                .filter(view -> view.equals(content) && view.equals(searchType))
                .collect(toList());
    }
}
