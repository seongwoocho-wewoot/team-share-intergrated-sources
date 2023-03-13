package team.share.constant;

import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.function.Predicate;

import static java.util.Arrays.stream;
import static team.share.entity.QFeedEntity.feedEntity;

@RequiredArgsConstructor
public enum FilterType {

    ALL(null), // anything
    UNDER_MONEY(feedEntity.money.loe(50_000L)),
    ;

    private final BooleanExpression whereCondition;

    public static FilterType from(String filterType) {

        return stream(values())
                .filter(equalsIgnoreCase(filterType))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }

    public BooleanExpression condition() {

        return whereCondition;
    }

    private static Predicate<FilterType> equalsIgnoreCase(String filterType) {

        return it -> it.name().toLowerCase().equalsIgnoreCase(filterType);
    }
}
