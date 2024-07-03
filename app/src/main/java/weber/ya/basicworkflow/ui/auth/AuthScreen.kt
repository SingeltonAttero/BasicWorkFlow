package weber.ya.basicworkflow.ui.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import weber.ya.basicworkflow.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreen() {
    Scaffold(
        topBar = {

            // тут булач нога хитро
            LargeTopAppBar(
                title = {
                    Surface(modifier = Modifier.fillMaxSize(), shadowElevation = 8.dp) {
                        Text(text = "Авторизация")
                    }
                })
        }
    ) {
        Surface(modifier = Modifier.padding(it)) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "TODO Auth")
            }
        }
    }
}