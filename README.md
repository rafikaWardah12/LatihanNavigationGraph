## Membuat navigation graph
## Implementasi
1. Membuat Navigation Graph di direktori navigation
2. Membuat NavHostFragment pada layout
3. Menambahkan Destination dan Action pada Navigation Graph
4. Menambahkan NavController pada Activity/Fragment
5. Mengirim data antar Fragment menggunakan Bundle
6. Mengirim data antar Fragment menggunakan SafeArg
7. Mengatur Pop Up Behaviour
8. Menambahkan Animation saat transisi antar halaman

## What I Learn
1. Mengirim data dengan Bundle, menggunakan format key-value dan *key* yang diterima maupun dikirim harus sama.
2. Mengirim data dengan SafeArg = untuk menghindari null. Apabila memakai bundle, nilai null bisa tetap muncul jika *key* yang dikirim **berbeda** dengan *key* yang diterima
3. popUpToInclusive = true membuat fragment yang sebelumnya diakses akan dibersihkan alhasil saat tombol Back ditekan applikasi langsung keluar
4. Animasi yang dapat ditambahkan :
   * enterAnim, yaitu animasi ketika masuk.
   * exitAnim, yaitu animasi ketika keluar (berpindah ke fragment lain).
   * popEnterAnim, yaitu animasi ketika masuk dari back stack.
   * popExitAnim, yaitu animasi ketika keluar dari back stack.
