import java.util.Scanner;

public class PosicaoEspecifica{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String posicao = args[0];
        int posicaoInt = Integer.parseInt(posicao);
        System.out.println(name.charAt(posicaoInt));
    }

}