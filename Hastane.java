public class Hastane {
    private String ad;
    private String adres;

    public Hastane(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }
    public String getAd() {
        return ad;
    }
    public String getAdres() {
        return adres;
    }
    public void bilgiYazdir() {
        System.out.println("Hastane bilgisi : " + ad);
        System.out.println("Hastane adresi : " + adres);
    }
}
