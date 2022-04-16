RESUME 
FROM MANUAL TO AUTOMATION TESTING

Pada saat mengembangkan software, tentunya kita sering menemukan bug atau error. Untuk meminimalisir adanya bug pada software sebelum diberikan pada pegguna , kita perlu untuk melakukan pengujian pada software. Pengujian dapat dilakukan dengan cara manual testing dan automated testing.

MANUAL TESTING
Pengujian manual adalah pengujian yang dilakukan secara manual oleh QA. Dalam pengujiannya QA memeriksa semua fitur pada software , untuk memastikan ada atau tidaknya bug dalam software. Biasanya pengujian secara manual dilakukan tanpa bantuan dari tools automated test. Manual testing berperan penting saat pengujian visual dimana automation tools tidak dapat melakukan.

KELEBIHAN MANUAL TESTING
1. Mendapatakan Visual Feedback. Tools dan Scripts tidak dapat membantu dalam memberikan opini maupun input mengenai tampilan UI/UX.
2. Unsur manusia. Bisa mendapatkan feedback dari orang secara langsung sehingga mengetahui apa yang user suka dan tidak suka
3. Lebih murah dalam proyek jangka pendek. Jika hanya melakukan tes aplikasi sederhana yang tidak terlalu banyak updates maka manual testing tidak perlu menggunakan tools ataupun software yang mahal.

KEKURANGAN MANUAL TESTING
1. Kurang teliti daripada automation testing. Kadang adanya human error atau ketidaktelitian, sehingga jika menggunakan automation testing akan mengurangi bug yang akan terlewat.
2. Not reusable. Jika menemukan banyaknya perubahan maka harus melakukan pengecekan secara manual kembali dari awal agar memastikan perubahan baru tidak akan merusak aplikasi yang sudah jadi.
3. Kelelahan terhadap tester. Jika QA tester sudah sangat familiar dengan aplikasi yang selalu dia tes secara terus menerus sehingga membuat QA tester sangat memahami alur dari aplikasi tersebut. Sehingga hal ini akan menyebabkan kelelahan dan kesalahan maka melewatkan beberapa hal dan membuat kesalahan.

AUTOMATED TESTING
Automated test bergantung pada pra-scripted tes yang berjalan secara otomatis, fungsinya untuk membandingkan hasil yang diharapkan dengan hasil yang sebenarnya. Sehingga dapat mengetahui apakah aplikasi berjalan sesuai dengan apa yang diharapkan, menggunakan automated testing dapat dilakukan secara berulang. Pada automation testing dibutuhkan tools untuk melakukan pengujiannya,seperti Selenium IDE. automation testing membutuhkan pembuatan skrip pemrograman yang dimaksudkan untuk menggantikan tenaga manusia saat melakukan pengujian sistem aplikasi. Dengan skrip tersebut tahapan pengujian bisa dilakukan dalam satu klik ketika skrip tersebut dijalankan, dan QA hanya tinggal menunggu hasilnya keluar. Hal ini tentu dapat memudahkan waktu kamu dalam bekerja.

KELEBIHAN AUTOMATED TESTING
1. Dapat menemukan bug lebih banyak dari manual tester. Script dapat mencari lebih dalam, sehinga dapat menemukan bug yang tester tidak dapat temukan.
2. Kecepatan dan efisiensi. Script lebih cepat dari tester, sehingga dapat cepat selesai dalam menemukan bug.
3. Test Reusable. Jika selalu mendapatkan update dan perubahan masing-masing unit/feature, maka tidak perlu menulis ulang scripsts setiap saat dan dapat digunakan kembali pada regression testing.

KEKURANGAN AUTOMATED TESTING
1. Lebih Mahal. Karena menggunakan tools maka pengerjaan menggunakan automation testing akan mahal, namun tetap menghemat waktu serta usabilitas.
2. Kurangnya human element. seperti pada info sebelumnya, manual testing memberikan human element untuk dapat melakukan interaksi user dengan aplikasi termasuk secara visual.
3. Tidak adanya feedback mengenai UI. Tanpa adanya human element, maka kita tidak bisa melakukan pengecekan terhadap UI seperti warna, kontras, pemilihan font, dan button size.

ALASAN MENGAPA HARUS MEMAKAI AUTOMATION TESTING
Automation testing adalah cara terbaik untuk meningkatkan efektivitas, cakupan pengujian dan kecepatan dalam melakukan pengujian perangkat lunak.
Pengujian perangkat lunak otomatis penting karena alasan berikut:
1. Pengujian Manual untuk semua alur kerja, semua bidang, semua skenario negatif memakan waktu dan uang
2. Sulit untuk menguji situs multibahasa secara manual
3. Otomasi tidak memerlukan intervensi manusia. Anda dapat menjalankan tes otomatis tanpa pengawasan (semalaman)
4. Otomasi meningkatkan kecepatan eksekusi tes
5. Otomasi membantu meningkatkan Cakupan Tes
6. Pengujian manual dapat menjadi membosankan dan karenanya rentan kesalahan.

Test Case yang akan diotomatisasi dapat dipilih menggunakan kriteria berikut untuk meningkatkan ROI otomasi

a. Risiko Tinggi –Test Case Bisnis Kritis
b. Test Case yang berulang kali dieksekusi
c. Test Case yang sangat membosankan atau sulit dilakukan secara manual
d. Test Case yang memakan waktu

Kategori Test Case berikut tidak cocok untuk otomatisasi:

a. Test Case yang baru dirancang dan tidak dijalankan secara manual setidaknya sekali
b. Test Case yang persyaratannya sering berubah
c. Test Case yang dieksekusi secara ad-hoc.

Proses Pengujian Otomatis:
Langkah-langkah berikut diikuti dalam Proses Otomasi

1. Test Tool Selection
Pemilihan Alat Uji sebagian besar tergantung pada teknologi yang dibangun Aplikasi. Misalnya , QTP tidak mendukung Informatica. Jadi QTP tidak dapat digunakan untuk menguji aplikasi Informatica .

2. Define Scope Of Automation
Lingkup otomatisasi adalah area Aplikasi Anda yang Diuji yang akan otomatis. Poin-poin berikut membantu menentukan ruang lingkup:
a. Fitur-fitur yang penting untuk bisnis
b. Skenario yang memiliki sejumlah besar data
c. Fungsi umum di seluruh aplikasi
d. Kelayakan teknis
e. Sejauh mana komponen bisnis digunakan kembali
f. Kompleksitas kasus uji
g. Kemampuan untuk menggunakan kasus uji yang sama untuk pengujian lintas-browser

3. Planning, Design, and Development
Selama fase ini, Anda membuat strategi & rencana Otomasi, yang berisi perincian berikut-
a. Alat otomatisasi dipilih
b. Desain kerangka kerja dan fitur-fiturnya
c. Item otomatisasi dalam Lingkup dan Di Luar Lingkup
d. Persiapan testbed otomasi
e. Jadwal dan Garis Waktu scripting dan eksekusi
f. Hasil Pengujian Otomasi

4. Test Execution
Script Otomasi dijalankan selama fase ini. Skrip perlu input data uji sebelum ditetapkan untuk dijalankan. Setelah dieksekusi mereka memberikan laporan pengujian terperinci.
Eksekusi dapat dilakukan menggunakan alat otomatisasi secara langsung atau melalui alat Manajemen Uji yang akan memanggil alat otomatisasi.
Contoh: Pusat kualitas adalah alat Manajemen Uji yang pada gilirannya akan meminta QTP untuk pelaksanaan skrip otomatisasi. Script dapat dieksekusi dalam satu mesin atau sekelompok mesin. Eksekusi dapat dilakukan pada malam hari, untuk menghemat waktu.

5. Maintenance
Karena fungsi baru ditambahkan ke Sistem Diuji dengan siklus berturut-turut, Otomasi Script perlu ditambahkan, ditinjau dan dipelihara untuk setiap siklus rilis. Pemeliharaan menjadi perlu untuk meningkatkan efektivitas Script Otomasi.

AUTOMATION BEST PRACTICES
Untuk mendapatkan ROI otomatisasi maksimum, perhatikan hal berikut

a. Lingkup Otomasi perlu ditentukan secara rinci sebelum dimulainya proyek. Ini menetapkan harapan dari Otomasi dengan benar.
b. Pilih alat otomatisasi yang tepat: Alat tidak boleh dipilih berdasarkan popularitasnya, tetapi cocok dengan persyaratan otomatisasi.
c. Pilih kerangka kerja yang sesuai
d. Standar Scripting- Standar harus diikuti saat menulis skrip untuk Otomasi. Beberapa macamnya adalah-
	1.Buat skrip, komentar, dan kode yang seragam
	2. Penanganan Pengecualian yang Memadai – Bagaimana kesalahan ditangani pada kegagalan sistem atau perilaku aplikasi yang tidak terduga.
	3. Pesan yang ditentukan pengguna harus diberi kode atau standar untuk Kesalahan Logging agar dipahami penguji.
e. Ukur metrik – Keberhasilan otomatisasi tidak dapat ditentukan dengan membandingkan upaya manual dengan upaya otomatisasi tetapi dengan juga menangkap metrik berikut.
	1. Persentase cacat yang ditemukan
	2. Waktu yang diperlukan untuk pengujian otomasi untuk setiap siklus rilis
	3. Waktu Minimal diambil untuk rilis
	4. Indeks Kepuasan Pelanggan
	5. Peningkatan produktivitas