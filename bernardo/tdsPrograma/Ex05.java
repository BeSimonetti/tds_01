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
        System.out.print("Horas normais trabalhadas no mês: ");
        double hTraba = sc.nextDouble();
        System.out.print("Valor da hora: ");
        double valorH = sc.nextDouble();
        System.out.print("Horas extras trabalhadas no mês: ");
        double hExtras = sc.nextDouble();
        
        double hTrabaMes = hTraba + hExtras; // Total de horas no mês.
        double salario = (hTraba*valorH+(hExtras*(valorH*1.5)));
        double nSalario = 0;
        
        if(salario>=1412){
            salario = salario-(salario*0.075);
        }
    }
}