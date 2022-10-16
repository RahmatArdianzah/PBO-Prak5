public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1001", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("2001", "Patrick Star");
        KeretaApi keretaapi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaapi.info());
    }
}
