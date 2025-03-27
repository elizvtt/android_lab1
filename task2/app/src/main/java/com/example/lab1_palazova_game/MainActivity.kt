package com.example.lab1_palazova_game

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var selectedWord: String = "" // зберігаємо вибране слово
    private lateinit var scrambledWordView: TextView // виведення слова з перемішаними літерами
    private lateinit var userInput: EditText //поле для введення
    private lateinit var checkButton: Button // кнопка для перевірки

    // список слів для гри
    private val wordList = listOf("white", "dress", "table", "music", "green", "candy", "socks")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // встановлюємо макет активності

        // елементи інтерфейсу
        scrambledWordView = findViewById(R.id.textView2)
        userInput = findViewById(R.id.editTextText)
        checkButton = findViewById(R.id.button)

        startNewGame() // запускаємо нову гру

        // обробник для кнопки перевірки відповіді
        checkButton.setOnClickListener {
            val userGuess = userInput.text.toString().trim() // отримуємо введену відповідь користувача
            // перевіряємо, чи відповідає введене слово
            if (userGuess.equals(selectedWord, ignoreCase = true)) {
                // якщо відповідь правильна, виводимо поведомлення та запускаємо нову гру
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                startNewGame()
            } else {
                // якщо ні, виводимо повідомлення про помилку
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
                userInput.text.clear()
            }
        }

        // налаштування відступів для відображення на екрані
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // функція для початку нової гри
    private fun startNewGame() {
        selectedWord = wordList.random() // обирається випадкове слово зі списку
        scrambledWordView.text = scrambleWord(selectedWord) // вивод слова
        userInput.text.clear()
    }

    // функція для перемішування букв у слові
    private fun scrambleWord(word: String): String {
        val letters = word.toCharArray().toMutableList() // слово перетворюється в список символів
        do {
            letters.shuffle() // символи перемішуються
        } while (String(letters.toCharArray()) == word) // перевіряємо щоб літери перемішалися
        return String(letters.toCharArray()) // символи перетворюються назад у рядок
    }
}