RESUME
Review Web UI Testing with Serenity

Web automation testing ini adalah suatu cara yang digunakan untuk melakukan testing terhadap web yang dibuat, biasanya,ini adalah pekerjaan para QA tp belakangan ini beberapa pihak memanfaatkan ini untuk melakukan kegiatan automasi lainnya diluar testing. gimana sih cara kerjanya ? cara kerjanya adalah seperti layaknya manusia yang melakukan kegiatan disuatu website. contohnya agar dapat menggunakan twitter maka harus melakukan registrasi terlebih dahulu. para QA memastikan apa yang dikerjakan oleh software engineer sudah benar dan tidak ada lagi miss dalam berbagai hal tersebut, makanya dibuatlah automation testing ini.

kerennya web automation testing ini dikerjakan terpisah dengan unit test dari developer jadi QA tidak tergantung kepada base code apa yang digunakan oleh developer, ya walaupun sebenarnya developer juga harus melakukan instrument testing dan function testing, maksudnya developer wajib memastikan bahwa code yang mereka buat itu sudah diuji coba berdasarkan function testing yang dibuat dan instument testing.

INTRODUCTION SERENITY BDD
Serenity BDD merupakan library open source yang membantu tester dalam menulis automation acceptance test
yang terstruktur dan lebih terawat dengan baik dan juga menghasilkan laporan pengujian yang kaya makna (yang biasa dikenal dengan istilah “living documentation” atau dokumentasi hidup) yang tidak hanya melaporkan pada hasil
pengujian, tetapi juga fitur apa yang telah diuji.

Katalon Studio merupakan salah satu tool yang umum digunakan untuk melakukan automated testing. Katalon Studio mendukung Cucumber extension dan bahasa Gherkin, yang didesain untuk mempermudah implementasi BDD testing.

Secara singkat, terdapat 7 langkah untuk menjalankan BDD automated web-testing menggunakan Katalon Studio:
a.Create a new project in Katalon Studio
b.Create a feature file
c.Create a step file
d.Record a test scenario
e.Add test scripts to step file
e.Run feature file
f.Run test suite to create test reports

Serenity BDD memiliki arsitektur sebagai
berikut:
a. pages
b. steps
c. test
d. requirement
e. report

JBehave is a Behaviour Driven Development framework. It intends to provide an intuitive and accessible way for automated acceptance testing.

If you're not familiar with BDD, it's a good idea to start with this article, covering on another BDD testing framework – Cucumber, in which we're introducing the general BDD structure and features.

Similar to other BDD frameworks, JBehave adopts the following concepts:

Story – represents an automatically executable increment of business functionality, comprises one or more scenarios
Scenarios – represent concrete examples of the behavior of the system
Steps – represent actual behavior using classic BDD keywords: Given, When and Then

