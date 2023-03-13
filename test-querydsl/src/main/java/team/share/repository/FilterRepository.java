package team.share.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.share.constant.FilterType;
import team.share.entity.FilterEntity;

public interface FilterRepository extends JpaRepository<FilterEntity, Long> {
    FilterEntity findByType(FilterType filterType);
}
