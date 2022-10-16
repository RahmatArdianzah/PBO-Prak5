public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    int no;
    private boolean cetak = false;


    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    public void setKode(String newKode){
        kode = newKode;
    }
    public String getKode(){
        return kode;
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
