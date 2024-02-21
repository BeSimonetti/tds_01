public class Ex14{
    public static void main(String[] args){
        String vogais = "AEIOUaeiou";
        char nt;
        String SemVog = "";
        
        for(int i=0; i<args.length; i++){
            for(int j=0; j<args[i].length(); j++){
                int cont = 0
                nt = args[i].charAt(j);
                for(int z=0; z<vogais.length; z++){
                    if(nt == vogais.length(z)){
                        cont ++;
                    }
                }
            }
        } 
        System.out.println();
    }
}