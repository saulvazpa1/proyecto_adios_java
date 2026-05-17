import java.util.Scanner;

public class Adios
{
    public static int restar(int numero, int numero2) {
    return numero- numero2;
}
    public static void main(String[] args ){
       int numero1,numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el numero 1");
        numero1 = scanner.nextInt();
         System.out.print("Escribe el numero 2");
        numero2 = scanner.nextInt();
        
         int resultado = numero1 + numero2;
         System.out.println("La suma es "+resultado);
         int resultadoResta = restar(numero1, numero2);
System.out.println("La resta es " + resultadoResta);
    
}
    }
