package services;

public class User {
    private String emailaddress;
    private String password;
    private String passwordfalse;
    private String emailcreate;


    public User() {
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordfalse() {
        return passwordfalse;
    }

    public void setPasswordfalse(String passwordfalse) {
        this.passwordfalse = passwordfalse;
    }

    public String getEmailcreate() {
        return emailcreate;
    }

    public void setEmailcreate(String emailcreate) {
        this.emailcreate = emailcreate;
    }
}