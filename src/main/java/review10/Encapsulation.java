package review10;

public class Encapsulation {

    String name;
    String userName;
    String password;
   private String dob;

    public Encapsulation(String name, String userName, String password, String dob) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.dob = dob;
    }

    void login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("Logged in");
        }
    }

    public String getDob(){
        return dob;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
