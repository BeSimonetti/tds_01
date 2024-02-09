public class ContSemIf{
    public static void main(String[] args){
        String separa = "";
        for(int i = 0; i < args.length; i++){
            System.out.print(separa+args[i]);
            separa = "-";
        }
        System.out.println();
    }
}