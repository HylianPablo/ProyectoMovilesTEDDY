package com.example.teddyv2.domain.user;

public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private UserLevel level;
    private String paymentAccount;

    public User(){
        username = "";
        password = "";
        name = "";
        surname = "";
        email = "";
        phone = "";
        level = null;
        paymentAccount = "";
    }

    public User(
            String username,
            String password,
            String name,
            String surname,
            String email,
            String phone,
            UserLevel level,
            String paymentAccount
    ){
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.level = level;
        this.paymentAccount = paymentAccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserLevel getLevel() {
        return level;
    }

    public void setLevel(UserLevel level) {
        this.level = level;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

}
