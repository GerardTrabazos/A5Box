package cat.dam.gerard.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.dam.gerard.app.ui.theme.AppTheme
import cat.dam.gerard.app.ui.theme.Aqua

@Composable
fun Layout1() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Aqua),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier
            .width(250.dp)
            .height(250.dp)
            .padding(8.dp)
            .background(Red)
        )
        Box(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .padding(8.dp)
            .background(Blue)
        )
        Box(modifier = Modifier
            .width(150.dp)
            .height(150.dp)
            .padding(8.dp)
            .background(Green)
        )
        Box(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .padding(8.dp)
            .background(Yellow)
        )
    }
}
@Composable
@Preview(showBackground = true)
fun PreviewLayout() {
    AppTheme {
        Layout1()
    }
}
