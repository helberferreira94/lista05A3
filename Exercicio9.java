import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int value;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        value = teclado.nextInt();
        teclado.close();       
        String inteiro = Integer.toString(value);
       
        System.out.println(reverse(inteiro));

        
        }
        
        
        public static String reverse (String value){
            String reverse = "";
            for (int i = (value.length()-1); i>=0; i--){
                reverse += value.charAt(i);                
            }
            return reverse;
        }   
}




