package perusahaan;

public class manager extends employee{
    String jabatan = "manager";
    int gaji = 15_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja){
        int potongan =(super.jamKerja - jamKerja) * super.potongan;
        int hasil = gaji - potongan;
        return hasil;
    
}
}
