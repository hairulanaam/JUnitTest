// Kelas CheckPassword digunakan untuk memeriksa apakah sebuah password memenuhi
// kriteria yang ditentukan seperti pada program yaitu
// Password harus memiliki panjang minimal 6 karakter, password harus mengandung minimal satu huruf dan
// satu angka

class CheckPassword {
    fun isCheckPassword(password: String): Boolean {
        //Digunakan untuk memeriksa apakah password memiliki panjang minimal 6 karakter
        if (password.length < 6) {
            //Jika panjang password kurang dari 6 karakter, akan langsung mengembalikan false
            return false
        }

        //Digunakan untuk memeriksa apakah password mengandung huruf
        val containsLetter = password.any { it.isLetter() }

        //Digunakan untuk memeriksa apakah password mengandung angka
        val containsDigit = password.any { it.isDigit() }

        //Digunakan untuk Mengembalikan nilai boolean yang menunjukkan apakah password memenuhi kedua kondisi sebelumnya
        return containsLetter && containsDigit
        //Jika password mengandung minimal satu huruf dan satu angka,
        //maka akan mengembalikan true. Jika tidak, akan mengembalikan false
    }
}
