package com.olivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olivia.morning.R
import com.olivia.ui.theme.MorningTheme

class OldActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Old()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Old() {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize()
            .width(50.dp)
            .padding(12.dp)



            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "The great tower")
        androidx.compose.foundation.Image(painter = painterResource(
            id = R.drawable.tower),
            contentDescription = "image",
            modifier = Modifier
                //.background(Color.Cyan)
                .fillMaxSize()
                .border(BorderStroke(1.dp, color = Color.White))
                .size(110.dp),

            // colorFilter = ColorFilter.tint(Color.Blue),
            contentScale = ContentScale.Crop

        )
    }
}


