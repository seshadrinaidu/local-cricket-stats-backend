
package com.seshadri.local_cricket_stats.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "batting_records")
@Getter
@Setter
public class BattingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Player name is required")
    private String playerName;

    @NotBlank(message = "Team name is required")
    private String teamName;

    @NotBlank(message = "Match name is required")
    private String matchName;

    @NotNull(message = "Runs scored is required")
    @PositiveOrZero(message = "Runs scored cannot be negative")
    private Integer runsScored;

    @NotNull(message = "Balls faced is required")
    @PositiveOrZero(message = "Balls faced cannot be negative")
    private Integer ballsFaced;

    @NotNull(message = "Number of fours is required")
    @PositiveOrZero(message = "Number of fours cannot be negative")
    private Integer fours;

    @NotNull(message = "Number of sixes is required")
    @PositiveOrZero(message = "Number of sixes cannot be negative")
    private Integer sixes;

    @NotNull(message = "Match date is required")
    private LocalDate matchDate;

    private Boolean isOut;
}
