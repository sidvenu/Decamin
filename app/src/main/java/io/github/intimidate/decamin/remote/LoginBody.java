package io.github.intimidate.decamin.remote;

import com.google.gson.annotations.SerializedName;

public class LoginBody {
    @SerializedName("email")
    String email;
    @SerializedName("password")
    String password;
    @SerializedName("gender")
    String gender;
    @SerializedName("due")
    int due;
    @SerializedName("name")
    String name;

    @SerializedName("token")
    int token;

    public LoginBody(String email, String password, String gender, int due, String name, int token) {
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.due = due;
        this.name = name;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
}
