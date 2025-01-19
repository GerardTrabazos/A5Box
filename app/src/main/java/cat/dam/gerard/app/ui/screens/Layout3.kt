package cat.dam.gerard.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.dam.gerard.app.ui.theme.AppTheme
import cat.dam.gerard.app.ui.theme.Blue
import cat.dam.gerard.app.ui.theme.Green
import cat.dam.gerard.app.ui.theme.Orange
import cat.dam.gerard.app.ui.theme.Yellow

@Composable
fun Layout3() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Orange)
    ) {
        val isPortrait = maxWidth < maxHeight // Determina si és format vertical o horitzontal
        val boxSize = 200.dp // Mida fixa per als quadrats
        val colors = listOf(Red, Blue, Green, Yellow, Magenta) // Colors per als Box

        if (isPortrait) {
            // Format vertical: una sola columna amb 5 quadrats
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(colors.size) { index ->
                    Box(
                        modifier = Modifier
                            .size(boxSize)
                            .padding(8.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(colors[index]),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Box ${index + 1}", color = Color.White)
                    }
                }
            }
        } else {
            // Format horitzontal: quants quadrats hi caben per fila
            val boxesPerRow = (maxWidth / (boxSize + 16.dp)).toInt() // Incloent espai de padding
            LazyVerticalGrid(
                columns = GridCells.Fixed(boxesPerRow),
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(colors.size) { index ->
                    Box(
                        modifier = Modifier
                            .size(boxSize)
                            .padding(8.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(colors[index]),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Box ${index + 1}", color = Color.White)
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout3() {
    AppTheme {
        Layout3()
    }
}
