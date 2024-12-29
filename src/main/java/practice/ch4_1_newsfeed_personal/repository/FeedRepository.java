package practice.ch4_1_newsfeed_personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.ch4_1_newsfeed_personal.model.entity.Feed;

public interface FeedRepository extends JpaRepository<Feed, Integer> {
}
