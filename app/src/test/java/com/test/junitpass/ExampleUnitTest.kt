package com.test.junitpass

import org.junit.Test

import org.junit.Assert.*

//Kelas ini digunakan untuk menguji unit-unit kecil dalam kode, seperti fungsi atau method
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //Digunakan untuk memeriksa apakah hasil dari operasi penjumlahan 2 + 2 sama dengan 4
        //Jika hasilnya sama, tes akan lulus; jika tidak, tes akan gagal.
        assertEquals(4, 2 + 2)
    }
}