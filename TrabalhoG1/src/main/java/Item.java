/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Item {
    String nome, descricao, desc_passiva, desc_ativa;
    boolean hab_passiva = false, hab_ativa = false;
    Double vida, mana, DDA, DPH, ATKS, VDM, AH;
    
    public void Mostrar_passiva() {
        if(this.hab_passiva){
            System.out.println("Item: "+this.nome);
            System.out.println("Passiva: "+this.desc_passiva);
        }else {
            System.out.println("O item não possui habilidade passiva");
        }
    }
    
    public void Mastrar_ativa() {
        if(this.hab_ativa){
            System.out.println("Item: "+this.nome);
            System.out.println("Ativa: "+this.desc_ativa);
        }else {
            System.out.println("O item não possui habilidade ativa");
        }
    }
    
    public void Mostrar_atributos() {
        System.out.println("vida: "+this.vida);
        System.out.println("Mana: "+this.mana);
        System.out.println("Dano de ataque: "+this.DDA);
        System.out.println("Poder de Habilidade: "+this.DPH);
        System.out.println("Velocidade de ataque: "+this.ATKS+"%");
        System.out.println("Velocidade de movimento: "+this.VDM);
        System.out.println("Aceleração de habilidade: "+this.AH);
    }
    
    
}