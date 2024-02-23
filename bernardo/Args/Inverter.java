public class Inverter{
    public static void main(String[] args){
        for(int i=args.length-1; i>=0; i--){
            for(int x=args[i].length()-1; x>=0; x--){
                System.out.print(args[0].charAt(x));
            }
            if(i>0){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}