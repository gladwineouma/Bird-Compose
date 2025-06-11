package com.example.birdscompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PhotoScreen (fruitName: String,  imageId: Int){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id =imageId ),
            contentDescription = "A photo a $fruitName",
            modifier = Modifier.fillMaxWidth().fillMaxHeight(0.65f),
            contentScale = ContentScale.Fit
        )


    }
}
@Preview(showBackground = true)
@Composable
fun PhotoScreenPreview(){
    PhotoScreen("mango", R.drawable.mango)
}

