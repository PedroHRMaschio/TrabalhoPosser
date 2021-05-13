/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Campeao {
    public String nome, origem, lore;
    public Double vida, mana, DDA, DPH, ATKS, VDM, AH, armadura, MR, alcance;// DDA = dano de ataque; DPH = Poder de habilidade; ATKS = Velicidade de ataque; VDM = velocidade de movimento; AH = aceleração de habilidade;
    public int Ouro;
    public PosicaoCampeao posicao;
    
    public void Set_campeao(String nome, String origem, String lore){
        this.nome = nome;
        this.origem = origem;
        this.lore = lore;
    }
    
    public void Set_atributos_base(Double vida, Double mana, Double DDA, Double DPH) {
        this.vida = vida;
        this.mana = mana;
        this.DDA = DDA;
        this.DPH = DPH;
    }
    
    public void Set_atributos(Double ATKS, Double VDM, Double AH, Double armadura, Double MR, Double alcance){
        this.ATKS = ATKS;
        this.VDM = VDM;
        this.AH = AH;
        this.armadura = armadura;
        this.MR = MR;
        this.alcance = alcance;
    }

}