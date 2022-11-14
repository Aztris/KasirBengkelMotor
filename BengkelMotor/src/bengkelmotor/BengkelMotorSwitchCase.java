import java.util.Scanner;

public class BengkelMotorSwitchCase {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int jenis;
        System.out.println("Jenis Motor :");
        System.out.println("1. Matic");
        System.out.println("2. Bebek");
        System.out.println("3. Manual");
        System.out.print("Pilih jenis motor : ");
        jenis=input.nextInt();
        
        System.out.print("Masukkan Tahun : ");
        int tahun = input.nextInt();
        
        System.out.println("Jenis oli :");
        System.out.println("1. Top 1");
        System.out.println("2. Top 2");
        System.out.println("3. Top 3");
        System.out.print("Masukkan Jenis Oli : ");
        int oli = input.nextInt();
        
        int harga_oli;
        String hadiah="-", strOli="-";
        switch (oli) {
            case 1 -> {
                strOli="Top 1";
                harga_oli=15000;
                if(jenis==1){
                    harga_oli=0;
                    hadiah = "1 oli jenis Top 1";
                }
            }
            case 2 -> {
                harga_oli=10000;
                strOli="Top 2";
            }
            case 3 -> {
                harga_oli = 5000;
                strOli="Top 3";
            }
            default -> harga_oli = 0;
        }
        
        int service=0,potongan=0,diskon=0, biaya=0;
        String motor="-";
        switch (jenis) {
            case 1 -> {
                motor = "Matic";
                service = 25000;
                
                if(tahun<2010){
                    diskon = 10;
                }
            }
            case 2 -> {
                motor="Bebek";
                service = 20000;
                
                if(tahun<2010){
                    diskon = 5;
                }
            }
            case 3 -> {
                motor = "Manual";
                service = 30000;
                
                if(tahun<2005){
                    diskon = 5;
                }
            }
            default -> System.exit(0);
        }
        
        biaya = service + harga_oli;
        
        potongan = biaya * diskon / 100;        
        
        int total = biaya - potongan;
        
        System.out.println("");
        System.out.println("===============================");
        System.out.println("Jenis Motor   : "+motor);
        System.out.println("Tahun         : "+tahun);
        System.out.println("Biaya Service : Rp."+service);
        System.out.println("Oli           : "+strOli);
        System.out.println("Harga oli     : Rp."+harga_oli);
        System.out.println("Biaya         : Rp."+biaya);
        System.out.println("Hadiah        : "+hadiah);
        System.out.println("Diskon        : "+diskon+"%");
        System.out.println("Potongan      : Rp."+potongan);
        System.out.println("TOTAL         : Rp."+total);
        System.out.println("");
        System.out.print("Bayar : Rp."); int bayar = input.nextInt();
        int kembalian = bayar - total;
        System.out.println("Kembali : "+kembalian);
        System.out.println("===============================");
        
    }
}
