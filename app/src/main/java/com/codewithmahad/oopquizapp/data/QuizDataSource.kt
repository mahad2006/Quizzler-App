package com.codewithmahad.oopquizapp.data

interface QuizDataSource {
    fun getGeneralOopQuiz(): List<Question>
    fun getEncapsulationQuiz(): List<Question>
    fun getInheritanceQuiz(): List<Question>
    fun getPolymorphismQuiz(): List<Question>
    fun getAbstractionQuiz(): List<Question>
}