package odev;

public class doktor extends polikinlik {
    private String doktorAdi;
    private String doktorSoyadi;

    public doktor(String hastaneAd, String hastaneAdres, String poliklinikAdi, String doktorAdi, String doktorSoyadi) {
        super(hastaneAd, hastaneAdres, poliklinikAdi);
        this.doktorAdi = doktorAdi;
        this.doktorSoyadi = doktorSoyadi;
    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public String getDoktorSoyadi() {
        return doktorSoyadi;
    }

    @Override
    public String toString() {
        return super.toString() + ",Doktor: " + doktorAdi + ",Doktor Soyadi: " + doktorSoyadi;
    }

}
