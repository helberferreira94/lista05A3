public class Exercicio14 {
    public static void main(String[] args) {

        int x, y;
        int matriz[][] = new int[3][3];

        matriz[0][0] = 2;
        matriz[0][1] = 9;
        matriz[0][2] = 4;
        matriz[1][0] = 7;
        matriz[1][1] = 5;
        matriz[1][2] = 3;
        matriz[2][0] = 6;
        matriz[2][1] = 1;
        matriz[2][2] = 8;

        boolean quadradoMagico = true;
        int linha1 = 0;
        int coluna1 = 0;
        

        for (x = 0; x < 3; x++) {
            int linhatotal = 0;
            int colunatotal = 0;
            for (y = 0; y < 3; y++) {
                if (y == 0) {
                    linha1 += matriz[x][y];
                    coluna1 += matriz[y][x];
                }
                linhatotal += matriz[x][y];
                colunatotal += matriz[y][x];

            }
            if (linhatotal != linha1 || linhatotal != colunatotal || colunatotal != coluna1 || coluna1 != linha1) {
                quadradoMagico = false;

            }
        }

        if (quadradoMagico) {
            System.out.println("É um quadrado magico:");
        } else {
            System.out.println("Não é um quadrado magico.");

        }

    }
}
