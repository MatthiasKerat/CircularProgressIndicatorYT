package com.kapps.circularprogressindicatoryt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kapps.circularprogressindicatoryt.ui.theme.CircularProgressIndicatorYTTheme
import com.kapps.circularprogressindicatoryt.ui.theme.darkGray
import com.kapps.circularprogressindicatoryt.ui.theme.gray
import com.kapps.circularprogressindicatoryt.ui.theme.orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularProgressIndicatorYTTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(darkGray),
                    contentAlignment = Alignment.Center
                ){
                    CustomCircularProgressIndicator(
                        modifier = Modifier
                            .size(250.dp)
                            .background(darkGray)
                        ,
                        initialValue = 50,
                        primaryColor = orange,
                        secondaryColor = gray,
                        circleRadius = 230f,
                        onPositionChange = { position ->
                            //do something with this position value
                        }
                    )
                }
            }
        }
    }
}