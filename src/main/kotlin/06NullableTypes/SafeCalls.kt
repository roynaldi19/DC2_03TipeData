package `06NullableTypes`

fun main() {
    val judul: String = "Belajar Kotlin"
    var catatanBuku: String? = null
    var panjangCatatanBuku = catatanBuku?.length
    println("Buku $judul memiliki panjang catatan buku: $panjangCatatanBuku karakter")

    catatanBuku = "Wah, seru ya belajar Kotlin"
    panjangCatatanBuku = catatanBuku?.length
    println("Buku $judul memiliki panjang catatan buku: $panjangCatatanBuku karakter")
}