import Models.Raca;

public class Arena {
    private Raca personagem1;
    private Raca personagem2;

    public Arena(Raca personagem1, Raca personagem2){
        this.personagem1 = personagem1;
        this.personagem2 = personagem2;
    }

    public void duelar(){
        while (this.personagem1.verificarVida() && this.personagem2.verificarVida()) {
            personagem2.setVida(0);
        }
        this.checkChampion();
    }

    private void checkChampion(){
        if (this.personagem1.verificarVida()){
            System.out.println("Personagem1: " + personagem1.getNome() + " foi o grande campeao!");
        }
        if (this.personagem2.verificarVida()){
            System.out.println("Personagem2: " + personagem2.getNome() + " foi o grande campeao!");
        }
    }
}
