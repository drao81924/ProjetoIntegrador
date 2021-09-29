/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.MedicamentoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MedicamentoVO;

/**
 *
 * @author Yuri e Igor
 */
public class MedicamentoServicos {
    public void cadastraUsuario(MedicamentoVO mVO) throws SQLException {
        MedicamentoDAO mDAO = DAOFactory.getMedicamentoDAO();
        mDAO.cadastrarMedicamento(mVO);
    }

    public ArrayList<MedicamentoVO> buscarMedicamentos() throws SQLException {
        MedicamentoDAO mDAO = DAOFactory.getMedicamentoDAO();
        return mDAO.buscaMedicamento();
    }

    public void deletarMedicamento(int idMed) throws SQLException {
        MedicamentoDAO mDAO = DAOFactory.getMedicamentoDAO();
        mDAO.deletarMedicamento(idMed);
    }
    
}
