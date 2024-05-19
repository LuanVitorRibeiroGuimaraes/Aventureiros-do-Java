package Models;

import java.util.Random;

import Exceptions.MagiaInsuficienteException;

public class Humano extends Raca {

    Random rd = new Random();

    public Humano(String nome){
        super(nome, new String[]{
            "jabDireto",
            "quebraQueixo",
            "petelecoQuente",
            "chuteGiratorio",
            "tapaSeco"
        });
    }

    public int jabDireto() throws MagiaInsuficienteException{
        return (rd.nextInt(80) + 21) * this.forca;
    }

    public int quebraQueixo() throws MagiaInsuficienteException{
        this.verificarMana(10);
        return (rd.nextInt(130) + 21) * this.forca;
    }

    public int petelecoQuente() throws MagiaInsuficienteException{
        return (rd.nextInt(30) + 21) * this.forca;
    }

    public int chuteGiratorio() throws MagiaInsuficienteException{
        return (rd.nextInt(80) + 21) * this.forca; 
    }

    public int tapaSeco()throws MagiaInsuficienteException{
        this.verificarMana(5);
        return (rd.nextInt(180) + 21) * this.forca;
    }
}
