package com.ghores.meditationappcompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ghores.meditationappcompose.ui.theme.Black
import com.ghores.meditationappcompose.ui.theme.nunitoBold
import com.ghores.meditationappcompose.ui.theme.nunitoLight
import com.ghores.meditationappcompose.ui.theme.nunitoMedium
import com.ghores.meditationappcompose.ui.util.MeditationType

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MeditationOptionComponent(meditationTypes: MeditationType) {
    Card(
        shape = RoundedCornerShape(14.dp),
        modifier = Modifier.fillMaxSize(),
        backgroundColor = meditationTypes.backgroundColor
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(20.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Chip(
                    onClick = { /*TODO*/ },
                    colors = ChipDefaults.chipColors(
                        contentColor = Black,
                        backgroundColor = meditationTypes.timeBackgroundColor
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = meditationTypes.duration, fontFamily = nunitoMedium)
                }
                Chip(
                    onClick = { /*TODO*/ },
                    colors = ChipDefaults.chipColors(
                        contentColor = Black,
                        backgroundColor = Color.White
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = meditationTypes.teacher, fontFamily = nunitoMedium)
                }
            }

            Text(
                text = meditationTypes.title,
                fontFamily = nunitoBold,
                fontSize = 18.sp,
                color = meditationTypes.contentColor,
                textAlign = TextAlign.Start
            )

            Text(
                text = meditationTypes.description,
                fontFamily = nunitoLight,
                fontSize = 16.sp,
                color = meditationTypes.contentColor,
                textAlign = TextAlign.Start
            )
        }
    }
}