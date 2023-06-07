package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Rafie", 23, 175)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge
     *
     */
//    Challenge:
//    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    repeat(5) { hero.jalan() }
    repeat(2) { hero.lari() }
    repeat(3) { hero.makan() }
    repeat(1) { hero.minum() }
    repeat(3) { hero.lompat() }
    repeat(1) { hero.duduk() }
//    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    repeat(2) { hero.jalan() }
    repeat(2) { hero.lari() }
    repeat(1) { hero.makan() }
    repeat(3) { hero.minum() }
    repeat(1) { hero.lompat() }
    repeat(2) { hero.duduk() }
//    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    repeat(3) { hero.jalan() }
    repeat(1) { hero.lari() }
    repeat(5) { hero.makan() }
    repeat(1) { hero.minum() }
    repeat(5) { hero.lompat() }
    repeat(3) { hero.duduk() }
//    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    repeat(5) { hero.jalan() }
    repeat(4) { hero.lari() }
    repeat(4) { hero.makan() }
    repeat(4) { hero.minum() }
    repeat(3) { hero.lompat() }
    repeat(2) { hero.duduk() }
//    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    repeat(4) { hero.jalan() }
    repeat(1) { hero.lari() }
    repeat(3) { hero.makan() }
    repeat(5) { hero.minum() }
    repeat(5) { hero.lompat() }
    repeat(3) { hero.duduk() }
//    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    repeat(2) { hero.jalan() }
    repeat(4) { hero.lari() }
    repeat(2) { hero.makan() }
    repeat(2) { hero.minum() }
    repeat(7) { hero.lompat() }
    repeat(4) { hero.duduk() }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()

}