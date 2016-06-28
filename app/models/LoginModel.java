package models;

/**
 * Created by rashmin.gadhvi on 6/1/2016.
 */
public class LoginModel{
    private String login;
    private String password;

    @Override
    public String toString() {
        return "LoginModel{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
