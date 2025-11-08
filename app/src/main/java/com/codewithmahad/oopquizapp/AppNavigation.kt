package com.codewithmahad.oopquizapp

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codewithmahad.oopquizapp.ui.screens.QuizScreen
import com.codewithmahad.oopquizapp.ui.screens.ResultScreen
import com.codewithmahad.oopquizapp.ui.screens.StartScreen
import com.codewithmahad.oopquizapp.viewmodel.ThemeViewModel

@Composable
fun AppNavigation(themeViewModel: ThemeViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController, 
        startDestination = "start",
        enterTransition = { fadeIn(animationSpec = tween(500)) },
        exitTransition = { fadeOut(animationSpec = tween(500)) },
        popEnterTransition = { fadeIn(animationSpec = tween(500)) },
        popExitTransition = { fadeOut(animationSpec = tween(500)) }
    ) {

        // 1. Start Screen
        composable("start") {
            StartScreen(
                onQuizSelected = { quizType, language ->
                    // Navigate to the quiz screen, passing the quiz type and language
                    navController.navigate("quiz/$quizType/$language")
                },
                themeViewModel = themeViewModel
            )
        }

        // 2. Quiz Screen
        composable("quiz/{quizType}/{language}") { backStackEntry ->
            // Get the quizType and language from the navigation route
            val quizType = backStackEntry.arguments?.getString("quizType") ?: "encapsulation"
            val language = backStackEntry.arguments?.getString("language") ?: "java_kotlin"

            QuizScreen(
                quizType = quizType,
                language = language,
                onQuizFinished = { score, totalQuestions ->
                    // Navigate to the result screen
                    navController.navigate("result/$score/$totalQuestions") {
                        popUpTo("start") // Clear back stack so user can't go back to quiz
                    }
                },
                onNavigateBack = { navController.popBackStack() }
            )
        }

        // 3. Result Screen
        composable("result/{score}/{totalQuestions}") { backStackEntry ->
            val score = backStackEntry.arguments?.getString("score")?.toInt() ?: 0
            val totalQuestions = backStackEntry.arguments?.getString("totalQuestions")?.toInt() ?: 0

            ResultScreen(
                score = score,
                totalQuestions = totalQuestions,
                onPlayAgain = {
                    navController.navigate("start") {
                        popUpTo("start") // Go back to start and clear history
                    }
                }
            )
        }
    }
}