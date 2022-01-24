package com.example.myrecylerview


object HeroesData {
    private val heroNames = arrayOf("Kim Namjoon",
        "Kim Soekjin",
        "Min yoongi",
        "Jung hesoek",
        "Park Jimin",
        "Kim taehyung",
        "Jeon Jungkook",
        "BTS1",
        "BTS2",
        "BTS3")
    private val heroDetails = arrayOf("Kim namjoon atau dikenal juga dengan RM dari anggota boygroup terkenal yaitu BTS. RM menjadi leader di dalam group, atau juga bisa dia berada di Rapline. dia lahir pada 12 September 1994, dia juga mempunyai keahlian Rapper, penulis lagu, produser rekaman. Zodiak dia Virgo ",
        "Kim Seokjin atau dikenal juga dengan Jin (dia Lahir pada tanggal 4 Desember 1992. Kim soekjin atau Jin berasal dari boygroup yang berasal dari korea selatan yang sekarang terkenal di semua negara yaitu BTS. Dia adalah member tertua diantar 7 orang, dia sebagai vokal dan juga menulis lagu",
        "Min Yoongi atau biasa dikenal dengan Suga atau Agust D (Lahir pada tanggal 9 Maret 1993. Agust D atau suga juga mempunyai beberapa single yang dia buat sendiri, dia berada di bagian Rapline boygroup BTS. Dia sangat berbakat menulis lagu, dan produsen musik, dan banyak juga artis yang sudah berkolab dengan suga",
        "Jubg Heseok atau dikenal juga dengan nama Jhope. ( Lahir pada February 18, 1994.Sebelum debut, J-hope benci melakukan aegyo, tapi sekarang dia berubah pikiran. J-Hope dan Suga sangat nggak jago menggambar.Motto hidup J-Hope: “Kalau kamu tidak bekerja keras, tidak akan ada hasil-hasil yang baik.”  ",
        "Park Jimin  atau Dikenal juga dengan Jimin (Lahir pada tanggal October 13, 1995.Keluarga Jimin terdiri dari ayah, ibu, dan adik laki-laki.  Makanan kesukaan: daging babi, bebek, ayam, buah-buahan, dan kimchi jjigae. Terkenal akan otot perutnya yang mengesankan. Menurut Jimin, syarat kebahagiaannya adalah: cinta, uang dan panggung. ",
        "Kim taehyung dikenal dengan V (Lahir pada tanggal December 30, 1995.V lahir di Daegu, tapi kemudian pindah ke Geochang dimana ia menjalani kehidupannya sebelum pindah ke Seoul.Kim Taehyung memiliki kelopak mata monolid di satu mata and kelopak mata ganda di mata yang lain.Taehyung adalah seorang ambidextrous. Dia sebenarnya kidal, tapi sekarang dia bisa memakai kedua tangan dengan baik.   ",
        "Jeon Jungkook (My Husband hahaha) atau dikenal dengan  Jungkook (Lahiir pada tanggal 1 September 1997. Makanan kesukaannya adalah segala sesuatu yang terbuat dari tepung (pizza, roti, dll) Suka main games, menggambar, dan main sepak bola. Motto: “Hidup tanpa gairah itu seperti mati”.Nama panggilan Jungkook antara lain Jeon Jungkookie (sering dipanggil gitu sama Suga), Golden Maknae, Kookie dan Nochu.  ",
        " BTS telah menerima banyak penghargaan dan nominasi atas karya musik mereka. BTS debut dibawah Big Hit Entertainment pada tahun 2013 dan merilis single pertama dari album 2 Cool 4 Skool dan extended play O!RUL8,2?, yang membuat mereka mendapatkan beberapa penghargaan sebagai New Artist of the Year, termasuk di Melon Music Awards, Golden Disc Awards dan Seoul Music Awards.BTS dianugerahi sebuah Billboard Music Award sebagai Top Social Artist pada tahun 2017 dan 2018. Majalah Time menobatkan mereka sebagai salah satu dari 25 orang paling berpengaruh di internet pada tahun 2017. ",
        "Dalam dunia K-pop, fandom memiliki peran yang sangat penting, Toppers. Hampir semua boy band K-Pop memiliki fandom (fans club) dengan nama dan ciri khasnya masing-masing.A.R.M.Y yang merupakan singkatan dari Adorable Representative M.C for Youth. ARMY juga bisa diterjemahkan sebagai tentara (army) dalam bahasa Inggris.Ungu menjadi warna ARMY sejak November 2016. Pemilihan warna ini terinspirasi dari penggalan kalimat V BTS yang dikatakannya sesaat sebelum menutup penampilan yakni “I purple you”.  ",
        "Banyak pendengar terutama ARMY (sebutan untuk fans BTS) yang merasa terbantu dengan lagu-lagu BTS yang filosofis, relatable, dan mengandung pesan positif. \"Magic Shop\" terinspirasi dari buku berjudul Into the Magic Shop. Sebuah buku yang menceritakan perjalanan hidup sang penulis, James R. Doty, seorang ahli bedah saraf terkemuka di Amerika. Psikolog atau psikiater akan menjadi pemilik dari toko sulap dan pasien dapat \"membeli\" emosi positif dengan \"menjual\" emosi negatif yang mereka miliki.  ")

    private val heroesImages = intArrayOf(R.drawable.rm,
        R.drawable.jin,
        R.drawable.suga,
        R.drawable.jhope,
        R.drawable.jimin,
        R.drawable.taehyung,
        R.drawable.jungkook,
        R.drawable.bts1,
        R.drawable.bts2,
        R.drawable.bts3)

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}