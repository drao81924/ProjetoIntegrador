/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author jairb
 */
public class DAOFactory {

    private static UsuarioDAO usuarioDAO = new UsuarioDAO();
    

    public static UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }
    
    private static MedicamentoDAO medicamentoDAO = new MedicamentoDAO();

    public static MedicamentoDAO getMedicamentoDAO(){
        return medicamentoDAO;
    }

}
