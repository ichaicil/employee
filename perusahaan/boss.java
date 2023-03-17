package perusahaan;

public class boss extends employee{
    String jabatan = "bos";
    int gaji = 20_000_000;
    
    @Override
    int hitung(int gaji, int jamKerja){
        int potongan =(super.jamKerja - jamKerja) * super.potongan;
        int hasil = gaji - potongan;
        return hasil;
        
        
    }
    
    
    
}
