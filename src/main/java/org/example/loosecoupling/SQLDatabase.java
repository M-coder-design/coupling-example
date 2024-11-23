package org.example.loosecoupling;

public class SQLDatabase implements UserDatabase{
    @Override
    public String getUserDatabase() {
        return "sql database";
    }
}
