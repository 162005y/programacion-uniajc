 import java.util.Scanner;
 public class Convertidor {
    public static void main(String[] args) {
        //Declaracion de las variables para el ejercicio
        // c -> grados celsius, f - > grados farenheit
        // gradosCelsius, gradosFarenheit
        double c, f, gradosCelsius, gradosFarenheit; 

        //Pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los grados celsius");
        c = leer.nextDouble();
        System.out.println("Digite los grados Farenheit");
        f = leer.nextDouble();
        //calculamos las formas para cada una de las conversiones
        gradosCelsius = (f - 32.0 ) * (5/9.0);
        gradosFarenheit = c * (9/5.0) + 32.0;
        //Mostrar los resultados de las formulas
        System.out.println("°F -> °C : " + gradosCelsius);
        System.out.println("°C -> °F : " + gradosFarenheit);
        leer.close();


    
    

    }
}    