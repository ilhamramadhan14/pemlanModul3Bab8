package latihaninterface;

public class Ikan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Ikan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pelet pakai mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Berenang dari hulu ke hilir");
    }

    @Override
    public void bersuara() {
        System.out.println("Blub blub blub blub");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }
}