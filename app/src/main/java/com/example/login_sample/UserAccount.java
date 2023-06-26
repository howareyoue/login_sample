package com.example.login_sample;

public class UserAccount
{
    private String emailId;// 이메일 아이디
    private String password;
    private String idToken; //Firebase Uid(고유 토큰정보)
    public UserAccount() {
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
