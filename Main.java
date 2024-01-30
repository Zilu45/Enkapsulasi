
package Konstruktor;

public class Main {
    public String username;
    public String password;
    
    public Main(String username, String password){
        this.username = username;
        this.password = password;
    }
    public static void main(String[] args) {
        Main a = new Main("Neuro", "kopi");
        System.out.println("Username: " + a.username);
        System.out.println("Password: " + a.password);
    }
       
    User dian = new User();{

// menggunakan method setter
dian.setUsername("Neuro");
dian.setPassword("Koentji Jawa");

// menggunakan method getter
System.out.println("Username: " + dian.getUsername());
System.out.println("Password: " + dian.getPassword());
 }
}