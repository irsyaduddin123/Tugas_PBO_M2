
package PBO_M3;

class Akun {
    
    
    // usernam dan password
    private String username, password;
    
    
    // constractore non parameter (admin)
    public Akun(){
        // user admin sudah di tentukan username dan password
        username="admin";
        password= "admin";
    }
    // constractore parameter (akun)
    public Akun (String u, String p){
       username = u;
       password = p;
    }
    
    //setter ubah password

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
