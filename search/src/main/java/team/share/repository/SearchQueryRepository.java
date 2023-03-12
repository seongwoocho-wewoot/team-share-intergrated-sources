package team.share.repository;

import team.share.constant.SearchType;
import org.springframework.stereotype.Component;
import team.share.dto.SearchView;
import team.share.support.FakeDataGenerator;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class SearchQueryRepository {

    public List<SearchView> findSearchDataBy(String content, SearchType searchType) {

        List<SearchView> views = FakeDataGenerator.generate(5L);

        return views.stream()
                .filter(view -> matches(content, searchType, view))
                .collect(toList());
    }

    private static boolean matches(String content, SearchType searchType, SearchView view) {

        return view.getName().toLowerCase().contains(content.toLowerCase()) && view.getType().equals(searchType);
    }
}
