/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import java.util.Scanner;
import model.MedicamentoVO;

/**
 *
 * @author FNACPOA
 */
public class CMedicamento {
    Scanner ler = new Scanner(System.in);
    
    ArrayList<MedicamentoVO> medicamentos = new ArrayList<>();
    
    public void MedicamentoMok(){
    
}
    
    public void addMedicamento(MedicamentoVO mVO){
        this.medicamentos.add(mVO);
    }
    
    public ArrayList<MedicamentoVO> getMedicamento() {
        return medicamentos;
}
    
    public Boolean verificaMedicamento(int idMed) {
        boolean verMedicamento = false;
        for (MedicamentoVO m : medicamentos) {
            if(m.getIdMed()==idMed){
                verMedicamento=true;
                System.out.println("Medicamento: " + m.getMedicamento());
            }
        }
        return verMedicamento;
    }
    
    
    public void atualizaMedicamento(int idMed){
        int opcao;
        for(MedicamentoVO m : medicamentos){
            
            if(m.getIdMed()==idMed){
                System.out.println("Deseja mudar o nome do medicamento? 1-Sim 2-não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o nome: ");
                    ler.nextLine();
                    m.setMedicamento(ler.next());
                }
                System.out.println("Deseja mudar a descrição sobre o medicamento? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira a nova descrição: ");
                    m.setSobre(ler.next());
                }
                System.out.println("Deseja mudar a contraindicação do medicamento? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira a nova Contraindicação: ");
                    m.setContraindicacao(ler.next());
                }
                System.out.println("Deseja Atualizar o Número Cas do Medicamento? 1-Sim 2-Não");
                opcao=ler.nextInt();
                if(opcao==1){
                    System.out.println("Insira o Número: ");
                    m.setNumeroCas(ler.next());
                }
                System.out.println("Informação do medicamento "+ m.getIdMed());
                System.out.println("Nome: "+m.getMedicamento());
                System.out.println("Descrição/Sobre: "+m.getSobre());
                System.out.println("Contraindicação: "+m.getContraindicacao());
                System.out.println("Número Cas: "+m.getNumeroCas());
                
            }
        }
    }
    
    int idMedicamento=1;
    
    public int addIdMedicamento(){
        return this.idMedicamento++;
    }
    
}
