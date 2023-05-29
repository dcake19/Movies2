package com.example.movies2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.movies2.ui.theme.MoviesTheme

@Composable
fun FullListScreen() {
    Text(text = "See all")
}

@Preview
@Composable
fun FullListPreview() {
    MoviesTheme {
        FullListScreen()
    }
}