public class PosicaoEs{
    public static void main(String[]args){
        String nome = args[0];
        String posicao = args[1];
        int inteiro = Integer.parseInt(posicao);
        System.out.println(nome.charAt(inteiro));
    }
}