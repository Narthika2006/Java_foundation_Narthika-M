import java.util.*;


public class Login{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("LOGIN MODULE");

    System.out.println("Enter the Username :");
    String username=sc.next();

    System.out.println("Enter the password :");
    String password=sc.next();

    LoginService loginservice=new LoginService();
    boolean isValid= loginservice.Validate(username,password);

    if(isValid){
        System.out.println("Login Successful");
    }
    else{
        System.out.println("Invalid Credetials");
    }


}
}

class LoginService {
    Map<String,String> users=new HashMap<>();

    public LoginService() {
    users.put("Nar","N1234");
    users.put("Rav" , "R1234");
    }
    
   

    public boolean Validate(String username,String password){
        if(users.containsKey(username)){
          String Opassward=users.get(username);

          if(Opassward.equals(password)){
            return true;
          }
        }
        
            return false;
        

    }
}