package `06NullableTypes`

fun main() {
    val judul: String = "Belajar Kotlin"
    var catatanBuku: String? = null
    var panjangCatatanBuku = catatanBuku?.length ?: 0
    println("Buku $judul memiliki panjang $panjangCatatanBuku")
}