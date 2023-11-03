import org.junit.Test
import org.junit.Assert.*

//Kelas CheckPasswordTest berisi serangkaian tes JUnit untuk menguji kelas CheckPassword

class CheckPasswordTest {

    @Test
    fun testCheckPassword() {
        //Membuat instance dari kelas CheckPassword
        val checkPassword = CheckPassword()
        //Memanggil method isCheckPassword dengan kata sandi "P@ssw0rd" dan memastikan bahwa hasilnya adalah true
        assertTrue(checkPassword.isCheckPassword("P@ssw0rd"))
    }


    @Test
    fun testInvalidPasswordShort() {
        //Membuat instance dari kelas CheckPassword
        val checkPassword = CheckPassword()
        //Memanggil method isCheckPassword dengan kata sandi "Ab1$" yang terlalu pendek dan memastikan bahwa hasilnya adalah false
        assertFalse(checkPassword.isCheckPassword("Ab1$"))
    }


    @Test
    fun testInvalidPasswordNoLetter() {
        //Membuat instance dari kelas CheckPassword
        val checkPassword = CheckPassword()
        //Memanggil method isCheckPassword dengan kata sandi "1234@567" yang tidak mengandung huruf dan memastikan bahwa hasilnya adalah false
        assertFalse(checkPassword.isCheckPassword("1234@567"))
    }


    @Test
    fun testInvalidPasswordNoDigit() {
        //Membuat instance dari kelas CheckPassword
        val checkPassword = CheckPassword()
        //Memanggil method isCheckPassword dengan kata sandi "AbC@defG" yang tidak mengandung digit dan memastikan bahwa hasilnya adalah false
        assertFalse(checkPassword.isCheckPassword("AbC@defG"))
    }

    @Test
    fun testInvalidPasswordNoSpecialChar() {
        //Membuat instance dari kelas CheckPassword
        val checkPassword = CheckPassword()
        //Memanggil method isCheckPassword dengan kata sandi "Password123" yang tidak mengandung karakter khusus dan memastikan bahwa hasilnya adalah false
        assertFalse(checkPassword.isCheckPassword("Password123"))
    }
}
