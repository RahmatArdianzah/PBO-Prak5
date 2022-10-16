public class Pegawai {
    private String nip;
    private String nama;
    
    public Pegawai (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String newNip){
        nip = newNip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String newName){
        nama = newName;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info = "";
        info += "NIP : " + this.nip + "\n";
        info += "Nama : " + this.nama + "\n";
        return info;
    }
}
