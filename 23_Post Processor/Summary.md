RESUME
Post Processor

Performance Test merupakan teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban (load) kerja. Performance Test berfungsi untuk mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan 
(reliability) , dan penggunaan sumber daya.

Apa Yang Diukur Dari Performance Test?
1. performa suatu aplikasi sampai suatu batas tertentu
2. bukan merupakan functional test
3.bisa dalam berbagai macam bentuk untuk memahami reliability, stability, dan availability pada environtment-nya.

Alasan Performance Test jarang dilakukan yaitu karena Performance Test cukup mahal namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. tes tersebut mahal karena butuh adanya persiapan yang dimana beberapa kasus harus membuat environtment terpisah dari production agar tidak tercampurnya data test dengan data production.

Dalam melakukan Performance Test yang perlu diperhatikan dari performance test adalah throughput dan response data

Tipe performance test
1. load test 
Loading test berfungsi untuk menentukan kelakuan sistem pada saat kondisi normal dan puncak, sehingga kita dapat mengetahui jumlah traffic yang ada di production sebagai nilai di load test.
2. endurance test
Endurance testing dimana kita akan melakukan tes dengan load yang normal, namun dalam waktu yang panjang. Tujuannya untuk melakukan analisa dan evaluasi behaviour sistem kita. Biasanya digunakan untuk mengetahui apakah sistem akan mengalami memory leaks pada penggunaan jangka panjang.
3. stress test mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. dilakukan bertahap menuju load normal, puncak, dan melebihinya. lalu turun untuk melihat proses recovery
4. peak test
Pengujian beban puncak yang menempatkan beban pada server untuk waktu yang singkat untuk meniru permintaan terberat yang akan dihasilkan pada waktu pengguna puncak.