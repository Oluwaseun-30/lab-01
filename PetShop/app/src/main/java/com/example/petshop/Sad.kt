package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun obtainMood(): String {
        return "Sad"
    }
}