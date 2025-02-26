package zafar.net.sport3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zafar.net.sport3.entity.SportScore;
import zafar.net.sport3.repository.SportScoreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportScoreService {
    private final SportScoreRepository repository;

    public List<SportScore> getAllScores() {
        return repository.findAll();
    }

    public SportScore saveScore(SportScore score) {
        int totalScore = calculateScore(score.getRun100m(), score.getRun3000m(), score.getPullUp());
        score.setBall((double) totalScore);
        return repository.save(score);
    }

    private int calculateScore(double run100m, double run3000m, int pullUp) {
        int totalScore = 0;

        // 100m yugurish ballari
        if (run100m <= 13.0) totalScore = 25;
        else if (run100m <= 13.1) totalScore = 24;
        else if (run100m <= 13.2) totalScore = 23;
        else if (run100m <= 13.3) totalScore = 22;
        else if (run100m <= 13.4) totalScore = 21;
        else if (run100m <= 13.5) totalScore = 20;
        else if (run100m <= 13.6) totalScore = 19;
        else if (run100m <= 13.7) totalScore = 18;
        else if (run100m <= 13.8) totalScore = 17;
        else if (run100m <= 13.9) totalScore = 16;
        else if (run100m <= 14.0) totalScore = 15;
        else if (run100m <= 14.1) totalScore = 14;
        else if (run100m <= 14.2) totalScore = 13;
        else if (run100m <= 14.3) totalScore = 12;
        else if (run100m <= 14.4) totalScore = 11;
        else if (run100m <= 14.5) totalScore = 10;
        else if (run100m <= 14.6) totalScore = 9;
        else if (run100m <= 14.7) totalScore = 8;
        else if (run100m <= 14.8) totalScore = 7;
        else if (run100m <= 14.9) totalScore = 6;
        else if (run100m <= 15.0) totalScore = 5;
        else if (run100m <= 15.1) totalScore = 4;
        else if (run100m <= 15.2) totalScore = 3;
        else if (run100m <= 15.3) totalScore = 2;
        else if (run100m <= 15.4) totalScore = 1;

        // 3000m yugurish ballari
        if (run3000m <= 12.0) totalScore += 20;
        else if (run3000m <= 12.1) totalScore += 19;
        else if (run3000m <= 12.2) totalScore += 18;
        else if (run3000m <= 12.3) totalScore += 17;
        else if (run3000m <= 12.35) totalScore += 16;
        else if (run3000m <= 12.4) totalScore += 15;
        else if (run3000m <= 12.45) totalScore += 14;
        else if (run3000m <= 12.5) totalScore += 13;
        else if (run3000m <= 12.55) totalScore += 12;
        else if (run3000m <= 13.0) totalScore += 11;
        else if (run3000m <= 13.05) totalScore += 10;
        else if (run3000m <= 13.1) totalScore += 9;
        else if (run3000m <= 13.15) totalScore += 8;
        else if (run3000m <= 13.2) totalScore += 7;
        else if (run3000m <= 13.25) totalScore += 6;
        else if (run3000m <= 13.3) totalScore += 5;
        else if (run3000m <= 13.35) totalScore += 4;
        else if (run3000m <= 13.4) totalScore += 3;
        else if (run3000m <= 13.45) totalScore += 2;
        else if (run3000m <= 13.5) totalScore += 1;

        // Turnik ballari
        if (pullUp >= 24) totalScore += 25;
        else if (pullUp >= 23) totalScore += 24;
        else if (pullUp >= 22) totalScore += 23;
        else if (pullUp >= 21) totalScore += 22;
        else if (pullUp >= 20) totalScore += 21;
        else if (pullUp >= 19) totalScore += 20;
        else if (pullUp >= 18) totalScore += 19;
        else if (pullUp >= 17) totalScore += 18;
        else if (pullUp >= 16) totalScore += 17;
        else if (pullUp >= 15) totalScore += 15;
        else if (pullUp >= 14) totalScore += 13;
        else if (pullUp >= 13) totalScore += 11;
        else if (pullUp >= 12) totalScore += 9;
        else if (pullUp >= 11) totalScore += 7;
        else if (pullUp >= 10) totalScore += 5;
        else if (pullUp >= 9) totalScore += 3;
        else if (pullUp >= 8) totalScore += 1;

        return totalScore;
    }


}