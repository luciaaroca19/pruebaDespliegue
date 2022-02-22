import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCirculo {

    public static void main(String[] args) throws IOException {

        final double PI = 3.146;  // declarando una constante
        double area;  // declaración de variables
        double radio;
        // configuración del bufer de entrada
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // Entrada(radio)
        System.out.println("Valor del radio: ");
        entrada = bufer.readLine();
        radio = Double.parseDouble(entrada);

        // proceso
        area = PI * radio * radio;

        // Salida(area)
        System.out.println("Area del circulo: " + area );
    }
}
