/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.UsuarioVO;
import persistencia.Conexao;

/**
 *
 * @author Yuri e Igor
 */
public class UsuarioDAO {

    public void cadastrarUsuario(UsuarioVO cVO) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;//String que receberá o comando SQL

            sql = "insert into usuario(idUsuario,nome,email,senha,telefone)"
                    + "values(null,'" + cVO.getNome() + "','" + cVO.getEmail()+ "','"
                    + cVO.getSenha() + "','" + cVO.getTelefone() + "')";
            //executa o comando que guardamos dentro da String sql
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir Usuáro..");
        } finally {
            stat.close();
            con.close();
        }
    }

    public ArrayList<UsuarioVO> buscaUsuario() throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from usuario";

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<UsuarioVO> usuarios = new ArrayList<>();

            while (rs.next()) {
                UsuarioVO u = new UsuarioVO();
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
                u.setSenha(rs.getString("senha"));
                u.setTelefone(rs.getString("telefone"));
                
                usuarios.add(u);
            }
            return usuarios;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar Usuário." + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void deletarUsuario(int idUsuario) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from usuario where idUsuario = " + idUsuario;
            stat.execute(sql);
        }catch (SQLException ex){
            throw new SQLException("Erro ao deletar Usuário. " + ex.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }
    
    
    public void editarUsuario(UsuarioVO uVO) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql= "update usuario set "
                    + "nome='"+uVO.getNome()+"',"
                    + "email='"+uVO.getEmail()+"',"
                    + "senha='"+uVO.getSenha()+"',"
                    + "telefone='"+uVO.getTelefone()+"',"
                    + "where idUsuario="+uVO.getIdUsuario()+"";
            
            stat.executeUpdate(sql);
        }catch(SQLException ex){
            throw new SQLException("Erro ao tentar alterar as informações do usuário "+ex.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }
    
}
