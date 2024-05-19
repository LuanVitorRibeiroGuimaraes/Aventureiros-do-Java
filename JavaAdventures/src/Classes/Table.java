package Classes;

import Models.Raca;

public class Table {
    public static void imprimirAtributos(Raca... personagens) {
        String[][] dados = new String[personagens.length + 1][];
        dados[0] = new String[]{"Nome", "Vida", "Magia", "Força", "Agilidade", "Inteligência", "Level"};

        for (int i = 0; i < personagens.length; i++) {
            Raca p = personagens[i];
            dados[i + 1] = new String[]{p.getNome(), Integer.toString(p.getVida()), Integer.toString(p.getMagia()),
                    Integer.toString(p.getForca()), Integer.toString(p.getAgilidade()), Integer.toString(p.getInteligencia()),
                    Integer.toString(p.getLevel())};
        }

        imprimirTabela(dados);
    }

    private static void imprimirTabela(String[][] dados) {
        int[] larguras = new int[dados[0].length];
        for (String[] linha : dados) {
            for (int i = 0; i < linha.length; i++) {
                larguras[i] = Math.max(larguras[i], linha[i].length());
            }
        }

        for (String[] linha : dados) {
            for (int i = 0; i < linha.length; i++) {
                System.out.printf("%-" + (larguras[i] + 2) + "s", linha[i]); // Adiciona 2 para espaçamento entre colunas
            }
            System.out.println();
        }
        System.out.println('\n');
    }
}

