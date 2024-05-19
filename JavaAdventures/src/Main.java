import Models.Anao;
import Models.Humano;

public class Main {
    public static void main(String[] args) {
        Anao anao = new Anao("Joao");
        Humano humano = new Humano("Lucas");
        anao.setVida(6000);
        anao.setForca(10);
        anao.setMagia(20);
        anao.setAgilidade(15);
        anao.setInteligencia(50);
        anao.incrementLevel();

        humano.setVida(4000);
        humano.setForca(10);
        humano.setMagia(20);
        humano.setAgilidade(15);
        humano.setInteligencia(50);
        humano.incrementLevel();

        Arena arena = new Arena(anao, humano);

        arena.duelar();
    }
}
