/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsuarioDAO;
import dao.DAOFactory;
import model.UsuarioVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Yuri e Igor
 */
public class UsuarioServicos {

    public void cadastraUsuario(UsuarioVO uVO) throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.cadastrarUsuario(uVO);
    }

    public ArrayList<UsuarioVO> buscarUsuarios() throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        return uDAO.buscaUsuario();
    }

    public void deletarUsuario(int idUsuario) throws SQLException {
        UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();
        uDAO.deletarUsuario(idUsuario);
    }

}
