package com.olivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olivia.morning.R

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Picha()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Picha() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    ) {

       androidx.compose.foundation.Image(painter = painterResource(
           id = R.drawable.book),
           contentDescription = "image",
           modifier = Modifier
               //.background(Color.Cyan)
               .clip(CircleShape)
               .size(110.dp),

          // colorFilter = ColorFilter.tint(Color.Blue),
           contentScale = ContentScale.Crop

           )

    }

}

