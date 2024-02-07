import java.util.Random;
public class PosicaoAl{
    public static void main(String[] args){
        String nome = args[0];
        Random random = new Random();
        int aleatorio = random.nextInt(nome.length());
        System.out.println(nome.charAt(aleatorio));
    }
}