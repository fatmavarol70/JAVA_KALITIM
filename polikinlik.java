package odev;

public class polikinlik extends hastane{
    private String poliklinikAdi;
    private String poliklink(String ad,String adres,String poliklinikAdi){
        super(ad,adres);
        this.poliklinikAdi=poliklinikAdi;
    }
    public String getpolikinlik(){
        return poliklinikAdi;
    }
    @Override
    public String toString(){
        return super.toString()+",poliklinik:"+poliklinikAdi;
    }
}
