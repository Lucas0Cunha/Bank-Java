package bank.study2;

public class BuscaBinaria {

    public static int buscaBinaria(int[] vetor, int alvo) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int i = 0;

        while (esquerda <= direita) {
            System.out.println("Processo binário : "+(i+1));
            i++;
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == alvo) {

                return meio; // Encontrou o número!
            } else if (vetor[meio] < alvo) {
                esquerda = meio + 1; // Procurar na metade direita
            } else {
                direita = meio - 1; // Procurar na metade esquerda
            }
        }

        return -1; // O número não está no vetor
    }

    public static void main(String[] args) {
        int[] vetor = {1, 4, 8, 15, 42, 50, 67, 99};
        int alvo = 67;

        int resultado = buscaBinaria(vetor, alvo);

        if (resultado != -1) {
            System.out.println("Encontrou o número " + alvo + " na posição " + resultado);
        } else {
            System.out.println("Número " + alvo + " não encontrado no vetor.");
        }
        buscaNormal(vetor,alvo);
    }

    public static int buscaNormal(int[] vetor, int alvo){
        for (int i =0; i<vetor.length; i++){
            int v = vetor[i];
            System.out.println("Processo normal: "+(i+1));
            if (v==alvo){
                return i;
            }
        }

        return -1;
    }


}
