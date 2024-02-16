public class Ex02{
    public static void main(String[] args){
        String soma = "";
        for(int i = 0; i < args.length; i++){
           soma += args[i];
        }  
        System.out.println(soma.length());  
    }
}