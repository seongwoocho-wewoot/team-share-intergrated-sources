package team.share.entity;

import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import team.share.constant.FilterType;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FilterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FilterType type;

    private Long money;

    public FilterEntity(FilterType type, Long money) {
        this.type = type;
        this.money = money;
    }

    public BooleanExpression whereCondition() {

        return type.condition();
    }
}
