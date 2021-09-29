/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import java.util.Scanner;
import model.UsuarioVO;

/**
 *
 * @author FNACPOA
 */
public class CUsuario {
    Scanner ler = new Scanner(System.in);
    
    ArrayList<UsuarioVO> usuarios = new ArrayList<>();
    
    public void UsuarioMok(){
    
}
    
    public void addUsuario(UsuarioVO uVO){
        this.usuarios.add(uVO);
    }
    
    public ArrayList<UsuarioVO> getUsuario() {
        return usuarios;
}
    
    public Boolean verificaCliente(int idUsuario) {
        boolean verUsuario = false;
        for (UsuarioVO u : usuarios) {
            if(u.getIdUsuario()==idUsuario){
                verUsuario=true;
                System.out.println("Usuário: " + u.getNome());
            }
        }
        return verUsuario;
    }
    
    
    public void atualizaCliente(int idUsuario){
        int opcao;
        for(UsuarioVO u : usuarios){
            
            if(u.getIdUsuario()==idUsuario){
                System.out.println("Deseja mudar seu nome do usuario? 1-Sim 2-não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o nome: ");
                    ler.nextLine();
                    u.setNome(ler.next());
                }
                System.out.println("Deseja mudar seu e-mail registrado? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o E-mail: ");
                    u.setEmail(ler.next());
                }
                System.out.println("Deseja mudar sua senha? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o novo E-mail: ");
                    u.setSenha(ler.next());
                }
                System.out.println("Deseja mudar seu Telefone? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o endereço: ");
                    u.setTelefone(ler.next());
                }
                System.out.println("Informação do cliente "+ u.getIdUsuario());
                System.out.println("Nome: "+u.getNome());
                System.out.println("E-mail: "+u.getEmail());
                System.out.println("Senha: "+u.getSenha());
                System.out.println("Telefone: "+u.getTelefone());
                
            }
        }
    }
    
    int idUsuarioo=1;
    
    public int addIdUsuario(){
        return this.idUsuarioo++;
    }
    
    
    
    
}
