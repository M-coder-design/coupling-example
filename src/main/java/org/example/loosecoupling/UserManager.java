package org.example.loosecoupling;

public class UserManager {

    private UserDatabase userDatabase;

    UserManager(UserDatabase userDatabase)
    {
        this.userDatabase = userDatabase;
    }

    public String getUserInfo()
    {
        return userDatabase.getUserDatabase();
    }
}
