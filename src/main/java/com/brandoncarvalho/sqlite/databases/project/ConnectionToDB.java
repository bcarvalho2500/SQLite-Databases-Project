/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandoncarvalho.sqlite.databases.project;

import java.sql.*;

/**
 *
 * @author brandoncarvalho
 */
public class ConnectionToDB {


    public static Connection ConnectDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:autosDB.sqlite");
            System.out.println("Connection to DB established");
           return con;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return null;

        }
    }
}