// Ler n strings e printar as posições das vogais encontradas
public class Ex14{
    public static void main(String[] args){
        String vogais = "AEIOUaeiou";
        char nt;
        for(int i=0; i<args.length; i++){
            for(int j=0; j<args[i].length(); j++){
                nt = args[i].charAt(j);
                for(int z=0; z<vogais.length(); z++){
                    if(nt == vogais.charAt(z)){
                        System.out.println(args[i].indexOf(nt));
                    }
                }
            }
        } 
    }
}