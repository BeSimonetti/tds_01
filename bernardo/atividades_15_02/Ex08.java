public class Ex08{
    public static void main(String[] args){
        String snake = "";
        for(int i = 0; i < args.length; i++){
            snake = args[i].toLowerCase();
            System.out.print(snake);
            if(i<args.length - 1){
                System.out.print("_");
            }
        }
        System.out.println();
    }
}