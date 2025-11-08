package com.codewithmahad.oopquizapp.core

import com.codewithmahad.oopquizapp.data.CppQuizData
import com.codewithmahad.oopquizapp.data.JavaQuizData
import com.codewithmahad.oopquizapp.data.PythonQuizData
import com.codewithmahad.oopquizapp.data.QuizDataSource

object QuizManager {

    fun getQuizDataSource(language: String): QuizDataSource {
        return when (language) {
            "java_kotlin" -> JavaQuizData
            "cpp" -> CppQuizData
            "python" -> PythonQuizData
            else -> throw IllegalArgumentException("Invalid language: $language")
        }
    }
}