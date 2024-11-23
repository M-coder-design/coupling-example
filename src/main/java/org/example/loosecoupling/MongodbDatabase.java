package org.example.loosecoupling;

public class MongodbDatabase implements UserDatabase{

    @Override
    public String getUserDatabase() {
        return "mongodb database";
    }
}
