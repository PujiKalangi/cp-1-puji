/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.pujigck.kotlin

class User(val char: String, val num: Int) {
    override fun toString(): String {
        return "{$char, $num}"
    }
}

fun main() {
    val list = mutableListOf(User("A", 10), User("C", 20), User( "B", 30))

    list.sortedBy { it.id }
    list.sortedBy { it.char }
    println(list)
}