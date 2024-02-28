/*Crie um programa que simule o lançamento de um dado 100 vezes. Conte e exiba a
quantidade de vezes que cada face do dado foi sorteada. Você deve usar um `for`
para os lançamentos e estrutura de switch para somar cada quantidade. */
import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] cont = new int[6];
        for(int i=0; i<100; i++){
            int resultLanca = random.nextInt(6) + 1;
            cont[resultLanca - 1]++;
        }
        for(int f = 1; f <= 6; f++){
            System.out.println("Face " + f +" : " + cont[f-1]);
        }
    }
}
