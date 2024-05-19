package Models;

import Exceptions.MagiaInsuficienteException;
import Interfaces.Lutador;

public abstract class Raca implements Lutador{
    protected String nome;
    protected int vida; 
    protected int magia; 
    protected int forca;
    protected int agilidade; 
    protected int inteligencia; 
    protected int level = 1;
    protected String[] ataques;

    public Raca(String nome, String[] ataques){
        System.out.println("ola, " + nome);
        this.nome = nome;
        this.ataques = ataques;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
       return "Nome: " + nome + "\n" + 
        "Vida: " + vida + "\n" +
        "Forca: " + forca + "\n" +
        "Agilidade: " + agilidade + "\n" +
        "Inteligencia: " + inteligencia + "\n" +
        "Level: " + level + "\n" +
        "Magia: " + magia;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public void setMagia(int magia){
        this.magia = magia;
    }

    public void setForca(int forca){
        if (forca >= 2) {
            this.forca = forca;
        } else {
            this.forca = 2;
        }
    }

    public void setAgilidade(int agilidade){
        this.agilidade = agilidade;
    }

    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }

    public void incrementLevel(){
        this.level++;
    }


    protected void verificarMana(int custo) throws MagiaInsuficienteException{
        if (this.magia >= custo) {
            throw new MagiaInsuficienteException();
        }
        this.magia -= custo;
    }

    public int atacar(){
        System.out.println(this.ataques()[0]);
        return 0;
    }

    public String[] ataques(String[] ataques){
        return ataques;
    }

    public void receberDano(int dano){
        this.vida -= dano;
    }

    public boolean verificarVida(){
        if (this.vida > 0){
            return true;
        } else {
            return false;
        }
    }
}
