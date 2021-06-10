import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        int personas = 10;
        int contadorMenores25 = 0;
        int menores25 = 0;
        int contadorMayores25 = 0;
        int mayores25 = 0;
        int promedioMayores;
        int promedioMenores;

        System.out.println("A continuacion deberá escribir 10 edades");

        for (int i = 1; i < personas; i++) {

            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();

            if (edad < 25){
                contadorMenores25++;
                menores25 = menores25 + edad;
            } else if (edad >= 25){
                contadorMayores25++;
                mayores25 = mayores25 + edad;
            }

        }

        promedioMayores = mayores25/contadorMayores25;
        promedioMenores = menores25/contadorMenores25;

        System.out.println("El promedio de edades para menores de 25 años es de " + promedioMenores);
        System.out.println("El promedio de edades para mayores de 25 años es de " + promedioMayores);
    }
}