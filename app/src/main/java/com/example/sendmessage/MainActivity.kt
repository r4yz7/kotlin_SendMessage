package com.example.sendmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextMessage: EditText
    private lateinit var buttonSend: Button
    private lateinit var textViewChat: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextMessage = findViewById(R.id.editTextMessage)
        buttonSend = findViewById(R.id.buttonSend)
        textViewChat = findViewById(R.id.textViewChat)

        buttonSend.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        val message = editTextMessage.text.toString().trim()

        if (message.isNotEmpty()) {
            val currentChat = textViewChat.text.toString()
            val newChat = "$currentChat\n$message"
            textViewChat.text = newChat
            editTextMessage.text.clear()
        }
    }
}