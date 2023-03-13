package team.share.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import team.share.entity.FeedEntity;

@RequiredArgsConstructor
@Getter
public class FilteredFeedView {

    private final Long feedId;
    private final String feedName;
    public static FilteredFeedView newOne(FeedEntity entity) {

        return new FilteredFeedView(entity.getId(), entity.getName());
    }
}
