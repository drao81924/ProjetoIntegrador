/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author FNACPOA
 */
public class ServicosFactory {
    private static UsuarioServicos usuarioServicos = new UsuarioServicos();
    
    public static UsuarioServicos getUsuarioServicos(){
        return usuarioServicos;
    }
    
    private static MedicamentoServicos medicamentoServicos = new MedicamentoServicos();
    
    public static MedicamentoServicos getMedicamentoServicos(){
        return medicamentoServicos;
    }
    
}
