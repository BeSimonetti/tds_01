public class Ex10{
    public static void main(String[] args){
        String camel = "";
        System.out.print(args[0].toLowerCase());
        for(int i = 0; i < args.length; i++){
            camel = args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase();
            System.out.print(camel);
        }
        System.out.println();
    }
}