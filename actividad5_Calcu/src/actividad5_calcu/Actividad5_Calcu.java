package actividad5_calcu;
/**
 *
 * @author Eber MD
 */
public class Actividad5_Calcu {
    public static void main(String[] args) {
        /* El programa hará operaciones aritmétcias básicas 
        (suma, resta, multiplicación, división y módulo)
        */
        double num1 = 6;
        double num2 = 8;// Numeros a evaluar
        
        double suma = num1 + num2; // sumatoria
        double resta = num1 - num2; // resta
        double multi = num1 * num2; // multiplicación
        double div = num1 / num2; // división
        double mod = num1 % num2; // módulo
        
        System.out.println("Los números son: " + num1 + " y " + num2 
        + "\n" + "La suma da como resultado: "              + suma
        + "\n" + "La resta da como resultado: "             + resta
        + "\n" + "La multiplicación da como resultado: "    + multi
        + "\n" + "La div da como resultado: "               + div
        + "\n" + "La módulo da como resultado: "            + mod);
    }
}
