package Models;

import Exceptions.MagiaInsuficienteException;
import java.util.Random;

public class Elfo extends Raca {
    Random rd = new Random();
    
    public Elfo(String nome){
        super(nome);
    }

    public int fireBall() throws MagiaInsuficienteException{
        this.verificarMana(10);
        return (rd.nextInt(180) + 21) * this.forca;
    }

    public int arrowAtack(){
        return (rd.nextInt(80) + 21) * this.forca;
    }

    public int superStarAtack() throws MagiaInsuficienteException{
        this.verificarMana(5);
        return (rd.nextInt(130) + 21) * this.forca;
    }

    public int chuteAlto(){
        return (rd.nextInt(80) + 21) * this.forca;
    }

    public int rateiraDirecionada(){
        return (rd.nextInt(30) + 21) * this.forca;
    }
}
