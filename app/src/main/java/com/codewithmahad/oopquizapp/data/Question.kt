package com.codewithmahad.oopquizapp.data

/**
 * This is a data class. It's a simple blueprint for holding the data
 * for a single question. It's a perfect example of a "Class" in OOP.
 */
data class Question(
    val text: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)