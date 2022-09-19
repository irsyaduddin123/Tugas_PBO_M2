package PBO_M2;

public class Mahasiswa {
    public String nim, prodi;
    public int total, spp, angkatan, semester, bayar_spp_semester;
    
    //setter 
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

//    public void setBayar_spp_semester(int bayar_spp_semester) {
//        this.bayar_spp_semester = bayar_spp_semester;
//    }
    
    //getter 
     public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

//    public int getSpp() {
//        return spp;
//    }

    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }

//    public int getBayar_spp_semester() {
//        return bayar_spp_semester;
//    }
//    
    //custom method 
    public int getSPP(){
        if(this.angkatan > 17){
            bayar_spp_semester = 15000000 * semester;
        
        }else{
            bayar_spp_semester = 12000000 * semester;
        }
        return bayar_spp_semester;
        
    }
      
}
