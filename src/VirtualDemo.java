public class VirtualDemo {
    public static void main(String[] args){ 
        System.out.println("Menyusun Pegawai");
        //Polimorfisme
        Gaji s = new Gaji("Mey", "Tapan", 1, 10000.00);
        Pegawai m = new Gaji("Diva", "Berau", 2, 5000.00);
        Pegawai n = new Pegawai("Intayeza", "Padang", 3);
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        m.mailCheck();
        m.Info();

        System.out.println("\nMemanggil mailCheck Berdasarkan Class Pegawai--");
        n.mailCheck();
        n.Info();
    }
}