/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yuri
 */
public class Conexao {

    //cria uma constante com o endereçamento da base de dados no conector com mysql
    private static String URL = "jdbc:mysql://localhost:3306/projetointegradoryuriigor";
    //cria uma constante para determinar o usuário pré definido no banco de dados(na instalação)
    private static String USUARIO = "root";
    //cria uma constante para determinar a senha do usuário
    private static String SENHA = "";

    /**
     * Método que estabelece conexão com o banco
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConexao() throws SQLException {
        //diz que ainda não foi estabelecida um conexão
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar!" + e.getMessage());
        }
        return c;
    }
}
