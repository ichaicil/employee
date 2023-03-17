package perusahaan;

import java.util.Scanner;

public class main {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("masukkan nama : ");
        String nama = scan.nextLine();
        System.out.println("masukkan nip : ");
        int nip = scan.nextInt();
        scan.nextLine();
        System.out.println("masukkan jabatan");
        String jabatan = scan.nextLine();
        boss boss = new boss();
        manager manager = new manager();
        CleaningService cleaningservice = new CleaningService();
        Internship internship = new Internship();
        int gajiAkhir = 0;
        
        if (jabatan.equalsIgnoreCase(boss.jabatan)) {
            System.out.println("berapa lama waktu anda bekerja :");
            int lamaKerja = scan.nextInt();
            gajiAkhir = boss.hitung(boss.gaji, lamaKerja);
            System.out.println("gaji maximum : " + boss.gaji);    
        }
        else if (jabatan.equalsIgnoreCase(manager.jabatan)){
            System.out.println("berapa lama anda bekerja");
            int lamaKerja = scan.nextInt();
            gajiAkhir = manager.hitung(manager.gaji, lamaKerja);
            scan.nextLine();
            System.out.println("gaji maximum : " + manager.gaji);
            
        }
        else if (jabatan.equalsIgnoreCase(cleaningservice.jabatan)) {
            System.out.println("berapa lama waktu anda bekerja :");
            int lamaKerja = scan.nextInt();
            gajiAkhir = cleaningservice.hitung(cleaningservice.gaji, lamaKerja);
            System.out.println("gaji maximum : " + cleaningservice.gaji);   
    }
        if (jabatan.equalsIgnoreCase(internship.jabatan)) {
            System.out.println("berapa lama waktu anda bekerja :");
            int lamaKerja = scan.nextInt();
            gajiAkhir = internship.hitung(internship.gaji, lamaKerja);
            System.out.println("gaji maximum : " + boss.gaji);     
    }
        System.out.println("status ( menikah / belum menikah ) : ");
        scan.nextLine();
        String st = scan.nextLine();
        boolean status = true;
        if (st.equalsIgnoreCase(("menikah"))){
            gajiAkhir += 5_000_000;
        }
        System.out.println("gaji akhir : " + gajiAkhir);
    }
}
