package team.share.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.share.application.FilterService;
import team.share.constant.FilterType;
import team.share.dto.FilteredFeedView;
import team.share.dto.FilteredFeedViews;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FilterController {

    private final FilterService filterService;

    @GetMapping("/test/filter")
    public FilteredFeedViews testFilter(@RequestParam("filter-type") String filterTypeParam) {

        FilterType filterType = FilterType.from(filterTypeParam);

        List<FilteredFeedView> views = filterService.findFeedsByFilter(filterType);

        return FilteredFeedViews.newOne(views);
    }
}
