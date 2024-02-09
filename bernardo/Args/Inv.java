public class Inv{
    public static void main(String[] args){
        for(int i = args.length - 1; i >= 0; i--){
            System.out.print(args[i]);
            if(i > 0){
                System.out.print("-");
            }
        }
        System.out.println();    
    
     
        String separa = "";
        for(int i = args.length - 1; i >= 0; i--){
            System.out.print(separa+args[i]);
            separa = "-";
        }
        System.out.println();
    }
}

