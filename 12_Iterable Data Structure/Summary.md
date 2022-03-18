RESUME
Iterable Data Structure

iterable adalah sebuah objek yang dapat diiterasi. Dapat diiterasi maksudnya elemen dari objek dari diakses melalui perulangan karena Iterable object adalah koleksi atau kumpulan dari objek lain. Iterable object dalam Python : string, list, tuple, dictionary, set, frozenset.Iterable adalah struktur data yang menyediakan mekanisme untuk memungkinkan konsumen data lain mengakses elemennya secara publik secara berurutan. Bayangkan struktur data yang dikemas sendiri yang membongkar data satu per satu secara berurutan saat dimasukkan ke dalam for...ofloop.

JavaScript mendukung protokol di mana objek seperti array dapat digunakan oleh struktur kontrol seperti for…of dan operator spread ...untuk mengulang data secara berurutan. Ini disebut sebagai iterable dan struktur data yang mendukung fungsi ini disebut iterables. Sementara JavaScript menyediakan peta, larik, dan set dengan properti yang dapat diubah sejak awal, objek biasa tidak memiliki ini secara default.
Konsep protokol yang dapat diubah dapat dibagi menjadi:bisa diubah(struktur data itu sendiri) danpembuat ulang(semacam pointer yang bergerak di atas iterable). Mari kita pertimbangkan sebuah array misalnya, ketika array digunakan dalam satu for...oflingkaran, properti iterable disebut yang mengembalikan sebuah iterator. Properti yang dapat diubah ini diberi namespace sebagai Symbol.iteratordan objek yang dikembalikannya dapat digunakan pada antarmuka umum yang digunakan bersama oleh semua struktur kontrol perulangan.

Di satu sisi, Symbol.iteratordapat dibandingkan dengan pabrik iterator yang menghasilkan iterator setiap kali struktur data ditempatkan dalam satu lingkaran.


