package com.ghores.meditationappcompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ghores.meditationappcompose.ui.util.MEDITATION_TYPE_LIST

@Composable
fun MeditationTypesComponent() {
    val meditationOptions = MEDITATION_TYPE_LIST
    LazyColumn(
        Modifier.padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(meditationOptions.size) {
            MeditationOptionComponent(meditationTypes = meditationOptions[it])
        }
    }
}