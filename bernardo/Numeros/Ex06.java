// Crie um programa para verificar se os números informados são primos ou não.
public class Ex06{
    public static void main(String[] args){
        int num;
        int check;
        for(int i=0; i<args.length; i++){
            num = Integer.parseInt(args[i]);
            check = 0;
            if(num<2){
                System.out.print(num + " ");
                System.out.println("O número não é primo");
            } else{
                for(int j=2; j<=Math.sqrt(num); j++){
                    if(num % j == 0){
                        System.out.print(num + " ");
                        System.out.println("O número não é primo.");       
                        check ++;
                        break;
                    }
                }
                if(check == 0){
                    System.out.print(num + " ");
                    System.out.println("O número é primo");
                }
            }
        }
    }
}