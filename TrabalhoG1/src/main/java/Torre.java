/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Torre {
    LocalTorre local;
    Double Vida, DDA, armadura, MR;
    Boolean possui_barricada;
    int barricadas = 5;
    
    public void CalculoBarricada(int tempo_jogo) { //Tempo em segundos
        if(tempo_jogo >= 460){
            this.possui_barricada = false;
            this.barricadas = 0;
            this.armadura = this.armadura*0.5;
            this.MR = this.MR*0.5;
        }
    }
}
