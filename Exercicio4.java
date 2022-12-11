import java.util.Scanner;

public class Exercicio4 {
    /*Faça um programa, com uma função que necessite de um argumento.
     A função retorna o valor de caractere ‘P’, 
    se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo. */
    public static void main(String[] args) {
        ImprimeArgumento();

    }   
    
        public static void ImprimeArgumento(){
            int numero;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número : ");
            numero = teclado.nextInt();
            teclado.close();
            if (numero > 0){
                System.out.println("O caractere é P ");
            }
            else {
                System.out.println("O caractere é N ");
            }       
        }
    }

    

 


