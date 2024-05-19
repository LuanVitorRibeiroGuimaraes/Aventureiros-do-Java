package Models;

import java.lang.reflect.Method;

import Exceptions.MagiaInsuficienteException;
import Interfaces.Lutador;
import java.util.Random;

public abstract class Raca implements Lutador {
    protected String nome;
    protected int vida; 
    protected int magia; 
    protected int forca;
    protected int agilidade; 
    protected int inteligencia; 
    protected int level = 1;
    protected String[] ataques;

    public Raca(String nome, String[] ataques){
        this.nome = nome;
        this.ataques = ataques;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    public int getMagia(){
        return this.magia;
    }
    public void setMagia(int magia){
        this.magia = magia;
    }

    public int getForca(){
        return this.forca;
    }
    public void setForca(int forca){
        if (forca >= 2) {
            this.forca = forca;
        } else {
            this.forca = 2;
        }
    }

    public int getAgilidade(){
        return this.agilidade;
    }
    public void setAgilidade(int agilidade){
        this.agilidade = agilidade;
    }

    public int getInteligencia(){
        return this.inteligencia;
    }
    public void setInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }

    public int getLevel(){
        return this.level;
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

    public void incrementLevel(){
        this.level++;
    }


    protected void verificarMana(int custo) throws MagiaInsuficienteException{
        if (this.magia < custo) {
            throw new MagiaInsuficienteException(this.nome);
        }
        this.magia -= custo;
    }

    public String[] getAtaques(){
        return this.ataques;
    }

    public int atacar(){
        return 0;
    }

    public int getAtaquesLength(){
        return this.ataques.length;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }


    public boolean estaVivo(){
        return this.vida > 0;
    }

    public void getStatus(){
        System.out.println("----------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Magia: " + this.magia);
        System.out.println("----------------------------------\n\n");
    }

}
