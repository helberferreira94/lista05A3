import java.util.Scanner;
public class Exercicio3 {
    /*Faça um programa, com uma função que necessite de três argumentos
     e que forneça a soma desses três argumentos. */
    public static void main(String[] args) {
        
        SomaNumeros(0, 0, 0);     
    
    }
    static void SomaNumeros(double a, double b, double c){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o argumento a: ");	        
	    a = teclado.nextDouble();
        System.out.println("Digite o argumento b ");
        b = teclado.nextDouble();
        System.out.println("Digite o argumento c ");
        c = teclado.nextDouble();
        teclado.close();
        double soma = a + b + c;
        System.out.println("A soma dos três argumentos é: " + soma);
    }
        
    }

