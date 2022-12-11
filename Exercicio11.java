import java.util.Scanner;

public class Exercicio11 {
    public static String mostraData(String dat, String[] extenso) {
        StringBuilder saida = new StringBuilder();

        extenso = dat.split("/");

        for (int x = 0; x < 3; x++) {
            if (x == 0) {
                saida.append(extenso[x]);
                saida.append(" de ");
            }

            if (x == 1) {
                if (extenso[x].compareTo("01") == 0) {
                    saida.append("Janeiro");
                } else if (extenso[x].compareTo("02") == 0) {
                    saida.append("Fevereiro");
                } else if (extenso[x].compareTo("03") == 0) {
                    saida.append("Março");
                } else if (extenso[x].compareTo("04") == 0) {
                    saida.append("Abril");
                } else if (extenso[x].compareTo("05") == 0) {
                    saida.append( "Maio");
                } else if (extenso[x].compareTo("06") == 0) {
                    saida.append("Junho");
                } else if (extenso[x].compareTo("07") == 0) {
                    saida.append("Julho");
                } else if (extenso[x].compareTo("08") == 0) {
                    saida.append("Agosto");
                } else if (extenso[x].compareTo("09") == 0) {
                    saida.append("Setembro");
                } else if (extenso[x].compareTo("10") == 0) {
                    saida.append("Outubro");
                } else if (extenso[x].compareTo("11") == 0) {
                    saida.append("Novembro");
                } else if (extenso[x].compareTo("12") == 0) {
                    saida.append("Dezembro");
                } else {
                    saida.append(extenso[x]);
                }

                saida.append(" de ");
            }

            if (x == 2) {
                saida.append(extenso[x]);
            }
        }

        return saida.toString();

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] porextenso = new String[3];
        String data = "";

        do {
            System.out.print("Digite a data no modelo dd/mm/aaaa: ");
            data = teclado.nextLine();

            if (data.length() != 10) {
                System.out.println("Data Inválida!");
            }
        } while (data.length() != 10);
        teclado.close();
        System.out.println(mostraData(data, porextenso));
    }

}

    
