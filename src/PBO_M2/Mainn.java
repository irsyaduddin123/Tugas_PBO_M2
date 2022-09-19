
package PBO_M2;

import java.io.*;
public class Mainn {

    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedReader A = new BufferedReader (
        new InputStreamReader (System.in));
        
        Mahasiswa mhsirsyad = new Mahasiswa();
        Karyawan krynanang = new Karyawan();
        
        try{
            do{
                System.out.println("=== Administrasi ===");
                System.out.println("1. CEK SPP MAHASISWA");
                System.out.println("2. CEK GAJI KARYAWAN");
                System.out.println("3. KELUAR APLIKASI");
                System.out.print("PILIH MENU : ");
                int pilih = Integer.parseInt(A.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("-- INPUT DATA MAHASISWA --");
                        System.out.print("NIM :");
                        mhsirsyad.setNim(A.readLine());
                        System.out.print("Prodi :");
                        mhsirsyad.setProdi(A.readLine());
                        System.out.print("Angkatan :");
                        mhsirsyad.setAngkatan(Integer.parseInt(A.readLine()));
                        System.out.print("Semester :");
                        mhsirsyad.setSemester(Integer.parseInt(A.readLine()));
                        
                        System.out.print("SPP Mahasiswa : Rp: " + mhsirsyad.getSPP());
                        System.out.println(" ");
                        break;
                        
                        
                    case 2:
                        System.out.println("-- INPUT DATA KARYAWAN -- ");
                        System.out.print("NIK :");
                        krynanang.setNik(A.readLine());
                        System.out.print("Bagian :");
                        krynanang.setBagian(A.readLine());
                        System.out.print("Kehadiran :");
                        krynanang.setKehadiran(Integer.parseInt(A.readLine()));
                        System.out.print("gaji_per_hari :");
                        krynanang.setGaji_per_hari(Integer.parseInt(A.readLine()));
                        
                        
                        System.out.println("Total Gaji : Rp. " + krynanang.getGaji());
                        System.out.println(" ");
                        
                        break;
                        
                        
                    case 3:
                        System.exit(0);
                        break;
                        
                }
            }while(true);
            
            
        }catch (Exception e){
            System.out.println("Inputan anda salah / bukan angka");
        }
        
        
    }
    
}