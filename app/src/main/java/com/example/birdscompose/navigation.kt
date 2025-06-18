package com.example.birdscompose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1"){
        composable (route = "screen1"){
            PhotoScreen(fruitName = "apple",
            imageId = R.drawable.apple,
                screenNumber = 1,
                navController = navController
            )
        }

        composable (route = "screen2"){
            PhotoScreen(
                fruitName = "Banana",
                imageId = R.drawable.banana,
                screenNumber = 2,
                navController = navController
            )
        }
        composable (route = "screen3"){
            PhotoScreen(
                fruitName = "Orange",
                imageId = R.drawable.orange,
                screenNumber = 3,
                navController = navController
            )
        }
        composable (route = "screen4"){
            PhotoScreen(
                fruitName = "Pineapple",
                imageId = R.drawable.pineapple,
                screenNumber = 4,
                navController = navController
            )
        }
        composable (route = "screen5"){
            PhotoScreen(
                fruitName = "Melon",
                imageId = R.drawable.melon,
                screenNumber = 5,
                navController = navController
            )
        }
        composable (route = "screen6"){
            PhotoScreen(
                fruitName = "Mango",
                imageId = R.drawable.mango,
                screenNumber = 6,
                navController = navController
            )
        }

        }
}
