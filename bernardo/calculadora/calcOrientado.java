import java.lang.Math;
public class calcOrientado{
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        double result = 0;
        
        Calcular operacoes = new Calcular(a, b);
        
        switch(args[1]){
            case "+":
                result = operacoes.somar(); 
                System.out.println("Resultado: "+result);
                break;
            case "-":
                result = operacoes.subtrair(); 
                System.out.println("Resultado: "+result);
                break;
            case "x":
                result = operacoes.multiplicar(); 
                System.out.println("Resultado: "+result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Não existe divisão por 0");
                } else {
                    result = operacoes.dividir();
                    System.out.println("Resultado: "+ result);
                }
                break;
            case "$":
                b = 0;
                result = operacoes.raiz();
                System.out.println("Resultado: "+result);
                break;
            case "°":
                b = 0;    
                result = operacoes.fatorial();
                System.out.println("Resultado: "+result);
                break;
        }
    
        
    }
}
 class Calcular{
    double n1;
    double n2;

    Calcular(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public double somar(){
        return this.n1 + this.n2;
    }
    public double subtrair(){
        return this.n1 - this.n2;
    }
    public double multiplicar(){
        return this.n1 * this.n2;
    }
    public double dividir(){
        return this.n1 / this.n2;
    }
    public double raiz(){
        return Math.sqrt(n1);
    }
    public double fatorial(){
      
            long fatorial = 1l;
            for(int j=(int) n1; j>1; j--){
                fatorial *= j;
            }
            return fatorial;
    }
}