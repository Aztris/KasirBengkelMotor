package bengkelmotor;

import java.util.Scanner;

/**
 *
 * @author STMIK-I
 */
public class BengkelMotor {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int motor, tahun, total, service, oli, harga_oli, potongan;
        String jenis, hadiah = "Tidak", diskon, gratisan;
        
        System.out.println("Jenis Motor :");
        System.out.println("1. Matic");
        System.out.println("2. Bebek");
        System.out.println("3. Manual");
        System.out.print("Pilih Jenis Motor (1-3): ");
        motor = input.nextInt();
        
        
        
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();
        
        System.out.println("Jenis Oli : ");
        System.out.println("1. Top 1");
        System.out.println("2. Top 2");
        System.out.println("3. Top 3");
        System.out.print("Masukkan Oli (1-3) : ");
        oli = input.nextInt();
        
        if(motor==1){
            jenis = "Matic";
            gratisan = "1 Oli Top 1";
            service = 25000;
        }else if(motor==2){
            jenis = "Bebek";
            gratisan = "-" ;           
            service = 20000;
        }else if(motor==3){
            jenis = "Manual";
            gratisan = "-";
            service = 30000;
        }else{
            jenis = "tidak ada";
            gratisan = "-";
            service=0;
        }
        
        if (oli == 1){
            harga_oli = 15000;
            if(motor == 1){
                harga_oli=0;
            }
        }else if(oli == 2){
            harga_oli=10000;
        }else {
            harga_oli = 5000;
        }
        
        int biaya = service + harga_oli;
        
        if(motor == 1 && tahun < 2010){
            diskon = "10%";
            potongan = biaya * 10/100;
        }else if(motor == 2 && tahun < 2010){
            potongan = biaya * 5/100;
            diskon = "5%";
        }else if(motor == 3 && tahun < 2010){
            potongan = biaya * 5/100;
            diskon = "5%";
        }else{
            potongan = 0;
            diskon = "-";
        }
        
        total = biaya - potongan;
        
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("");
        System.out.println("Jenis Motor : "+jenis);
        System.out.println("Tahun Motor : "+tahun);
        System.out.println("Gratis Oli  : "+gratisan);
        System.out.println("Biaya       : Rp."+biaya);
        System.out.println("Diskon      : "+diskon);
        System.out.println("Potongan    : Rp."+potongan);
        System.out.println("Total       : Rp."+total);
        System.out.print("Masukkan Bayar : Rp."); int bayar = input.nextInt();
        int kembali = bayar - total;
        System.out.println("\nKembalian    : Rp."+kembali);
        System.out.println("==========================================");
        
        System.out.println("Nama : Aziz Tri Saputro");
        
    }
    
}
