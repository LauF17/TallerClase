import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la Temperatura en grados Celsius ");
        double Celsius = sc.nextDouble();
        
        double Fahrenheit  = (Celsius* 9.0/5.0) + 32;

        double Kelvin = Celsius + 273.15;

        System.out.println("Temperatura en Celsius "+ Celsius);
        System.out.println("Temperatura en Fahrenheit: "+ Fahrenheit);
        System.out.println("Temperatura en Kelvin: "+ Kelvin);
        sc.close();
     }
    
}
