package com.test.junitpass

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        //Konteks ini digunakan untuk memeriksa packageName aplikasi.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        //Memeriksa apakah packageName dari konteks aplikasi yang sedang diuji adalah "com.test.junitpass".
        assertEquals("com.test.junitpass", appContext.packageName)
    }
}