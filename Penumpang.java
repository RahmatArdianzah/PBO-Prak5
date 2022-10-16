public class Penumpang {
    private String ktp;
    private String nama;
    
    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setKtp(String newKtp){
        ktp = newKtp;
    }
    public String getKtp(){
        return ktp;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public String getNama(){
        return nama;
    }
    public String info(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + " \n";
        return info;
    }
}
