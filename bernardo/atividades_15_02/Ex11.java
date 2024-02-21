public class Ex11{
    public static void main(String[] args){
        String pascal = "";
        for(int i=0; i<args.length; i++){
            pascal = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase();
            System.out.print(pascal);
        }
        System.out.println();
    }
}