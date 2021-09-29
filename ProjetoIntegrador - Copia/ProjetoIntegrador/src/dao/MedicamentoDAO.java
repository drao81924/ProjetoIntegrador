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
import model.MedicamentoVO;
import persistencia.Conexao;

/**
 *
 * @author Yuri e Igor
 */
public class MedicamentoDAO {

    public void cadastrarMedicamento(MedicamentoVO mVO) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;//String que receberá o comando SQL

            sql = "insert into medicamento(idMed,medicamento,sobre,contraindicacao,numeroCas)"
                    + "values(null,'" + mVO.getMedicamento() + "','" + mVO.getSobre() + "','"
                    + mVO.getContraindicacao() + "','" + mVO.getNumeroCas() + "')";
            //executa o comando que guardamos dentro da String sql
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir medicamento..");
        } finally {
            stat.close();
            con.close();
        }
    }

    public ArrayList<MedicamentoVO> buscaMedicamento() throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from medicamento";

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<MedicamentoVO> medicamentos = new ArrayList<>();

            while (rs.next()) {
                MedicamentoVO m = new MedicamentoVO();
                m.setIdMed(rs.getInt("idMed"));
                m.setMedicamento(rs.getString("medicamento"));
                m.setSobre(rs.getString("sobre"));
                m.setContraindicacao(rs.getString("contraindicacao"));
                m.setNumeroCas(rs.getString("numeroCas"));

                medicamentos.add(m);
            }
            return medicamentos;
        } catch (SQLException ex) {
            throw new SQLException("Erro ao buscar Medicamento." + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void deletarMedicamento(int idMed) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "delete from medicamento where idMed = " + idMed;
            stat.execute(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao deletar Medicamento. " + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

    public void editarMedicamento(MedicamentoVO mVO) throws SQLException {
        //Busca conexão com o banco de dados
        Connection con = Conexao.getConexao();
        //cria um objeto "stat" responsável por enviar os comandos de banco do Java para serem sexdcutados dentro do BD
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "update medicamento set "
                    + "medicamento='" + mVO.getMedicamento()+ "',"
                    + "sobre='" + mVO.getSobre()+ "',"
                    + "contraindicacao='" + mVO.getContraindicacao()+ "',"
                    + "numeroCas='" + mVO.getNumeroCas()+ "',"
                    + "where idMed=" + mVO.getIdMed()+ "";

            stat.executeUpdate(sql);
        } catch (SQLException ex) {
            throw new SQLException("Erro ao tentar alterar as informações do medicamento. " + ex.getMessage());
        } finally {
            con.close();
            stat.close();
        }
    }

}
