package Atividade1;
public class atividade5 {
    public static void main(String[] args) {
        // Criando um vetor de Strings com 5 posições
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};

        // Criando um novo vetor para armazenar os nomes após a remoção do segundo nome
        String[] nomesAtualizados = new String[nomes.length];

        // Copiando os elementos do vetor original, exceto o segundo nome
        int index = 0;
        for (int i = 0; i < nomes.length; i++) {
            if (i != 1) {  // Ignora o segundo elemento (índice 1)
                nomesAtualizados[index] = nomes[i];
                index++;
            }
        }

        // Redimensionando o vetor para remover os espaços nulos
        nomesAtualizados = java.util.Arrays.copyOf(nomesAtualizados, index);

        // Adicionando um novo nome no final
        String[] nomesFinal = new String[nomesAtualizados.length + 1];
        for (int i = 0; i < nomesAtualizados.length; i++) {
            nomesFinal[i] = nomesAtualizados[i];
        }
        nomesFinal[nomesFinal.length - 1] = "Fernando";

        // Imprimindo todos os nomes da lista
        for (String nome : nomesFinal) {
            System.out.println(nome);
        }
    }
}
