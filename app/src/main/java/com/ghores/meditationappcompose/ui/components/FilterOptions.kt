package com.ghores.meditationappcompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ghores.meditationappcompose.ui.util.FILTER_CONTENT_LIST

@Composable
fun FilterOptionsComponent() {
    val filterOptions = FILTER_CONTENT_LIST
    LazyRow(
        modifier = Modifier.padding(start = 15.dp, top = 15.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(filterOptions.size) {
            ChipComponent(filter = filterOptions[it])
        }
    }
}