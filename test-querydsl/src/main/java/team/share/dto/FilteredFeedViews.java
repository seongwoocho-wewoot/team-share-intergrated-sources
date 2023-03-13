package team.share.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import team.share.entity.FeedEntity;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class FilteredFeedViews {

    private final List<FilteredFeedView> feeds;
    public static FilteredFeedViews newOne(List<FilteredFeedView> filteredFeedViews) {

        return new FilteredFeedViews(filteredFeedViews);
    }
}
