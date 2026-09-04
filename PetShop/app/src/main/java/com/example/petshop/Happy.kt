package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun obtainMood(): String {
        return "Happy"
    }
}