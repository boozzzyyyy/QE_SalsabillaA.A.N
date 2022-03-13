RESUME
OBJECT ORIENTED PROGRAMMING

Object Oriented Programming (OOP) merupakan suatu metode pemrograman yang berorientasi kepada objek. Dalam bahasa Indonesia OOP dikenal dengan PBO (Pemrograman Berorientasi Objek). OOP bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang  dibungkus ke dalam objek ataupun class. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program.

Mengapa Harus OOP?
Seperti yang kamu ketahui sebelumnya, programmer harus mampu meminimalisir program dan membuatnya tertata rapi. Selain itu juga untuk mempercepat pembuatan aplikasi. Lalu, bukannya kamu bisa bikin program dengan prosedural saja? Iya, tentu bisa. Masalahnya, kalau programnya semakin besar maupun kompleks maka tu semua akan membuat kodemu sulit  di-maintenance.Sebab teknik prosedural identik dengan menggabungkan seluruh kode. Bayangkan jika kamu membuat program sebesar GOJEK dengan teknik prosedural, kamu akan kesulitan untuk memodifikasi kode program tersebut. Malah akan dibuat pusing jika seluruh program disatukan tanpa mengorganisasikan kode program. Nah, itulah alasan mengapa kamu harus menggunakan teknik OOP. 

Berikut merupakan komponen OOP yang penting untuk kamu pelajari.
1. Class dan Object
Class bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. Class merupakan blueprint dari sebuah objek atau cetakan untuk membuat objek.Class akan merepresentasikan objek yang mau dibuat. Jadi dalam membuat nama kelas harus disesuaikan dengan objek yang akan dibuat. Penulisan nama class memiliki aturan. Yakni dengan format PascalCase. Apa itu? Penulisannya diiawali dengan huruf kapital. Jika nama variabel tersusun dari dua kata atau lebih maka tidak perlu diberi spasi di antaranya dan diawali dengan huruf kapital pula.
Misal: class MakananKucing, class Senjata, dan class SignIn.
Sedangkan object adalah sebuah variabel instance yang merupakan wujud dari class. Instance merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan variable dan method.
Class berisi dari beberapa kumpulan definisi variabel dan fungsi yang menggambarkan sebuah objek. Ok, apakah teman-teman sudah mulai paham? Tidak hanya terdiri dari class, OOP juga terdiri dari beberapa elemen penyusun lainnya seperti attribute, method, inheritance dsb.

2. Atribut merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau properties dari sebuah class. Contohnya ketika kamu punya sebuah class Motor, maka kamu dapat menambahkan atribut seperti kecepatan motor, umur motor, ukuran, ban, warna dsb. Penggunaan atribut berlaku dari kurung kurawal awal ({) sampai dengan sebelum kurung kurawal akhir (}). Ini dinamakan scope. Untuk penulisannya menggunakan format lowerCamelCase. Jadi untuk kata pertama diawali dengan huruf kecil, sedangkan kata selanjutnya diawali dengan huruf kapital. Sama seperti PascalCase, penggunaan spasi tidak diperkenankan ketika menghubungkan dua kata atau lebih dari sebuah nama properti.
Contohnya length, width, apple, speed, listMovies, dll.

3.Method berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (behavior) yang dapat digambarkan oleh suatu method. Misal class Manusia. Manusia tentu memiliki method berupa tingkah laku, seperti berpikir, berjalan, berbicara, makan dll. Maka tentunya method dapat disesuaikan dengan program yang dibuat.

4.Inheritance adalah hubungan antara dua objek atau lebih. Di mana terdapat sebuah objek utama yang mewariskan attribute maupun method yang dimilikinya kepada objek lainnya, baik itu sebagian maupun keseluruhan.
Contohnya seekor anak kucing berjenis mamalia, mewarisi sifat dan juga bentuk fisik orang tuanya, seperti bulu, mata, telinga, bahkan suaranya.

Apa saja bahasa pemrograman yang mendukung konsep OOP?
Adapun untuk contoh untuk bahasa pemrograman yang berbasis OOP ini adalah seperti Java, C++, Pascal, Simula, Python, Php, dan sebagainya. Itulah konsep bahasa pemrograman berbasis Object Oriented Programming atau OOP.

Konsep OOP
a. Abstrak Class
Kelas merupakan deskripsi abstrak informasi dan tingkah laku dari sekumpulan data.
Kelas dapat diilustrasikan sebagai suatu cetak biru(blueprint) atau prototipe yang digunakan untuk menciptakan objek.
Kelas merupakan tipe data bagi objek yang mengenkapsulasi data dan operasi pada data dalam suatu unit tunggal.
Kelas mendefinisikan suatu struktur yang terdiri atas data kelas (data field), prosedur atau fungsi (method), dan sifat kelas (property).

b. Encapsulation
Istilah enkapsulasi sebenarnya adalah kombinasi data dan fungsionalitas dalam sebuah unit tunggal sebagai bentuk untuk menyembunyikan detail informasi.
Proses enkapsulasi memudahkan kita untuk menggunakan sebuah objek dari suatu kelas karena kita tidak perlu mengetahui segala hal secara rinci.
Enkapsulasi menekankan pada antarmuka suatu kelas, atau dengan kata lain bagaimana menggunakan objek kelas tertentu.
Contoh: kelas mobil menyediakan antarmuka fungsi untuk menjalankan mobil tersebut, tanpa kita perlu tahu komposisi bahan bakar, udara dan kalor yang diperlukan untuk proses tersebut.

c.Inheritance
Kita dapat mendefinisikan suatu kelas baru dengan mewarisi sifat dari kelas lain yang sudah ada.
Penurunan sifat ini bisa dilakukan secara bertingkattingkat, sehingga semakin ke bawah kelas tersebut menjadi semakin spesifik.
Sub kelas memungkinkan kita untuk melakukan spesifikasi detail dan perilaku khusus dari kelas supernya.
Dengan konsep pewarisan, seorang programmer dapat menggunakan kode yang telah ditulisnya pada kelas super berulang kali pada kelas-kelas turunannya tanpa harus menulis ulang semua kodekode itu.

d.Polymorphism
Polimorfisme merupakan kemampuan objekobjek yang berbeda kelas namun terkait dalam pewarisan untuk merespon secara berbeda terhadap suatu pesan yang sama.
Polimorfisme juga dapat dikatakan kemampuan sebuah objek untuk memutuskan method mana yang akan diterapkan padanya, tergantung letak objek tersebut pada jenjang pewarisan.
Method overriding.
Method name overloading.