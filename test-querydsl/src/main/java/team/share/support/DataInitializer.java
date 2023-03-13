package team.share.support;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import team.share.constant.FilterType;
import team.share.entity.FeedEntity;
import team.share.entity.FilterEntity;
import team.share.repository.FeedRepository;
import team.share.repository.FilterRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final FilterRepository filterRepository;
    private final FeedRepository feedRepository;

    @PostConstruct
    public void init() {
        filterRepository.save(new FilterEntity(FilterType.ALL, 0L));
        filterRepository.save(new FilterEntity(FilterType.UNDER_MONEY, 50_000L));

        feedRepository.save(new FeedEntity("우리 멍멍이 좀 찾아주세요.", 100_000L));
        feedRepository.save(new FeedEntity("바퀴벌래 좀 잡아주실래요?", 10_000L));
    }
}
