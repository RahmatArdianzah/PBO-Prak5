public class Mobil {
    private String merk;
    private int biaya;

    Mobil(){

    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(int biaya2){
        biaya = biaya2;
        return biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
    
}
