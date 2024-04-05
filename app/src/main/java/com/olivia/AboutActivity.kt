package com.olivia

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olivia.MainActivity
class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           About()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun About() {
   Column(
       modifier = Modifier
           .background(Color.Gray)
//           .fillMaxWidth()
//           .fillMaxHeight()
           .fillMaxSize(),


//       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally



   ) {
       Row(
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceEvenly,
           modifier = Modifier
               .background(Color.Magenta)
               .fillMaxWidth()
               .height(35.dp)


       ) {
           Text(text = "Chats")
           Spacer(modifier = Modifier.width(12.dp))

           Text(text = "Updates")
           Spacer(modifier = Modifier.width(12.dp))

           Text(text = "Calls")
       }
       Spacer(modifier = Modifier.height(50.dp))




       Text(text = "About this program", color = Color.Cyan, fontFamily = FontFamily.Serif, modifier = Modifier.background(
           Color.White))
       Text(text = "Screen", color = Color.DarkGray, fontSize = 18.sp)
       val home = LocalContext.current
       Button(onClick = {
           home.startActivity(Intent(home,MainActivity::class.java))
       },

          // colors = ButtonDefaults.buttonColors(Color.blue),
          // shape = RectangleShape
           // shape = RoundedCornerShape(10.dp)
           shape = CutCornerShape(8),
           border = BorderStroke(2.dp, Color.Black),
           colors = ButtonDefaults.outlinedButtonColors(Color.Transparent)
           ) {
           Text(text = "Home screen",  color = Color.Blue)
           
       }
       val pp  = AnnotatedString("Home", spanStyle = SpanStyle(Color.Green))
       val yy = LocalContext.current
       ClickableText(text = pp, onClick = {
           yy.startActivity(Intent(yy,MainActivity::class.java))
       })
       val mm = LocalContext.current
       Text(text = "click here", modifier = Modifier.clickable {
           mm.startActivity(Intent(mm, MainActivity::class.java))
       })

       val inp = LocalContext.current
       Text(text = "type inputs", modifier = Modifier.clickable {
           inp.startActivity(Intent(mm, InputActivity::class.java))
       })


   }

}


