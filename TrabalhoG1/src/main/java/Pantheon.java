/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
 
/**
 *
 * @author pedro
 */
public class Pantheon extends Campeao {
    
    Random gerador = new Random();

    public void definir_Pantheon(){
        this.nome = "Pantheon";
        this.vida = 433.0;
        this.DDA = 50.7;
        this.mana = 210.0;
        this.DPH = 0.0;
        this.posicao = PosicaoCampeao.TOP;
    }
    
    public void Ataque_basico(Campeao alvo) {
        Double dano = 20 + 2*this.DDA;
        alvo.vida = alvo.vida - dano;
        this.mana = this.mana + 100;
        System.out.println(alvo.nome+" perdeu "+dano+" de vida");
        System.out.println("Pantheon regenerou 100 de sua mana");
    }
    
    public void Hab_Q(Campeao alvo) {
        if(gerador.nextInt(100) <= 20){
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 45){
            Double dano = 65 + 1.4*this.DDA;
            alvo.vida = alvo.vida - dano;
            this.mana = this.mana - 45;
            System.out.println(alvo.nome+" perdeu "+dano+" de vida");
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
    
    public void Hab_W(Campeao alvo) {
        if(gerador.nextInt(100) <= 20) {
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 55) {
            Double dano = 50 + this.DPH;
            alvo.vida = alvo.vida - dano;
            this.mana = this.mana - 55;
            System.out.println(alvo.nome+" perdeu "+dano+" de vida");
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
        
    public void Hab_E(Campeao alvo) {
        if(gerador.nextInt(100) <= 40) {
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 45) {
            Double dano = 40 + 1.8*this.DDA;
            alvo.vida = alvo.vida - dano;
            this.mana = this.mana - 45;
            System.out.println(alvo.nome+" perdeu "+dano+" de vida");
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
}
