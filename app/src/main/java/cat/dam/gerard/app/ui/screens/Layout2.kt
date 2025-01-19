package cat.dam.gerard.app.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import cat.dam.gerard.app.ui.theme.AppTheme

@Composable
fun Layout2() {
    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = if (isPortrait) Alignment.BottomStart else Alignment.BottomEnd // Alineació segons l'orientació
    ) {
        Text(
            text = "Frame1",
            color = Color.White,
            modifier = if (isPortrait) {
                Modifier.align(Alignment.TopStart)
            } else {
                Modifier.align(Alignment.TopEnd)
            }
        )
        Box(
            modifier = Modifier
                .zIndex(1f)
                .size(
                    width = if (isPortrait) 350.dp else 600.dp,
                    height = if (isPortrait) 825.dp else 400.dp
                )
                .background(Yellow),
        ) {
            Text(text = "Frame2", color = Color.White)
        }

        // Segon Box
        Box(
            modifier = Modifier
                .zIndex(2f)
                .size(
                    width = if (isPortrait) 320.dp else 550.dp,
                    height = if (isPortrait) 775.dp else 350.dp
                )
                .background(White),
        ) {
            Text(text = "Frame3", color = Color.Black)
        }

        // Tercer Box
        Box(
            modifier = Modifier
                .zIndex(3f)
                .size(
                    width = if (isPortrait) 370.dp else 650.dp,
                    height = if (isPortrait) 725.dp else 300.dp
                )
                .background(Green),
        ) {
            Text(text = "Frame4", color = Color.White)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout2() {
    AppTheme {
        Layout2()
    }
}
