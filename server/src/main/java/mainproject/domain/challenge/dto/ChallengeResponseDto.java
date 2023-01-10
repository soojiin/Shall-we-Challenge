package mainproject.domain.challenge.dto;

import lombok.Data;
import mainproject.domain.challenge.entity.Frequency;
import mainproject.global.category.Category;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class ChallengeResponseDto {
    private long challengeId;

    private Category category;

    private String title;

    private String content;

    //private image;  // TODO: 이미지파일 (Nullable)

    private LocalDate startAt;

    private LocalDate endAt;

    private Frequency frequency;

    private LocalTime snapshotStartAt;

    private LocalTime snapshotEndAt;

    private LocalDateTime createdAt;
}
