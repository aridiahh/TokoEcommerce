# TUGAS 2 PEMROGRAMAN BERORENTASI OBYEK - PEMBUATAN BACKEND API UNTUK APLIKASI E-COMMERCE SEDERHANA
TokoEcommerce merupakan tugas yang dirancang untuk dapat memenuhi tugas kedua dari mata kuliah `Pemrograman Berorientasi Obyek`. Pembuatan tugas kedua ini dilaksanakan secara individu atas nama `Ni Kadek Ari Diah Lestari` dengan NIM `2205551069`. Tugas ini mengenai tentang `Pembuatan Backend API untuk Aplikasi E-Commerce Sederhana`. Backend berperan penting dalam menjembatani antara aplikasi frontend dan database dalam sebuah sistem. Dalam pembuatan backend, server akan menangani permintaan dari aplikasi frontend dan memberikan respons yang sesuai serta bertanggung jawab dalam berkomunikasi dengan database untuk menyimpan dan mengambil data yang diperlukan. Tipe permintaan yang dimaksud disini meliputi `GET`, `POST`, `PUT`, dan `DELETE`. Pembuatan backend API ini memiliki ketentuan-ketentuan yang telah ditentukan, berikut diantaranya.
1.	Menggunakan request method pada API serta struktur tabel database yang telah ditentukan. 
2.	Body pada request POST dan PUT serta response yang diberikan oleh server API menggunakan format JSON.
3.	Otorisasi akses API menggunakan API key yg di set melalui ENV variable. 
4.	Data disimpan pada database SQLite, 
5.	Pengujian API menggunakan aplikasi Postman.
6.	Alamat Port menggunakan 3 digit terakhir dari NIM yaitu 069.
7.	Spesifikasi API GET, POST, dan PUT yang telah ditentukan.

Berikut penjelasan dan hasil dari pembuatan backend tersebut.
## pom.xml
File `pom.xml` tersebut membahas mengenai pengaturan dan informasi yang diperlukan untuk mengelola proyek menggunakan Maven. Pada file ini akan mengelola dependensi, mengkoordinasikan kompilasi, dan menjalankan tugas-tugas lainnya dalam proses pengembangan perangkat lunak.

## SQLiteDatabase
Pada bagian ini, data-data akan disimpan pada database SQLitenya.

 ## src/main/java
Bagian ini berisikan pengimplementasian dari request method pada API.

## GET
- GET /users untuk mendapatkan daftar semua user yang termuat di dalam database. <br/>
`localhost:8069/users` 

```
{
    "User Information": [
        {
            "Type": "buyer",
            "Email": "aridiah@gmail.com",
            "Nama Belakang": "Diah",
            "Nomor Telpon": "081728374757",
            "Nama Depan": "Ari",
            "id_user": 6001
        },
        {
            "Type": "buyer",
            "Email": "sintamaheswari@gmail.com",
            "Nama Belakang": "Maheswari",
            "Nomor Telpon": "081848885728",
            "Nama Depan": "Sinta",
            "id_user": 6002
        },
        {
            "Type": "buyer",
            "Email": "emmadaisy@gmail.com",
            "Nama Belakang": "Daisy",
            "Nomor Telpon": "087345518957",
            "Nama Depan": "Emma",
            "id_user": 6003
        },
        {
            "Type": "buyer",
            "Email": "yayakkara@gmail.com",
            "Nama Belakang": "Kara",
            "Nomor Telpon": "084562567834",
            "Nama Depan": "Yayak",
            "id_user": 6004
        },
        {
            "Type": "buyer",
            "Email": "sarawijayanto@gmail.com",
            "Nama Belakang": "Wijayanto",
            "Nomor Telpon": "089345345267",
            "Nama Depan": "Sara",
            "id_user": 6005
        },
        {
            "Type": "seller",
            "Email": "candrawijaya@gmail.com",
            "Nama Belakang": "Wijaya",
            "Nomor Telpon": "081843743775",
            "Nama Depan": "Candra",
            "id_user": 6006
        },
        {
            "Type": "seller",
            "Email": "maudylaura@gmail.com",
            "Nama Belakang": "Maudy",
            "Nomor Telpon": "081783748467",
            "Nama Depan": "Laura",
            "id_user": 6007
        },
        {
            "Type": "seller",
            "Email": "riskyteguh@gmail.com",
            "Nama Belakang": "Teguh",
            "Nomor Telpon": "081637663748",
            "Nama Depan": "Rizky",
            "id_user": 6008
        },
        {
            "Type": "seller",
            "Email": "indiesantoso@gmail.com",
            "Nama Belakang": "Santoso",
            "Nomor Telpon": "081726334627",
            "Nama Depan": "Indie",
            "id_user": 6009
        },
        {
            "Type": "seller",
            "Email": "irfandharma@gmail.com",
            "Nama Belakang": "Dharma",
            "Nomor Telpon": "081736463537",
            "Nama Depan": "Irfan",
            "id_user": 6010
        }
    ]
}
```

<br/>

- GET /users/{id} untuk mendapatkan informasi user dan alamatnya dengan menggunakan id tertentu. <br/>
`localhost:8069/users/6001` 

```
{
    "User Information": [
        {
            "First_Name": "Ari",
            "Type": "buyer",
            "Email": "aridiah@gmail.com",
            "Last_Name": "Diah",
            "Id": 6001,
            "City": "Balikpapan",
            "Phone Number": "081728374757",
            "Postcode": "76101",
            "Province": "Kalimantan Timur"
        }
    ]
}
```

<br/>

- GET /users/{id}/products untuk mendapatkan daftar produk milik user dengan menggunakan id tertentu. <br/>
`localhost:8069/users/6009/products` 

```
{
    "Products Information": [
        {
            "User ID": 6009,
            "Nama": "Indie",
            "Harga": 600000,
            "Deskripsi": "Setelan jas pria dengan celana panjang dan jaket formal",
            "ID Barang": 4009,
            "Nama Produk": "Setelan Jas Pria",
            "Stock": 12
        },
        {
            "User ID": 6009,
            "Nama": "Indie",
            "Harga": 90000,
            "Deskripsi": "Kaos polo pria dengan warna elegan dan bahan yang nyaman",
            "ID Barang": 4010,
            "Nama Produk": "Kaos Polo Pria",
            "Stock": 30
        }
    ]
}
```

<br/>

- GET /users/{id}/orders untuk mendapatkan daftar order milik user dengan menggunakan id tertentu. <br/>
`localhost:8069/users/6003/orders` 

```
{
    "Order Information": [
        {
            "Order": 2005,
            "Nama": "Emma",
            "Total": 76000,
            "Diskon": 4000,
            "id user": 6003
        },
        {
            "Order": 2010,
            "Nama": "Emma",
            "Total": 95000,
            "Diskon": 5000,
            "id user": 6003
        }
    ]
}
```

<br/>

- GET /users/{id}/reviews untuk mendapatkan daftar review yang dibuat oleh user dengan menggunakan id tertentu. <br/>
`localhost:8069/users/6003/reviews` 

```
{
    "Reviews Information": [
        {
            "User": 6003,
            "star": 5,
            "First Name": "Emma",
            "Deskripsi": "Memuaskan",
            "Last Name": "Daisy",
            "order": 2005
        },
        {
            "User": 6003,
            "star": 1,
            "First Name": "Emma",
            "Deskripsi": "Mengecewakan",
            "Last Name": "Daisy",
            "order": 2010
        }
    ]
}
```

<br/>

- GET /orders/{id} untuk mendapatkan informasi order, buyer, detail order, review, product title, beserta pricenya secara id tertentu. <br/>
`localhost:8069/orders/2005` 

```
{
    "Orders Information": [
        {
            "idUser": 6003,
            "idOrder": 2005,
            "Description": "Memuaskan",
            "Price": "76000",
            "Star": 5,
            "Note": 100005,
            "idProduct": 4006,
            "Quantity": 1,
            "Title": "Tank Top Basic",
            "Name": "Emma"
        }
    ]
}
```

<br/>

- GET /products untuk mendapatkan daftar semua produk. <br/>
`localhost:8069/products` 

```
{
    "Product Information": [
        {
            "Description": "Sweter dengan model V-neck dan bahan hangat untuk gaya yang stylish",
            "User": 6006,
            "Price": "160000",
            "Title": "Sweter V-Neck",
            "Id": 4001,
            "Stock": 20
        },
        {
            "Description": "Kemeja putih dengan lengan pendek dan bahan katun yang nyaman",
            "User": 6006,
            "Price": "150000",
            "Title": "Kemeja Putih Lengan Pendek",
            "Id": 4002,
            "Stock": 30
        },
        {
            "Description": "Dress midi dengan motif bunga yang cantik dan nyaman dipakai",
            "User": 6007,
            "Price": "180000",
            "Title": "Dress Midi Bunga",
            "Id": 4003,
            "Stock": 25
        },
        {
            "Description": "Rok plisket dengan potongan A-line dan tali pinggang elastis",
            "User": 6010,
            "Price": "120000",
            "Title": "Rok Plisket A-line",
            "Id": 4004,
            "Stock": 15
        },
        {
            "Description": "Gaun pesta dengan model elegan, detail renda, dan pita di pinggang",
            "User": 6008,
            "Price": "350000",
            "Title": "Gaun Pesta Elegan",
            "Id": 4005,
            "Stock": 8
        },
        {
            "Description": "Tank top basic dengan bahan katun lembut dan cocok untuk aktivitas sehari-hari",
            "User": 6006,
            "Price": "80000",
            "Title": "Tank Top Basic",
            "Id": 4006,
            "Stock": 40
        },
        {
            "Description": "Kaos oversize dengan potongan longgar dan desain casual",
            "User": 6006,
            "Price": "100000",
            "Title": "Kaos Oversized",
            "Id": 4007,
            "Stock": 35
        },
        {
            "Description": "Celana jogger pria dengan karet pinggang elastis dan detail saku",
            "User": 6007,
            "Price": "150000",
            "Title": "Celana Jogger Pria",
            "Id": 4008,
            "Stock": 25
        },
        {
            "Description": "Setelan jas pria dengan celana panjang dan jaket formal",
            "User": 6009,
            "Price": "600000",
            "Title": "Setelan Jas Pria",
            "Id": 4009,
            "Stock": 12
        },
        {
            "Description": "Kaos polo pria dengan warna elegan dan bahan yang nyaman",
            "User": 6009,
            "Price": "90000",
            "Title": "Kaos Polo Pria",
            "Id": 4010,
            "Stock": 30
        }
    ]
}
```

<br/>

- GET /products/{id} untuk mendapatkan informasi produk dan seller dengan menggunakan id tertentu. <br/>
`localhost:8069/products/6009` 

```
{
    "Product Information": [
        {
            "First_Name": "Indie",
            "Type": "seller",
            "Description": "Setelan jas pria dengan celana panjang dan jaket formal",
            "Email": "indiesantoso@gmail.com",
            "Price": "600000",
            "Last_Name": "Santoso",
            "Title": "Setelan Jas Pria",
            "Seller": 6009,
            "Id": 4009,
            "id_user": 6009,
            "Phone Number": "081726334627",
            "Stock": 12
        },
        {
            "First_Name": "Indie",
            "Type": "seller",
            "Description": "Kaos polo pria dengan warna elegan dan bahan yang nyaman",
            "Email": "indiesantoso@gmail.com",
            "Price": "90000",
            "Last_Name": "Santoso",
            "Title": "Kaos Polo Pria",
            "Seller": 6009,
            "Id": 4010,
            "id_user": 6009,
            "Phone Number": "081726334627",
            "Stock": 30
        }
    ]
}
```

<br/>

## POST
- Membuat data baru dengan id terbaru dalam aplikasi e-commercenya <br/>
```
{
            "First_Name": "Kusuma",
            "Type": "buyer",
            "Email": "kusumadewi11@gmail.com",
            "Last_Name": "Dewi",
            "Id": 6011,
            "City": "Denpasar",
            "Phone Number": "08873012114",
            "Postcode": "80225",
            "Province": "Bali"
        }
```
`1 rows inserted!`

<br/>
## PUT
- Mengubah data yang ada dengan menggunakan id tertentu <br/>
```
{
            "First_Name": "Kusuma",
            "Type": "buyer",
            "Email": "kusumadewi32123@gmail.com",
            "Last_Name": "Dewi",
            "Id": 6011,
            "City": "Denpasar",
            "Phone Number": "08873012114",
            "Postcode": "80225",
            "Province": "Bali"
        }
```
`1 rows updated!`
<br/>

## DELETE
- Menghapus data dari entitas tertentu dimana saya mencoba untuk menghapus data yang terdapat pada tabel ... <br/>
```
localhost:8069/users/6011
```
`1 rows deleted!`
