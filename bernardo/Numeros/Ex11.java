/*Escreva um algoritmo que leita n temperaturas e converta-as de Celsius para Fahrenheit.
 */
import java.util.ArrayList;

public class Ex11 {
    public static void main(String[] args){
        double celsius;
        double fahrenheit;
        for(int i=0; i<args.length; i++){
            celsius = Double.parseDouble(args[i]);
            fahrenheit = ((celsius*9)/5)+32;
            System.out.println( celsius + " ° Celsius são " + fahrenheit + " ° Fahrenheit");
        }
    }
}
