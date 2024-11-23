package org.example.tightcoupling;

public class tightcouplingentry {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
