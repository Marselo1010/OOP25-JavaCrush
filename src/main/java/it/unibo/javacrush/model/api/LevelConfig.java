package it.unibo.javacrush.model.api;

import java.util.Map;

import it.unibo.javacrush.common.CellType;
import it.unibo.javacrush.powerup.api.PowerUpManager;

/**
 * Represents the configuration for a game level.
 */
public record LevelConfig(
    int rows,
    int cols,
    int moves,
    Map<CellType, Integer> goals,
    GravityEngine gravity,
    PowerUpManager powerUpManager
) {}
