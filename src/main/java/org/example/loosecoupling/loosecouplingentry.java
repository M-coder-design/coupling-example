package org.example.loosecoupling;


public class loosecouplingentry {
    public static void main(String[] args) {
        UserDatabase userDatabase = new SQLDatabase();

        UserManager userManager = new UserManager(userDatabase);

        System.out.println(userManager.getUserInfo());


        /* ------------------------------------------------------------------------- */

        UserDatabase userDatabase1 = new MongodbDatabase();

        UserManager userManager1 = new UserManager(userDatabase1);

        System.out.println(userManager1.getUserInfo());

    }
}
