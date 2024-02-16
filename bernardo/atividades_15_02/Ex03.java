public class Ex03{
    public static void main(String[] args){
        String inverso = "";
        for(int i = args.length - 1; i >= 0; i--){
            inverso += args[i];
        if(i > 0){
                System.out.print(args[i] + " ");
                
            }
            else{
                System.out.print(args[i]);
                
            }
        }
        System.out.println();
    }
}