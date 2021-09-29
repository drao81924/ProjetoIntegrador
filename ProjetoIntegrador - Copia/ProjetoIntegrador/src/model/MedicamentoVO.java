/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yuri e Igor
 */
public class MedicamentoVO {

    private int idMed;
    private String medicamento;
    private String sobre;
    private String contraindicacao;
    private String numeroCas;

    public MedicamentoVO() {
    }

    /**
     *
     * @param idMed
     * @param medicamento
     * @param sobre
     * @param contraindicacao
     * @param numeroCas
     */
    public MedicamentoVO(int idMed, String medicamento, String sobre, String contraindicacao, String numeroCas) {
        this.idMed = idMed;
        this.medicamento = medicamento;
        this.sobre = sobre;
        this.contraindicacao = contraindicacao;
        this.numeroCas = numeroCas;
    }

    /**
     *
     * @return
     */
    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getContraindicacao() {
        return contraindicacao;
    }

    public void setContraindicacao(String contraindicacao) {
        this.contraindicacao = contraindicacao;
    }

    public String getNumeroCas() {
        return numeroCas;
    }

    public void setNumeroCas(String numeroCas) {
        this.numeroCas = numeroCas;
    }

    @Override
    public String toString() {
        return "medicamento{" + "idMed=" + idMed + ", medicamento=" + medicamento + ", sobre=" + sobre + ", contraindicacao=" + contraindicacao + ", numeroCas=" + numeroCas + '}';
    }
    
    
    

}
