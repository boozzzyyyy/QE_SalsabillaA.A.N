Resume 
RESTful API Testing with Rest Assured

REST (REpresentational State Transfer) merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web. Umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data.REST adalah salah satu implementasi dari web service yaitu sebuah standar yang digunakan untuk pertukaran data antar aplikasi atau sistem. Biasanya aplikasi atau sistem ini menggunakan bahasa pemrogramman yang berbeda sehingga untuk bisa berkomunikasi satu sama lainnya bisa menggunakan web service ini.

REST API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan-tindakan tertentu pada sebuah database. Jika API adalah penghubung, maka REST yang membuat aturan sesuai keinginan programmer dalam merancang web service. Mudahnya, terdapat request dan response pada data yang dikirimkan ataupun yang diterima. Data yang digunakan dalam REST API umumnya berupa JSON. 

Fundamental API Test Process
1. Record, Define API Information
2. Parsing, Filter or Recording API Data and then extract
3. Reconstruction API calls, and sent them from a simulate client
4. Test Validation

The Practical Test Pyramid
(dari yang paling bawah ke atas)

1. Unit Testing
Unit testing merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah perangkat lunak. Unit testing dilakukan saat masa pengembangan (menuliskan kode program) dari sebuah perangkat lunak oleh si pengembang.
Seperti namanya, komponen yang diuji pada unit testing adalah unit-unit dari perangkat lunak. Unit disini dapat berupa function, method, procedure, module, maupun object.
Tujuan Unit Testing
Tujuan dari unit testing adalah untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.

2. component testing
component testing merupakan jenis pengujian perangkat lunak dimana pengujian dilakukan pada setiap komponen individu secara terpisah tanpa mengintegrasikan dengan komponen lain.
(blackbox testing)
Black Box Testing atau yang sering dikenal dengan sebutan pengujian fungsional merupakan metode pengujian Perangkat Lunak yang digunakan untuk menguji perangkat lunak tanpa mengetahui struktur internal kode atau Program. Dalam pengujian ini, tester menyadari apa yang harus dilakukan oleh program tetapi tidak memiliki pengetahuan tentang bagaimana melakukannya.

3. Integration Testing
Berbeda dengan unit tesing, integration testing adalah pengujian dari hasil pengabungan unit-unit yang ada di dalam software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi sebagai suatu unit yang individual. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error / bug.

4. UI Teting (E2E)
End-to-end testing, sering disingkat E2E, adalah untuk memvalidasi cara kerja aplikasi atau website dari sudut pandang seorang user. Jadi dalam E2E testing kita tulis skrip untuk mensimulasikan behavior atau tindakan-tindakan seorang user — mirip bikin bot.

