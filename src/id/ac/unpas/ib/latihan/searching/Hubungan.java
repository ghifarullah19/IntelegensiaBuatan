package id.ac.unpas.ib.latihan.searching;

// Kelas ini digunakan sebagai "id" dari hubungan antarkota 
public class Hubungan {
    // Atribut satu dan dua sebagai kota
    public Node satu;
    public Node dua;
    // Atribut hubunganMasuk menampung apakah kota satu memiliki jalur masuk ke kota
    // dua
    public boolean hubunganMasuk;

    // Konstruktor
    public Hubungan(Node satu, Node dua, boolean hubunganMasuk) {
        this.satu = satu;
        this.dua = dua;
        this.hubunganMasuk = hubunganMasuk;
    }

    // Tampil nilai
    public void tampil() {
        System.out.println(this.satu.getNilai() + " -> " + this.dua.getNilai() + ": " + this.hubunganMasuk);
    }

    // Mendapatkan hubunganMasuk
    public boolean getHubungan() {
        return this.hubunganMasuk;
    }
}
