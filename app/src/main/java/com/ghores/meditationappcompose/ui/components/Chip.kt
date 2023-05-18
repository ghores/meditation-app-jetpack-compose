package com.ghores.meditationappcompose.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.ghores.meditationappcompose.ui.theme.nunitoMedium
import com.ghores.meditationappcompose.ui.util.FilterContent

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ChipComponent(filter: FilterContent) {
    val contentColor = filter.contentColor
    val chipBackground = filter.backgroundColor
    val filterText = filter.filterText

    Chip(
        onClick = { /*TODO*/ },
        colors = ChipDefaults.chipColors(
            contentColor = contentColor,
            backgroundColor = chipBackground
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = filterText,
            fontFamily = nunitoMedium
        )
    }
}