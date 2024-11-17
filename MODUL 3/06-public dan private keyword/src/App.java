class Data{
    // Data member atau variabel instant
    String nama; // default, bisa dikases diluar kelass
    public String prodi; // public, bisa diakses diluar kelas
    private Double ipk; // private, hanya bisa diakses oleh class itu sendiri

    // Konstruktor
    Data(String nama, String prodi, Double ipk){
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    // default modifier access method
    void cetakData(){
        tambahIPK(); // contoh akses private method
        System.out.println("Nama : " + this.nama);
        System.out.println("Podi : " + this.prodi);
        System.out.println("IPK : " + this.ipk);
    }

    // public modifier access method
    public void ubahNama(String namaBaru){
        this.nama = namaBaru;
    }

    // private modifier access method
    private void tambahIPK(){
        this.ipk += 0.5;
    }
}
 