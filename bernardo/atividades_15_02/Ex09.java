public class Ex09{
    public static void main(String[] args){
        String kebab = "";
        for(int i = 0; i < args.length; i++){
            kebab = args[i].toLowerCase();
            System.out.print(kebab);
            if(i < args.length - 1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
}