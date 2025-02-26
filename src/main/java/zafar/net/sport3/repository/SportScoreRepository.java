package zafar.net.sport3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zafar.net.sport3.entity.SportScore;

public interface SportScoreRepository extends JpaRepository<SportScore, Long> {
}