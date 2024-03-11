/* Para realizar o cálculo do salário de um funcionário horista é necessário saber quantas
horas ele trabalhou e qual o valor por hora. Além disso, é importante considerar
possíveis adicionais e descontos, como horas extras, adicional noturno, faltas e atrasos.
Suponhamos que um funcionário receba um valor de 13,64 por hora e trabalhe durante
44 horas semanais e tenha realizado 12 horas extras no mês. Para calcular o valor do
salário: 220 horas * R$ 13,64: R$ 3.000,00

No entanto, como o funcionário realizou 12 horas extras no mês, é necessário
considerar o adicional de 50% sobre o valor da hora trabalhada. Ou seja, cada hora
extra será contabilizada como R$ 20,46.

Dessa forma, o cálculo do salário mensal seria: (44 horas semanais x 4 semanas do
mês) = 176 horas trabalhadas no mês. Considerando as 12 horas extras, o funcionário
trabalhou um total de 188 horas no mês.

Para calcular o salário mensal, seria necessário multiplicar as horas trabalhadas pela
hora trabalhada com o adicional de hora extra: 188 x R$ 20,46 = R$ 3.846,48.

Assim, o salário mensal total seria a soma do salário fixo (R$ 3.000,00) mais o valor das
horas extras (R$ 846,48), resultando em um salário mensal de R$ 3.846,48.

Deve-se descontar os valores de INSS

Salário de até R$ 1.412,00 |7,5%

De R$ 1.412,01 até R$ 2.666,68 |9%

De R$ 2.666,69 até R$ 4.000,03 |12%

De R$ 4.000,04 até R$ 7.786,02 |14%
 */

import java.util.Scanner;

public class Ex05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            
            System.out.print("Nome do funcionário: ");
            String nome = sc.next();
            if (nome.equalsIgnoreCase("SAIR")) {
                System.out.println("Saindo...");
                break;
            }
            System.out.print("Horas normais trabalhadas no mês: ");
            double hTraba = sc.nextDouble();
            System.out.print("Valor da hora: ");
            double valorH = sc.nextDouble();
            System.out.print("Horas extras trabalhadas no mês: ");
            double hExtras = sc.nextDouble();
        
            double hTrabaMes = hTraba + hExtras; // Total de horas no mês. Apenas para informação, IMPRIMIR.
            double salario = (hTraba*valorH+(hExtras*(valorH*1.5))); // Salário sem desconto do INSS.
            double nSalario = 0; // 
        
            if(salario<=1412.01){
                nSalario = salario - (salario*0.075);
            } else if(salario>1412.01 && salario<=2666.68){
                nSalario = salario - (((salario-1412)*0.09)+(1412*0.075));
            } else if(salario>2666.68 && salario<=4000.03){
                nSalario = salario - (((salario-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
            } else if(salario>4000.03 && salario<=7786.02){
                nSalario = salario - (((salario-4000.03)*0.14)+((4000.03-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
            } else if(salario>7786.02){
                nSalario = salario - (((7786.02-4000.03)*0.14)+((4000.03-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
            } 
            System.out.println();
            System.out.println("Seu salário bruto é de: " + salario);
            System.out.println("Seu salário líquido é: " + nSalario);
            System.out.println("As horas trabalhadas no mês foram: " + hTrabaMes);
            
            System.out.println();

        }
    

    }
}

/*public Calcular{
        
    Calcular(double hTraba, double valorH, double hExtras, double salario){
        this.hTraba = hTraba;
        this.valorH = valorH;
        this.hExtras = hExtras;
        this.salario = salario;
    }
    
    double salario = (this.hTraba*this.valorH+(this.hExtras*(this.valorH*1.5))); // Salário sem desconto do INSS.
    double nSalario = 0; // 
        
    if(salario<=1412.01){
        nSalario = this.salario - (1412.01*0.075);
    } else if(salario>1412.01 && salario<=2666.68){
        nSalario = salario - (((salario-1412)*0.09)+(1412*0.075));
    } else if(salario>2666.68 && salario<=4000.03){
        nSalario = salario - (((salario-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
    } else if(salario>4000.03 && salario<=7786.02){
        nSalario = salario - (((salario-4000.03)*0.14)+((4000.03-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
    } else if(salario>7786.02){
        nSalario = salario - (((7786.02-4000.03)*0.14)+((4000.03-2666.68)*0.12)+((2666.68-1412)*0.09)+(1412*0.075));
    } 

} */