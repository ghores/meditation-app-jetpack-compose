package com.ghores.meditationappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.ghores.meditationappcompose.ui.components.FilterOptionsComponent
import com.ghores.meditationappcompose.ui.components.HeaderProfileComponent
import com.ghores.meditationappcompose.ui.components.MeditationTypesComponent
import com.ghores.meditationappcompose.ui.components.SearchInputComponent
import com.ghores.meditationappcompose.ui.theme.Grey
import com.ghores.meditationappcompose.ui.theme.MeditationAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppComposeTheme {
                Column(
                    modifier = Modifier
                        .background(Grey)
                        .fillMaxSize()
                ) {
                    HeaderProfileComponent()
                    SearchInputComponent()
                    FilterOptionsComponent()
                    MeditationTypesComponent()
                }
            }
        }
    }
}
