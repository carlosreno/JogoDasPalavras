package com.example.jogodaspalavras.ui.miniGame.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 1,

    )