
import java.util.Scanner;



/**
 *
 * @author ansal
 * Crear un programa que dado un número determine si es par o impar.
 */
public class Ejercicio1 {
    public static void main (String [] args){
    Scanner teclado = new Scanner(System.in); 
    int n;
    
    System.out.print("Por favor ingrese el numero a evaluar :");
    n = teclado.nextInt();
    
    if(n % 2 == 0) {
        System.out.println(n+" Es par");
    }else{
        System.out.println(n+" Es impar");
    }
    }
            
    
    
    
    
} 