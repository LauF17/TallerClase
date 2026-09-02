import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tiempo estimado en minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosrestantes = minutos % 60;
        int segundos = minutos * 60;

        System.out.println("Tiempo ingresado: " + minutos);
        System.out.println("Equivale a: " + horas + "horas, " + minutosrestantes + "minutos, 0 segundos");
        System.out.println("En segundos: " + segundos );

        sc.close();


    }


    
}
