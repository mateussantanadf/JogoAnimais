/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoanimais;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Perguntas {

// Variáveis e listas ////////////////////
    
    List animalAguaFaz = new ArrayList();
    List animalAgua = new ArrayList();
    List animalTerraFaz = new ArrayList();
    List animalTerra = new ArrayList();
    
    int tipoAnimal, contAgua,  contTerra = 0;

// Métodos ///////////////////////////////
    
    public void pergunta1() {
        
        int resposta = JOptionPane.showConfirmDialog(null, "Pense em um animal.", "Jogo dos Animais",
            JOptionPane.OK_CANCEL_OPTION);
            if (resposta == JOptionPane.OK_OPTION) {
                pergunta2();
            } else if (resposta == JOptionPane.CANCEL_OPTION) {
                System.exit(0);
            } 
    }
    
    public void pergunta2() {
  
        int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?", "Informe",
            JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                tipoAnimal = 0;
                if (!animalAguaFaz.isEmpty()){
                    listaAnimalAguaFaz();
                }
                else {
                pergunta3();
                }
                
            } else if (resposta == JOptionPane.NO_OPTION) {
                tipoAnimal = 1;
                if (!animalTerraFaz.isEmpty()){
                    listaAnimalTerraFaz();
                }
                else {
                pergunta4();
                }
            } 
    }
    
    public void pergunta3() {
  
        int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é Tubarão?", "Informe",
            JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                vence();
                pergunta1();
            } else if (resposta == JOptionPane.NO_OPTION) {
                pergunta5();
            } 
    }
    
    public void pergunta4() {
  
        int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é Macaco?", "Informe",
            JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                vence();
                pergunta1();
            } else if (resposta == JOptionPane.NO_OPTION) {
                pergunta5();
            } else if(resposta == JOptionPane.CLOSED_OPTION){
                
            }
    }        
    
    public void pergunta5() {
        int saida = 0;
        String resposta = JOptionPane.showInputDialog(null, "Qual animal você pensou?", "Entrada",
            JOptionPane.YES_NO_OPTION);
            if (saida == JOptionPane.YES_OPTION) {
                
                if ( tipoAnimal == 0){
                    animalAgua.add(resposta);
                    pergunta6();
                } 
                if (tipoAnimal == 1){
                    animalTerra.add(resposta);
                    pergunta7();
                }
            } else if (saida == JOptionPane.NO_OPTION) {
                alerta();
            }   
    }
    
    public void pergunta6() {
        
        int saida = 0;       
        
        String resposta = JOptionPane.showInputDialog(null, "Um(a) " + animalAgua.get(contAgua) + "_______ mas um(a) Tubarão não.", "Informe",
            JOptionPane.YES_NO_OPTION);
            if (saida == JOptionPane.YES_OPTION) {
                animalAguaFaz.add(resposta);
                contAgua++;
                pergunta1();
            } else if (saida == JOptionPane.NO_OPTION) {
                alerta();
            } 
    }
    
    public void pergunta7() {
        
        int saida = 0;
        
        String resposta = JOptionPane.showInputDialog(null, "Um(a) " + animalTerra.get(contTerra) + "_______ mas um(a) Macaco não.", "Informe",
            JOptionPane.YES_NO_OPTION);
            if (saida == JOptionPane.YES_OPTION) {
                animalTerraFaz.add(resposta); 
                contTerra++;
                pergunta1();
            } else if (saida == JOptionPane.NO_OPTION) {
                alerta();
            } 
    }
    
    public void vence(){
        JOptionPane.showMessageDialog(null, "Eu venci!!!");
    }
    
    public void alerta(){
        JOptionPane.showMessageDialog(null, "INFORME ALGUM VALOR!");
    }
    
    public void listaAnimalAguaFaz(){
        
        for (int i = 0; i < animalAguaFaz.size(); i++) {
            int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + animalAguaFaz.get(i), "Informe",
                JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    listaAnimalAgua();
                } else if (resposta == JOptionPane.NO_OPTION) {
                    
                }
        }
        pergunta3();
    }
                
    
    public void listaAnimalAgua(){
        
        for (int i = 0; i < animalAgua.size(); i++) {

            int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + animalAgua.get(i), "Informe",
                JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    vence();
                    pergunta1();
                } else if (resposta == JOptionPane.NO_OPTION) {

                }
        }
        pergunta3();        
    }
    
    public void listaAnimalTerraFaz(){
        
        for (int i = 0; i < animalTerraFaz.size(); i++) {
            int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou " + animalTerraFaz.get(i), "Informe",
                JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    listaAnimalTerra();
                } else if (resposta == JOptionPane.NO_OPTION) {
                    
                }
        }
        pergunta4();
    }
                
    
    public void listaAnimalTerra(){
        
        for (int i = 0; i < animalTerra.size(); i++) {

            int resposta = JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + animalTerra.get(i), "Informe",
                JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    vence();
                    pergunta1();
                } else if (resposta == JOptionPane.NO_OPTION) {

                }
        }
        pergunta4();        
    }

}
