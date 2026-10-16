package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection obterConexao() throws Exception {

        var host = "jdbc:mysql://localhost:3307/bd-crud";
        var user = "coti";
        var pass = "coti";

        return DriverManager.getConnection(host, user, pass);

    }
}
