package com.ghores.meditationappcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ghores.meditationappcompose.R
import com.ghores.meditationappcompose.ui.theme.Green
import com.ghores.meditationappcompose.ui.theme.nunitoLight
import com.ghores.meditationappcompose.ui.theme.nunitoMedium

@Composable
fun HeaderProfileComponent() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.profilepicture),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(
                    text = "Welcome back",
                    fontFamily = nunitoLight,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start
                )
                Text(
                    text = "Amin Ghazimoradi",
                    fontFamily = nunitoMedium,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }
        }
        BadgedBox(badge = { Badge(backgroundColor = Green) }) {
            Icon(
                Icons.Default.Notifications,
                contentDescription = "Notifications"
            )
        }
    }
}