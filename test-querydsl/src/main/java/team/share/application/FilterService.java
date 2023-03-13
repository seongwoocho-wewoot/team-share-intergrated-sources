package team.share.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team.share.constant.FilterType;
import team.share.dto.FilteredFeedView;
import team.share.entity.FilterEntity;
import team.share.repository.FilterRepository;
import team.share.repository.FeedViewQueries;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FilterService {

    private final FilterRepository filterRepository;

    private final FeedViewQueries feedViewQueries;


    public List<FilteredFeedView> findFeedsByFilter(FilterType filterType) {

        FilterEntity filterEntity = filterRepository.findByType(filterType);

        return feedViewQueries.findAllByFilter(filterEntity);
    }
}
