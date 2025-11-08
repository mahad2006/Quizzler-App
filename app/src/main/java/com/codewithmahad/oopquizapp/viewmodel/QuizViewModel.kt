package com.codewithmahad.oopquizapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.codewithmahad.oopquizapp.core.QuizManager
import com.codewithmahad.oopquizapp.data.Question
import com.codewithmahad.oopquizapp.data.QuizDataSource

class QuizViewModel(quizType: String, language: String) : ViewModel() {

    private val quizDataSource: QuizDataSource = QuizManager.getQuizDataSource(language)
    private val questions: List<Question>

    // Declare properties before the init block that uses them
    var currentQuestion: Question by mutableStateOf(Question("Loading...", emptyList(), 0))
        private set
    var selectedAnswerIndex: Int? by mutableStateOf(null)
        private set
    var isAnswerChecked: Boolean by mutableStateOf(false)
        private set
    private var currentQuestionIndex = 0
    var score: Int by mutableStateOf(0)
        private set

    init {
        questions = when (quizType) {
            "general_oop" -> quizDataSource.getGeneralOopQuiz()
            "encapsulation" -> quizDataSource.getEncapsulationQuiz()
            "inheritance" -> quizDataSource.getInheritanceQuiz()
            "polymorphism" -> quizDataSource.getPolymorphismQuiz()
            "abstraction" -> quizDataSource.getAbstractionQuiz()
            else -> emptyList()
        }
        // Now update currentQuestion if the list is not empty
        if (questions.isNotEmpty()) {
            currentQuestion = questions.first()
        }
    }

    val questionNumber: Int
        get() = if (questions.isEmpty()) 0 else currentQuestionIndex + 1

    val questionCount: Int
        get() = questions.size

    val isQuizFinished: Boolean
        get() = if (questions.isEmpty()) true else currentQuestionIndex >= questions.size

    fun onAnswerSelected(index: Int) {
        if (!isAnswerChecked) {
            selectedAnswerIndex = index
        }
    }

    fun onCheckAnswerClicked() {
        if (selectedAnswerIndex != null) {
            if (selectedAnswerIndex == currentQuestion.correctAnswerIndex) {
                score++
            }
            isAnswerChecked = true
        }
    }

    fun onNextClicked() {
        // Prevent advancing if the quiz is already finished
        if (isQuizFinished) return

        currentQuestionIndex++

        if (!isQuizFinished) {
            currentQuestion = questions[currentQuestionIndex]
            selectedAnswerIndex = null
            isAnswerChecked = false
        }
    }
}