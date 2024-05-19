package Models;
import java.util.Random;

import Exceptions.MagiaInsuficienteException;

public class Anao extends Raca {
    private Random rd = new Random();

    public Anao(String nome){
        super(nome, new String[]{
            "paneladaDoThor",
            "pedradaForte",
            "socoBaixo",
            "bicudaNaBarriga",
            "miniBazucada"
        });
    }

    public int paneladaDoThor() throws MagiaInsuficienteException{
        this.verificarMana(5);
        return (rd.nextInt(80) + 21) * this.forca;
    }

    public int pedradaForte() throws MagiaInsuficienteException{
        return (rd.nextInt(130) + 21) * this.forca;
    }

    public int socoBaixo() throws MagiaInsuficienteException{
        return (rd.nextInt(30) + 21) * this.forca;
    }

    public int bicudaNaBarriga() throws MagiaInsuficienteException {
        return (rd.nextInt(81) + 21) * this.forca;
    }

    public int miniBazucada() throws MagiaInsuficienteException{
        this.verificarMana(10);
        return (rd.nextInt(180) + 21) * this.forca;
    }
    
}