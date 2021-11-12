# Pizza-PPL-B3

## Soal 
Dalam soal ini, kami diberi tugas untuk membuat implementasi program berorientasi objek, dimana didalamnya dapat dibuat beberapa pizza dengan topping yang berbeda.

Misalnya  :
Pizza 1 dengan topping cheese dan mozarella, sedangkan pizza 2 menggunakan toping beef, mushroom, dan cheese

## Jawab
Untuk menjawab soal ini, kami menggunakan bahasa pemrograman Java, yang memang sebelumnya sudah diajarkan di semester 3.
Dalam code ini, kami tidak hanya membuat program sehingga dapat membuat pizza yang memiliki toping yang berbeda, namun kita juga membuat pizza yang dapat memiliki adonan, topping, harga, dan GUI sederhana, sehingga dapat diaplikasikan secara lebih mudah.

Berikut ini adalah diagram class yang telah dibuat

![image](https://user-images.githubusercontent.com/36225278/141466992-eda4bcb2-ce36-4509-b04d-e6505258f2e1.png)

Disini terdapat beberapa kelas yang saling berhubungan, yaitu ada 
1. **PizzaBase** untuk membuat pizza baru yang memiliki base (adonan) yang berbeda, dapat dibuat dalam berbagai adonan tepung 
2. **Topping** untuk membuat pizza baru yang memiliki topping yang berbeda, selain mengatur topping, juga dapat diatur tingkat kepedasan topping
3. **PizzaInterface** berisi urutan-urutan mengenai urutan tampilan yang nantinya akan muncul dalam GUI suatu program yang telah kita buat
4. **PizzaDashboard** berisi GUI yang akan memanggil berbagai kelas lain untuk membuat pizza yang baru berdasarkan adonan dan topping dari pizza yang akan kita buat

Berikut ini adalah tampilan dari PizzaDashboard apabila kita jalankan
![image](https://user-images.githubusercontent.com/36225278/141469605-3f4bfce1-c153-4fda-8ad5-d8cd599730f3.png)

Tampak disana, apabila kita dapat melakukan beberapa perintah, yaitu memasukkan pizza baru, mengupdate harga pizza, dan menghapus pizza yang sudah ada.
