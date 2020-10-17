// package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;

class App {

    private static final String url = "jdbc:mariadb://127.0.0.1";

    private static final String user = "yash";

    private static final String password = "yash2000.";

    public static void main(String args[]) {
        try {
            Class.forName("com.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}