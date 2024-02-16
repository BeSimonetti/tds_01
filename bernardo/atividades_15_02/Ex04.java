public class Ex04{
    public static void main(String[] args){
        String inverso = "";
        for(int i = 0; i < args.length; i++){
            for(int j = 0; j < args[i].length(); j++){
                inverso = args[i].charAt(j) + inverso;
            }
        }
        System.out.println(inverso);
    }
}