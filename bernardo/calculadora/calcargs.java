public class calcargs{
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
   
        double result = 0;
        
        switch(args[1]){
            case "+":
                result = somar(a, b); 
                System.out.println(somar(a,b));
                break;
            case "-":
                result = subtrair(a, b); 
                System.out.println(subtrair(a, b));
                break;
            case "x":
                result = multiplicar(a, b); 
                System.out.println(multiplicar(a, b));
                break;
            case "/":
                result = dividir(a, b); 
                System.out.println(dividir(a, b));
                break;
        }
    
        
    }
    
    public static double somar(double a, double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        if (b != 0) {
            return a/b;
        } else {
            System.out.println("Não existe divisão por 0");
            return 0; 
        }
    }
}