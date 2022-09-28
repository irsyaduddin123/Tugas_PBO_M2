
package PBO_M3;

import java.io.*;
public class MainClass {

    public static void main(String[] args) throws IOException {
        BufferedReader A = new BufferedReader (new InputStreamReader (System.in));
        
        //subject(instance of class)
        //ada 2 constructor, maka dibuat 2 object
        //1. admin
        //2. admin baru
        Akun admin= new Akun();
        Akun akunBaru=new Akun("","");
        //Akun pass = new Akun("");
        
        //variabel
        String username, password;
        
        //menu
        do{
            System.out.println("---Login---");
            System.out.println("1. Login admin");
            System.out.println("2. Buat akun baru");
            System.out.println("3. lihat akun");
            System.out.println("4. Ubah Password");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = Integer.parseInt(A.readLine());
            
            switch(menu){
                case 1:
                    System.out.println("--- Login Admin ---");
                    System.out.println("Masukkan Username : ");
                    username = A.readLine();
                    System.out.println("Masukkan password");
                    password = A.readLine();
                    
                    // mencocokkan Usernam dan password
                    if(username.equalsIgnoreCase(admin.getUsername())&&password.equals(admin.getPassword())){
                        System.out.println("Sukses");
                } else {
                        System.err.println("gagal");
                    }
                        break;

                case 2:
                    System.out.println("--- Buat Akun ---");
                    System.out.println("Masukkan Username : ");
                    username = A.readLine();
                    System.out.println("Masukkan password");
                    password = A.readLine();
                    
                    //memasukkan variabel kedalam constructore
                    akunBaru = new Akun(username,password);
                    break;
                case 3:
                    System.out.println("-- Lihat Akun ---");
                    System.out.println("1. admin");
                    System.out.println("Username : " + admin.getUsername());
                    System.out.println("password : " + admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun Baru ");
                    System.out.println("Username : " + akunBaru.getUsername());
                    System.out.println("Password : " + akunBaru.getPassword());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("--- Ubah Password ---");
                    System.out.println("Masukkan Passsword Lama");
                    password = A.readLine();
                    
                     if(password.equals(akunBaru.getPassword())){
                        System.out.println("Masukkan Password Baru");
                        akunBaru.setPassword(A.readLine());
                        System.out.println("Password : " + akunBaru.getPassword());
                } else {
                        System.err.println("Password lama anda salah");
                    }
                    
                    break;
                case 5:
                    System.exit(0);
                    break;
                    
                
            }
        }while(true);
    }
    
}
