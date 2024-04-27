import java.util.concurrent.ThreadLocalRandom;

public class SorteioDeNumeros {
    public static void main(String[] args) throws Exception {
       numerosSorteados();
    }

    static void numerosSorteados () {
        int [] numerosAsortear = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                        38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};

        int numerosSorteados = 0;
        int numerosDaSorte = 0;
        int numeroBase = 60;

        while (numerosSorteados < 6 && numerosDaSorte < numerosAsortear.length) {
            int numeros = numerosAsortear[numerosSorteados];
            int valorSorteio = valorSorteado();

            System.out.println("O número sorteado é: " + valorSorteio);
            if(numeroBase >= valorSorteio) {
                System.out.println("A dezena de número " + numeros + " foi sorteada!");
                numerosSorteados++;
            }

            numerosDaSorte++;
        }
          
    }

    static int valorSorteado() {
        return ThreadLocalRandom.current().nextInt(1, 60);
    }
}

