package team.share.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.share.entity.FeedEntity;
import team.share.entity.FilterEntity;

public interface FeedRepository extends JpaRepository<FeedEntity, Long> {
}
