package perusahaan;

public class Internship extends employee{
    String jabatan = "internship";
    int gaji = 8_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja){
        int potongan =(super.jamKerja - jamKerja) * super.potongan;
        int hasil = gaji - potongan;
        return hasil;
    
}
}
