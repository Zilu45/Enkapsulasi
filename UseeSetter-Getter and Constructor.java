package Konstruktor;

public class User {
public String username;
 public String password;

public User() { 
 System.out.println("Eksekusi method constructor....");
}
      public static void main(String[] args) {
        User a = new User();
    }

    private String Username;
    private String Password;
    
    public void setUsername(String username){
        this.Username = username;
    }
   public void setPassword(String password){
        this.Password = password;
    }
   public String getUsername(){
        return this.Username;
    }
      public String getPassword(){
        return this.Password;
    }
}
