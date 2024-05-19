import java.lang.reflect.Method;
import java.util.Random;
import Classes.Table;
import Exceptions.MagiaInsuficienteException;
import Models.Raca;

public class Arena {
    private Raca personagem1;
    private Raca personagem2;

    public Arena(Raca personagem1, Raca personagem2){
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
    }

    public void duelar(){

        this.showFirstStatus();
        while(this.personagem1.estaVivo() && personagem2.estaVivo()) {
            this.atacar(this.personagem1, this.personagem2);
            if(personagem2.estaVivo()){
                atacar(this.personagem2, this.personagem1);
            }
        }
        this.checkChampion();
    }

    private void checkChampion(){
        if (this.personagem1.estaVivo()){
            System.out.println("\n\nPersonagem1: " + personagem1.getNome() + " foi o grande campeao!");
        }
        if (this.personagem2.estaVivo()){
            System.out.println("\n\nPersonagem2: " + personagem2.getNome() + " foi o grande campeao!");
        }
    }

    private void showFirstStatus(){
        System.out.println("\n\n-----------------STATUS-----------------");
        Table.imprimirAtributos(this.personagem1, this.personagem2);
    }

    private void atacar(Raca atacante, Raca apanhante){

        System.out.println("atacante");
        System.out.println(atacante.getNome());


        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(atacante.getAtaquesLength());
        String ataque = atacante.getAtaques()[numeroAleatorio];

        boolean atacked = false;
        while(!atacked){
            try {
                Method metodo = atacante.getClass().getMethod(ataque);
                int dano = (int)metodo.invoke(atacante);
                apanhante.receberDano(dano);
                System.out.println(atacante.getNome() + " atacou " + apanhante.getNome() + " com "+ataque+" causando " + dano + " de dano \n");
                Table.imprimirAtributos(atacante, apanhante);
                atacked = true;
            } catch (Exception e) {
                System.out.println("O personagem " + atacante.getNome() + " nao tem mana");
            }
        }
    }
}
