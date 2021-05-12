import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String [] args ) throws IOException{
        Pantheon pantheon = new Pantheon();

        pantheon.definir_Pantheon();

        MasterYi masterYi = new MasterYi();

        masterYi.definir_Yi();

        System.out.println("Bem vindo ao League of Legends em Java\n");
        System.out.println("INSTRUCÕES:");
        System.out.println("Nessa abstracão apresentamos a simulacão de um combate entre MonoDedoYi e Pantheon");
        System.out.println("O primeiro a jogar e o MasterYi e o jogador deve selecionar a habilidade sendo Q, W ou E");
        System.out.println("A seguir Pantheon joga seguindo a mesma logica do jogador anterior\n");
        
        char input = 'q';

        while(true){    
            System.out.println("Vez do MonoDedo, por favor digite a habilidade");
            try {
                input = (char)System.in.read();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            switch(input){
                case 'q':
                    masterYi.Hab_Q(pantheon);
                    break;
                case 'w':
                    masterYi.Hab_W();
                    break;
                case 'e':
                    masterYi.Hab_E(pantheon);
                    break;
                default:
                    System.out.println("Habilidade invalida");
                    break;
            }

            if(pantheon.vida <= 0){
                System.out.println("MonoDedo Venceu a luta (novidade)");
                break;
            }
            
            System.out.println("Vez do Pantheon, por favor digite a habilidade");
            
            input = (char)System.in.read();
            
            switch(input){
                case 'q':
                    pantheon.Hab_Q(masterYi);
                    break;
                case 'w':
                    pantheon.Hab_W(masterYi);
                    break;
                case 'e':
                    pantheon.Hab_E(masterYi);
                    break;
                default:
                    System.out.println("Habilidade invalida");
                    break;
            }

            if(masterYi.vida <= 0){
                System.out.println("Pantheon Venceu a luta");
                break;
            }
        }
    }
}
