package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        val number1 = 10
        val number2 = 0
        val result = number1 / number2
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: Pembagian dengan angka nol.")
    } catch (e: Exception) {
        println("Terjadi kesalahan yang tidak diketahui.")
    }

}