package team.share.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;
import team.share.dto.FilteredFeedView;
import team.share.entity.FeedEntity;
import team.share.entity.FilterEntity;

import javax.persistence.EntityManager;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static team.share.entity.QFeedEntity.feedEntity;

@Repository
public class FeedViewQueries {

    private final JPAQueryFactory queryFactory;

    public FeedViewQueries(EntityManager entityManager) {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    public List<FilteredFeedView> findAllByFilter(FilterEntity filterType) {

        var entities = findFeeds(filterType.whereCondition());

        return convertToViewsFrom(entities);
    }

    private List<FeedEntity> findFeeds(BooleanExpression whereCondition) {

        return queryFactory
                .selectFrom(feedEntity)
                .where(whereCondition)
                .fetch();
    }

    private static List<FilteredFeedView> convertToViewsFrom(List<FeedEntity> entities) {

        return entities.stream()
                .map(FilteredFeedView::newOne)
                .collect(toList());
    }
}
