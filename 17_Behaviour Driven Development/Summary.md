RESUME
BEHAVIOUR DRIVEN DEVELOPMENT

Kita mungkin sudah cukup sering mendengar istilah Test-Driven Development (TDD). TDD merupakan proses software development yang menerapkan penulisan test cases sebelum pengembang menuliskan production code. Proses TDD sendiri berfokus kepada komponen-komponen dalam sistem, dan test cases ditulis dalam bahasa pemograman.
Serupa dengan Test-Driven Development (TDD), Behavior-Driven Development (BDD) juga menerapkan konsep test-first, namun dengan fokus yang berbeda. Dalam BDD test, tim pengembang akan menuliskan berbagai skenario yang menjelaskan behavior sistem dari perspektif pengguna. Skenario dituliskan menggunakan format bahasa yang mudah dipahami oleh seluruh stakeholder dalam pengembangan sistem.

BDD memiliki tujuan utama untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholders — tim bisnis maupun teknikal — yang terlibat dalam pengembangan sistem. Hal ini dapat membantu memastikan bahwa:
1. Fitur-fitur dalam sistem dapat dipahami dengan baik oleh seluruh anggota tim. Komunikasi yang baik dapat menyatukan persepsi stakeholders yang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama.
2. Fitur-fitur dalam sistem dapat memenuhi kebutuhan pengguna dan menghasilkan business value.

Prinsip dasar dari BDD adalah mendeskripsikan behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci. Terdapat pemisahan antara keduanya.Dalam pendekatan BDD, seluruh stakeholders (technical & non-technical) saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional (behavior) sistem, yang dituliskan melalui feature files. Deskripsi yang ada dalam feature files berperan sebagai test logic, yang kemudian akan menjadi dasar bagi Quality Assurance (QA) dalam menuliskan test script untuk implementasi pengujian, dan dasar bagi developer dalam menuliskan implementation code untuk membangun sistem.

Feature files pada BDD dituliskan menggunakan bahasa Gherkin, dengan format berbahasa Inggris yang mudah dipahami oleh siapa pun — terlepas dari technical knowledge yang dimiliki. Dengan demikian, non-technical stakeholders dapat tetap memahami test logic tanpa perlu memahami implementasi menggunakan kode pemrograman yang lebih kompleks. Begitu pula sebaliknya, technical stakeholders atau developer dapat turut memahami aspek bisnis dari sistem yang mereka implementasikan.

Secara mendasar, terdapat tiga tahapan untuk melakukan test dalam BDD:
Tahap 1 — Menentukan user stories; untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
Tahap 2 — Menuliskan skenario (dalam feature files, menggunakan Gherkin) berdasarkan user stories
Tahap 3 — Mengimplementasikan test script (dalam step files) berdasarkan skenario

CONTOH

User story memiliki format standar:

“As a <role>, I want to <need/goal>, so that <why>.”

Dalam menjelaskan kebutuhan pengguna untuk log in dalam suatu akun, user story yang terbentuk adalah:

“As an existing user, I want to log into my account, so that I can see my home page.”

Selanjutnya, user story dituliskan dalam skenario. Sebuah feature file terdiri dari satu atau lebih skenario yang menjelaskan apa yang seharusnya dilakukan oleh sistem dalam situasi tertentu. Terdapat 3 keyword sebagai elemen utama dalam skenario BDD:

1. Given — menjelaskan konteks dari skenario
2. When — menjelaskan tindakan yang dilakukan oleh user
3. Then — menjelaskan outcome dari tindakan yang dilakukan oleh user

Kita juga dapat menggunakan keyword lainnya seperti And, But, Background, Scenario Outline, dan Examples. Silakan baca referensi berikut untuk memahami penggunaan berbagai keyword dalam bahasa Gherkin.

Berikut adalah contoh sederhana dari penulisan skenario menggunakan bahasa Gherkin untuk log in dalam suatu akun.

-Feature: Log in
-Scenario: Logging in as an existing user
-Given I go to my application's log in page
-When I fill in correct username and password
-And I click Log In
-Then I see my home page

Skenario dalam feature file tersebut kemudian akan digunakan sebagai panduan untuk mengimplementasikan test script — yang disebut dengan steps dalam BDD.

Cucumber
Untuk melakukan serangkaian behaviour test, ada sebuah tool yang disebut Cucumber. Cucumber adalah sebuah tool yang mendukung BDD.
Cucumber membaca semacam ketentuan yang dapat dieksekusi, dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut. Ketentuan tersebut terdiri dari beberapa skenario.
Cucumber adalah sofware yang digunakan oleh programmer untuk menguji software lainnya. Cucumber menjalankan tes penerimaan otomatis yang ditulis dalam behavior-driven development (BDD). Dengan menggunakan bahasa Gherkin, cucumber memungkinkan software behavior dispesifikasikan dalam bahasa logis yang dapat dipahami oleh customer. Tes cucumber dibagi menjadi beberapa fitur-fitur dan fitur-fitur ini dibagi menjadi beberapa skenario, yang merupakan urutan tahapan testing. Sebelum cucumber dapat melakukan tahapan-tahapan tesebut, tahapan tersebut harus didefinisikan terlebih dahulu melalui definisi tahapan, bagaimana tahapan itu harus dilakukan.

THE STEP OVERVIEW BDD WITH CUCUMBER

1. WRITE STORY
(Gherkin Syntax Given, When, Than)
2. Map Steps to Java
(Configure steps script and validation)
3. Configure Stories
(Combine Stories and Steps)
4. Run Stories
(Intelij IDEA, Maven)
5. View Reports