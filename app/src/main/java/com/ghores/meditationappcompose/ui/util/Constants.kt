package com.ghores.meditationappcompose.ui.util

import androidx.compose.ui.graphics.Color
import com.ghores.meditationappcompose.ui.theme.Black
import com.ghores.meditationappcompose.ui.theme.Green
import com.ghores.meditationappcompose.ui.theme.Yellow


val FILTER_CONTENT_LIST = listOf(
    FilterContent(Color.White, Black, "Mood swings"),
    FilterContent(Black, Color.White, "Stress"),
    FilterContent(Black, Color.White, "Depression"),
    FilterContent(Black, Color.White, "Anxiety"),
    FilterContent(Black, Color.White, "Anger"),
    FilterContent(Black, Color.White, "Excitement"),
    FilterContent(Black, Color.White, "Fear"),
    FilterContent(Black, Color.White, "Joy"),
    FilterContent(Black, Color.White, "Horror")
)

val MEDITATION_TYPE_LIST = listOf(
    MeditationType(
        "45 mins",
        "James Madchen",
        "Love-kind meditation",
        "During loving kindness meditation, you focus benevolent and loving energy toward yourself and others.",
        Yellow,
        Black,
        Green
    ),
    MeditationType(
        "34 mins",
        "Kate Landon",
        "Flower meditation",
        "Outdoor concentration meditation, the object is a flower.",
        Green,
        Black,
        Yellow
    ),
    MeditationType(
        "25 mins",
        "David Wilson",
        "Breather",
        "A 5-minute intro to meditation, relax and inhale to start.",
        Black,
        Color.White,
        Yellow
    ),
    MeditationType(
        "45 mins",
        "James Madchen",
        "Love-kind meditation",
        "During loving kindness meditation, you focus benevolent and loving energy toward yourself and others.",
        Yellow,
        Black,
        Green
    ),
    MeditationType(
        "34 mins",
        "Kate Landon",
        "Flower meditation",
        "Outdoor concentration meditation, the object is a flower.",
        Green,
        Black,
        Yellow
    ),
    MeditationType(
        "25 mins",
        "David Wilson",
        "Breather",
        "A 5-minute intro to meditation, relax and inhale to start.",
        Black,
        Color.White,
        Yellow
    )
)