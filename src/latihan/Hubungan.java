package latihan;

public class Hubungan {
    public Node satu;
    public Node dua;
    public boolean hubunganMasuk;

    public Hubungan() {

    }

    public Hubungan(Node satu, Node dua, boolean hubunganMasuk) {
        this.satu = satu;
        this.dua = dua;
        this.hubunganMasuk = hubunganMasuk;
    }

    public void tampil() {
        System.out.println(this.satu.getNilai() + " -> " + this.dua.getNilai() + ": " + this.hubunganMasuk);
    }

    public boolean getHubungan() {
        return this.hubunganMasuk;
    }
}
