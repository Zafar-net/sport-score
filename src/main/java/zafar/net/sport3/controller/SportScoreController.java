package zafar.net.sport3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zafar.net.sport3.entity.SportScore;
import zafar.net.sport3.service.SportScoreService;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
@RequiredArgsConstructor
public class SportScoreController {
    private final SportScoreService service;

    @GetMapping
    public ResponseEntity<List<SportScore>> getAllScores() {
        return ResponseEntity.ok(service.getAllScores());
    }

    @PostMapping
    public ResponseEntity<SportScore> saveScore(@RequestBody SportScore score) {
        return ResponseEntity.ok(service.saveScore(score));
    }
}