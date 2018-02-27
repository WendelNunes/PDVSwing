/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author INLOC01
 */
public class Conexao {

    private static final String DRIVER_NAME = "org.postgresql.Driver";
    private static final String SERVER_NAME = "localhost:5432";
    private static final String DATABASE_NAME = "PDV_SWING";
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "123456";

    public static Connection criarConexao() throws Exception {
        Class.forName(DRIVER_NAME);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://" + SERVER_NAME + "/" + DATABASE_NAME, USER_NAME, PASSWORD);
        return connection;
    }
}
