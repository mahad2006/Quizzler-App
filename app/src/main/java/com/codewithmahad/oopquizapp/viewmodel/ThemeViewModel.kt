package com.codewithmahad.oopquizapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ThemeViewModel : ViewModel() {
    val isDarkTheme = mutableStateOf(false)
    val selectedLanguage = mutableStateOf("java_kotlin")

    fun toggleTheme() {
        isDarkTheme.value = !isDarkTheme.value
    }

    fun selectLanguage(language: String) {
        selectedLanguage.value = language
    }
}