import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //Faça uma função que informe a quantidade de 
        //dígitos de um determinado número inteiro informado
            quantidadeDigitos();
       
        
        }
        
        public static void quantidadeDigitos(){
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero;
        numero = teclado.nextInt(); 
        teclado.close();       
        String quantidadeNumeros = Integer.toString(numero);
        System.out.println(quantidadeNumeros.length());
            
    }
       
    }


