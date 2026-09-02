
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa tu base ");
        int  base = sc.nextInt();

        System.out.print("ingresa la altura");
        int  altura = sc.nextInt();

        


        double arearectangulo = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.print("Ingresa el radio");
        double radio = sc.nextDouble();

        double areacirculo = Math.PI * radio * radio;
        double Circunferencia = 2 * Math.PI *radio;



        System.out.println("el area del rectangulo es: " + arearectangulo);
        System.out.println("el perimetro del rectangulo es: " + perimetro);
        System.out.println("el area del Circulo es: " + areacirculo);
        System.out.println("la circunferencia del circulo es: " + Circunferencia);
        sc.close();
        
    }
}
