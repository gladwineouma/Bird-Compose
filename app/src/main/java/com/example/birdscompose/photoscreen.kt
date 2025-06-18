package com.example.birdscompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun PhotoScreen (fruitName: String,  imageId: Int, screenNumber: Int, navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(painter = painterResource(id =imageId ),
            contentDescription = "A photo a ${fruitName}",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.65f),
            contentScale = ContentScale.Fit
        )

        Text(text = fruitName,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontStyle= FontStyle.Italic,
            modifier = Modifier.padding(18.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
            ){
            if(screenNumber > 1 ){
                IconButton(onClick = {
                   navController.navigate("screen${screenNumber -1}")
                })
            {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = "Back arrow"
                )
            }
            }

            Spacer(modifier = Modifier.weight(1f))

            if(screenNumber < 6 ){
            IconButton(onClick = {
                navController.navigate("screen${screenNumber +1}")
            }) {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                    contentDescription = "Forward arrow")
            }
            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun PhotoScreenPreview(){
    PhotoScreen("Apple", R.drawable.apple, screenNumber = 1 , rememberNavController())
}

