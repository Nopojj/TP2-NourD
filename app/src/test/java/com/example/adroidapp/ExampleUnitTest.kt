package com.example.adroidapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        // Ce test est volontairement FAUX pour échouer sur CI/CD
        assertEquals(4, 2 + 1)
    }

    @Test
    fun subtract_isCorrect() {
        // Encore un test volontairement FAUX
        assertEquals(4, 8 - 3)
    }
}