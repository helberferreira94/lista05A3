import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
       int n = 5;
        
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite um número" ); 
       n= teclado.nextInt();  
       teclado.close();
        
       ImprimeNumeros(n);
        }
       

    static void ImprimeNumeros(int n){
        int i, j;
        
        for (i=1; i <= n; i++) {
            for (j=0; j<i; j++){
                System.out.print(i+" ");
            } 
            System.out.println(" ");




    }



}
}



