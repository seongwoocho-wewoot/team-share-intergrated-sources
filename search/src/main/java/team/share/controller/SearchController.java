package team.share.controller;

import constant.SearchType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.share.dto.SearchView;
import team.share.repository.SearchQueryRepository;

import java.util.List;

@RequestMapping
@RequiredArgsConstructor
@RestController
public class SearchController {

    private final SearchQueryRepository repository;

    @GetMapping("/search")
    public List<SearchView> search(@RequestParam String content, @RequestParam("search-type") SearchType searchType) {

        return repository.findSearchDataBy(content, searchType);
    }

    @GetMapping("/hello")
    public String hello() {

        return "Hello World";
    }
}
