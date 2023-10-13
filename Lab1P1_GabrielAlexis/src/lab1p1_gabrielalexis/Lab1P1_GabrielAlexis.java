
package lab1p1_gabrielalexis;

import java.util.Scanner;


public class Lab1P1_GabrielAlexis {

 
    public static void main(String[] args){ 
            
        Scanner scanner = new Scanner(System.in);
           
        int numero;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija el ejercicio: ");
        numero = scanner.nextInt();
        
        if(numero ==1){
            int num1 = 15;
            int num2 = 30;
            int result;
            result = num1 * num2;
            System.out.print("Resultado: ");
            System.out.println(result);
            
        }else if(numero ==2){
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario = scanner.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario1 = scanner.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario2 = scanner.nextInt();
            
            double promedio =(numeroUsuario + numeroUsuario1+ numeroUsuario2)/3;
            
            System.out.println("Promedio: "+ promedio);
            
        }else{
            System.out.println("Salio del programa.");
        }
    }

    
}
