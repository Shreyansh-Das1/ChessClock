@file:Suppress("UnusedImport")

package com.example.chessclock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chessclock.ui.theme.*

@Preview(showBackground = true)
@Composable
fun background(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(background))
    {
        Column(modifier = Modifier.padding(horizontal = 12.dp , vertical = 16.dp))
        {
            timer()
        }
    }
}

@Composable
fun timer()
{
    Card(modifier = Modifier
        .size(287.dp,319.dp)
        .clip(RoundedCornerShape(27.dp))
        .background(currentcard)
        .align(Alignment.CenterHorizontally))
    {

    }
}