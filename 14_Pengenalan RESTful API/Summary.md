RESUME
Pengenalan RESTful API

1. Application Programming Interface (API)
API memungkinkan komunikasi dan perturakaran data antara 2 atau lebih software/sistem yang terpisah. Tujuan API adalah mempercepat proses development dengan menyediakan function secara terpisah, sehingga developer tidak membuat fitur yang serupa. API berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahukan sistem apa yang harus dilakukan, lalu memberi respon sesuai permintaan.

2. Representational State Transfer (REST)
REST API merupakan standart arsitektur komunikasi berbasis web. Umumnya menggunakan HTTP method sebagai protokol untuk komunikasi data. REST juga merupakan salah satu implementasi web service sebagai standar digunakan sebagai pertukaran data antara aplikasi maupun sistem. REST API berisi aturan yang dapat membatasi programmer untuk melakukan tindakan-tindakan tertentu pada sebuah database. API merupakan penghubunganya, sedangkan REST sebagai membuat aturan sesuai programmer dalam merancang web service. Terdapat request dan response pada data yang dikirimkan ataupun diterima.

3. HTTP method
Dirancang untuk memungkinkan komunikasi antar client dan server. 4 method: get, put, post, dan delete.
-Get digunakan untuk mengambil informasi tentang resource yang sudah ditentukan oleh URL. Get digunakan untuk membaca data.
-Post digunakan untuk mengirimkan data baru ke server.
-Put digunakan untuk mengirim data ke server untuk membuat maupun memperbaiki ke resource.
-Delete digunakan untuk menghapus resource yang telah ditentukan.

4. REST API Component
-Method
-URL (Base URL + Path) adalah cara untuk mendapat request. Terdiri dari kata kunci server.
-Header adalah kumpulan feed dan value yang terkait tentang pemberian informasi yang memberi tahu bahwa pesan tersebut sah.
-Body Request body mendefinisikan parameter apa yang dikirimkan ke server. Menginfromasikan data yang diupdate, diubah, maupun dihapus.

5. Java Script Obejct Notation (JSON)
JSON adalah sebuah format data yang digunakan untuk pertukaran dan penyimpanan data. JSON adalah bagin dari JavaScript. JSON juga dapat berbagai bahasa, seperti C, C++, dan lain-lain. Sehingga, JSON merupakan ideal antar aplikasi.

6. HTTP Response Code
-200 : request yang dikirim berarti sukses.
-201 : request yang dikririm berarti sukses, dan resourcenya berhasil dibuat. Biasanya response code ini menggunakan method post dan put.
-400 : terjadi jika melakukan request post dan put, kemudian datanya tidak sesuai dengan yang diharapkan ataupun ada salah dalam formatnya.
-404 : resource yang diperlukan tidak ditemukan.
-401 : tidak melakukan auntentifikasi terlebih dahulu sebelum melakukan request.
-405 : HTTP method yang digunakan salah.
-500 : error karena ada kesalahan di server (internal).

API Testing
Tes yang dilakukan dimana API yang digunakan berfungsi. API Testing diharapkan bisa merespon aplikasi web sebelum GUI siap. Bertujuan untuk melakukan testing sedini mungkin.

Macam-macam API Testing
-Functionality : memvalidasikan suatu fitur sudah berjalan sebagaimana semestinya.
-Load Test : menguji kekuatan suatu sistem dari data yang diberikan.
-Security : memiliki tujuan untuk menguji keamanan dari suatu sistem.

API Testing Tools
-frisby.jd
-Apache JMeter
-Postman
-REST-assured

Perbedaan antara API Test dan Unit Test
1. Unit Test:
-Dilakukan oleh Developer
-fungsi-fungsi terpisah
-Developer dapat mengakses source code
-Hanya dasar functionality yang di test
-Scopenya terbatas
-Dilakukan sebelum build.

API Test:
-Dilakukan oleh Software Tester.
-Fungsi-fungsi tidak terpisah.
-Tidak bisa mengakses source code.
-End to End.
-Semua functional issue.
S-copenya lebih luas.
-Dilakukan setelah build.

Proses API Testing
-Specification Review : bertujuan untuk mereview spesifikasi API.
-Spesification Review : memastikan tentang detail document mengenai test scenario dan ekspektasi hasilnya pada setiap Test Case.
-Framework Development : Memilih untuk memakai tools dalam API Testing nantinya.
-Test Case Development : membuat Test Scenario.
-Execution & Report : mengeksekusi Test Scenario yang sudah dibuat dan kemudian membuat laporannya (report) untuk hasil dari testing yang sudah dilakukan.

Test Cases for API Testing
-Mendapatkan response yang sesuai dengan inputan.
-Apakah memberikan feedback atau tidak.
-Apakah mengganggu fitur yang lain atau tidak.
-Update struktur data.
-Memodifikasi data yang ada.

Best Practice of API Testing
-Kelompokkan test case kedalam beberapa kategori.
-Beri judul yang sesuai pada setiap test.
-Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
-Ketika membuat test case, harus dipikirkan segala kombinasi input pada API.

Types of Output of an API
-Dapat berbentuk apa saja, pada umumnya JSON atau XML.
-Status response apakah Passed atau Fail.
-Memanggil fungsi API lain.

Common Types of Test in API Testing
-Memverifikasi apakah kita mendapat respon dari API.
-Memverifikasi apakah hasil input/request sudah sesuai atau belum.
-Memverifikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah.
-Memverifikasi waktu response yang diberikan.

Type of Bugs that API Testing Detects
-Gagal melakukan error handling pada keadaan tertentu.
-Kesulitan untuk tersembung dan mendapat respon API.
-Isu keamanan.
-Performance Issues.
-Error atau warning yang tidak tepat.
-Struktur dari data respon tidak benar (JSON & XML).

Manfaat API Testing
-Efisiensi waktu
-Bahasa yang independen
-Mengurangi biaya testing
-Mengurangi resiko

Tantangan dalam API Testing
-Kombinasi parameter, pemilihan parameter
-Tidak ada GUI
-Kita harus mengetahui terlebih dahulu parameter
-Perlu mengetest error handling dari setiap API

Kesimpulan
API terdiri dari kumpulan class/function/prosedur yang mereprsentasikan bisnis logic. Jika API tidak di test dengan baik, itu dapat mengakibatkan masalah yang tidak hanya pada aplikasi API saja, tetapi juga pada aplikasinya. API Testing sangat diperlukan dalam software engineering.