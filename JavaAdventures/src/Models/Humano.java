package Models;

import java.util.Random;

import Exceptions.MagiaInsuficienteException;

public class Humano extends Raca {

    Random rd = new Random();

    public Humano(String nome){
        super(nome);
    }

    public int jabDireto(){
        return (rd.nextInt(80) + 21) * this.forca;
    }

    public int quebraQueixo() throws MagiaInsuficienteException{
        this.verificarMana(10);
        return (rd.nextInt(130) + 21) * this.forca;
    }

    public int petelecoQuente(){
 
        return (rd.nextInt(30) + 21) * this.forca;
    }

    public int chuteGiratorio(){
        return (rd.nextInt(80) + 21) * this.forca; 
    }

    public int tapaSeco()throws MagiaInsuficienteException{
        this.verificarMana(5);
        return (rd.nextInt(180) + 21) * this.forca;
    }
}
