package com.example.aplikasikotlin9

fun main(args: Array<String>) {
    biodata("Elin Akma Pratama", institusi = "Politeknik Negeri Madiun" )
    hobby("Memasak","Memasak merupakan hobi saya sejak libur covid-19. Karena banyaknya aktivitas yang dilakukan di rumah, kegiatan sehari-hari saya adalah memasak. Terkadang masakan saya juga tidak enak, tetapi hal tersebut memacu saya untuk terus belajar. Sampai saat ini hobi saya adalah memasak. Saya memasak setiap hari jika terdapat waktu luang.")
}

fun biodata(nama:String, institusi:String, kelas:String = "2A") {
    println("Nama saya adalah $nama")
    println("Saya merupakan mahasiswa TI dari $institusi")
    println("Saya berada di kelas $kelas")
}

fun hobby(nama:String, desc:String){
    val hobby =
    "hobby = $nama"
    val desc =
    "deskripsi = $desc"

    println(hobby)
    println(desc)
}