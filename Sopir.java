public class Sopir {
    private String namaSopir;
    private int biaya;

    Sopir(){

    }
    public void setNama(String namaSopir){
        this.namaSopir = namaSopir;
    }
    public String getNama(){
        return namaSopir;
    }
    public int setBiaya (int biaya2){
        return biaya = biaya2;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }      
}
