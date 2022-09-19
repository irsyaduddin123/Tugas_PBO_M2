
package PBO_M2;

public class Karyawan {
    public String nik, bagian;
    public int kehadiran, gaji_per_hari, totalGaji;

    //seter
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji_per_hari(int gaji_per_hari) {
        this.gaji_per_hari = gaji_per_hari;
    }
    
    //getter

    public String getNik() {
        return nik;
    }

    public String getBagian() {
        return bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public int getGaji_per_hari() {
        return gaji_per_hari;
    }
    
    //cutstom method 
    public int getGaji(){
        totalGaji = getKehadiran() * getGaji_per_hari();
        return totalGaji;
    }
}
