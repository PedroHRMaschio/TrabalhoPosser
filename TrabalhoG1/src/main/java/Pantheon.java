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
        this.vida = 433.0;
        this.DDA = 50.7;
        this.mana = 210.0;
        this.DPH = 0.0;
    }
    
    public void Ataque_basico(Campeao alvo) {
        alvo.vida = alvo.vida - (20 + 2*this.DDA);
        this.mana = this.mana + 100;
    }
    
    public void Hab_Q(Campeao alvo) {
        if(gerador.nextInt(100) <= 20){
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 45){
            alvo.vida = alvo.vida - (65 + 1.4*this.DDA);
            this.mana = this.mana - 45;
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
    
    public void Hab_W(Campeao alvo) {
        if(gerador.nextInt(100) <= 20) {
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 55) {
            alvo.vida = alvo.vida - (50 + this.DPH);
            this.mana = this.mana - 55;
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
        
    public void Hab_E(Campeao alvo) {
        if(gerador.nextInt(100) <= 40) {
            System.out.println("Pantheon errou a habilidade");
        }else if(this.mana >= 45) {
            alvo.vida = alvo.vida - (40 + 1.8*this.DDA);
            this.mana = this.mana - 45;
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
}
