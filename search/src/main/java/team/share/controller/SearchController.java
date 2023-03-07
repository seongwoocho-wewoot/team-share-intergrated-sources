package team.share.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team.share.dto.SearchView;
import team.share.repository.SearchQueryRepository;

import java.util.List;

@RequestMapping
@RequiredArgsConstructor
public class SearchController {

    private final SearchQueryRepository repository;

    @GetMapping("/search")
    public List<SearchView> search(@RequestParam String content, @RequestParam("search-type") String searchType) {

        return repository.findSearchDataBy(content, searchType);
    }
}
