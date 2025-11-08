package com.codewithmahad.oopquizapp.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.codewithmahad.oopquizapp.viewmodel.QuizViewModel
import com.codewithmahad.oopquizapp.viewmodel.QuizViewModelFactory

private val CorrectColor = Color(0xFF4CAF50) // Green
private val WrongColor = Color(0xFFF44336)   // Red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    quizType: String,
    language: String,
    onQuizFinished: (Int, Int) -> Unit,
    onNavigateBack: () -> Unit,
    viewModel: QuizViewModel = viewModel(factory = QuizViewModelFactory(quizType, language))
) {
    val progress = viewModel.questionNumber.toFloat() / viewModel.questionCount.toFloat()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        text = quizType.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() },
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    titleContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    navigationIconContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()) // Added for scrolling
        ) {
            // --- Progress Bar ---
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.primary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )

            // --- Content Section ---
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                if (!viewModel.isQuizFinished) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp),
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Question ${viewModel.questionNumber} / ${viewModel.questionCount}",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = viewModel.currentQuestion.text,
                                style = MaterialTheme.typography.headlineMedium,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(min = 100.dp),
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    LazyColumn(
                        modifier = Modifier
                            .heightIn(max = 400.dp) // Limit the height of the LazyColumn
                            .padding(top = 16.dp),
                        contentPadding = PaddingValues(vertical = 8.dp)
                    ) {
                        itemsIndexed(viewModel.currentQuestion.options) { index, optionText ->
                            AnswerButton(
                                text = optionText,
                                isSelected = (viewModel.selectedAnswerIndex == index),
                                isAnswerChecked = viewModel.isAnswerChecked,
                                isCorrect = (index == viewModel.currentQuestion.correctAnswerIndex),
                                onClick = { viewModel.onAnswerSelected(index) }
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                        }
                    }
                }

                Button(
                    onClick = {
                        if (viewModel.isAnswerChecked) {
                            viewModel.onNextClicked() 
                            if (viewModel.isQuizFinished) {
                                onQuizFinished(viewModel.score, viewModel.questionCount)
                            }
                        } else {
                            viewModel.onCheckAnswerClicked()
                        }
                    },
                    enabled = viewModel.selectedAnswerIndex != null || viewModel.isAnswerChecked,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = when {
                            viewModel.isAnswerChecked && !viewModel.isQuizFinished -> "Next"
                            viewModel.isQuizFinished -> "Finish"
                            else -> "Check Answer"
                        },
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}


@Composable
private fun AnswerButton(
    text: String,
    isSelected: Boolean,
    isAnswerChecked: Boolean,
    isCorrect: Boolean,
    onClick: () -> Unit
) {
    val buttonColor by animateColorAsState(
        targetValue = when {
            !isAnswerChecked && isSelected -> MaterialTheme.colorScheme.primaryContainer
            isAnswerChecked && isCorrect -> CorrectColor.copy(alpha = 0.3f)
            isAnswerChecked && isSelected && !isCorrect -> WrongColor.copy(alpha = 0.3f)
            else -> MaterialTheme.colorScheme.surfaceVariant
        },
        animationSpec = tween(durationMillis = 300)
    )

    val contentColor by animateColorAsState(
        targetValue = when {
            !isAnswerChecked && isSelected -> MaterialTheme.colorScheme.onPrimaryContainer
            isAnswerChecked && isCorrect -> CorrectColor
            isAnswerChecked && isSelected && !isCorrect -> WrongColor
            else -> MaterialTheme.colorScheme.onSurfaceVariant
        },
        animationSpec = tween(durationMillis = 300)
    )

    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor,
            contentColor = contentColor,
            disabledContainerColor = buttonColor,
            disabledContentColor = contentColor
        ),
        enabled = !isAnswerChecked
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text,
                modifier = Modifier.weight(1f),
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            if (isAnswerChecked) {
                if (isCorrect) {
                    Icon(Icons.Default.Check, contentDescription = "Correct Answer", tint = CorrectColor)
                } else if (isSelected) {
                    Icon(Icons.Default.Close, contentDescription = "Wrong Answer", tint = WrongColor)
                }
            }
        }
    }
}