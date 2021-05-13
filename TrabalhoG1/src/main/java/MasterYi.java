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
public class MasterYi extends Campeao{
    Random gerador = new Random();

    public void definir_Yi(){
        this.vida = 444.0;
        this.DDA = 55.0;
        this.mana = 180.0;
        this.DPH = 0.0;
        this.posicao = PosicaoCampeao.TOP;
    }
    
    public void Ataque_basico(Campeao alvo) {
        alvo.vida = alvo.vida - (20 + 2*this.DDA);
        this.mana = this.mana + 100;
    }
    
    public void Hab_Q(Campeao alvo) {
        if(gerador.nextInt(100) <= 20){
            System.out.println("Master Yi errou a habilidade");
        }else if(this.mana >= 70){
            alvo.vida = alvo.vida - (25 + this.DDA);
            this.mana = this.mana - 70;
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
    
    public void Hab_W() {
        if(this.mana >= 50) {
            this.mana = this.mana - 50;
            this.vida = this.vida + (60 + 0.6*this.DPH);
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
        
    public void Hab_E(Campeao alvo) {
        if(gerador.nextInt(100) <= 40) {
            System.out.println("Mater Yi errou a habilidade");
        }else if(this.mana >= 50) {
            alvo.vida = alvo.vida - (40 + 1.8*this.DDA);
            this.mana = this.mana - 50;
        }else{
            System.out.println("Mana insuficiente para usar esta habilidade");
        }
    }
}

