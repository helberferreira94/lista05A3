import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {

    public static int jogodeCraps(int numero_do_dado) {
        Random sorteio = new Random();
        int primeiroDado = 0;
        int segundoDado = 0;
        primeiroDado = sorteio.nextInt(6) + 1;
        segundoDado = sorteio.nextInt(6) + 1;
        return primeiroDado + segundoDado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalDados = 2;
        int numeroDigitado = 0;
        int ponto = 0;
        boolean teste = true;

        do {
            System.out.println("[9] para jogar os dados na mesa");
            System.out.println("[0] para sair da mesa de jogo");
            numeroDigitado = teclado.nextInt();
            totalDados = jogodeCraps(numeroDigitado);

            if (numeroDigitado < 0 || numeroDigitado > 9) {
                System.out.println("Essa opção não é válida !!!");
            } else if (numeroDigitado == 9) {
                System.out.println(" A soma dos números dos dados é: " + totalDados);
                if (totalDados == 7 || totalDados == 11) {
                    System.out.println(" PARABÉNS, você é um natural");
                } else if (totalDados == 2 || totalDados == 3 || totalDados == 12) {
                    System.out.println(" Craps, você perdeu");
                } else if (totalDados == 4 || totalDados == 5 || totalDados == 6 || totalDados == 8
                        || totalDados == 9 || totalDados == 10) {
                    if (teste) {
                        teste = false;
                        ponto = totalDados;
                    } else if (ponto == totalDados) {
                        System.out.println(" VITÓRIA!");
                    }
                }
            }
        } while (numeroDigitado != 0);
        System.out.println(" Fim de Jogo! ");
        teclado.close();

    }

}
