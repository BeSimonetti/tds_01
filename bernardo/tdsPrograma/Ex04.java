/*Leia a velocidade máxima permitida em uma avenida, a placa do veículo e a velocidade
com que o motorista estava dirigindo nela e calcule a multa que uma pessoa vai
receber, sabendo que são pagos: a) 50 reais se o motorista estiver ultrapassar em até
10km/h a velocidade permitida(ex.: velocidade máxima: 50km/h; motorista a 60km/h ou
a 56km/h); b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade
permitida. c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
Desenvolva uma função para calcular a multa e um loop para que o sistema encerre a
leitura de veículos quando a placa digitada for igual a "SAIR". A leitura da velocidade
será feita apenas no início da aplicação.

06/04/2024

*/

import java.util.Scanner;

public class Ex04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade máxima permitida na via: ");
        int avenida = sc.nextInt();
        System.out.print("Digite a placa do carro: ");
        String plv = sc.next();
        System.out.print("Digite a velocidade do veículo: ");
        double velo = sc.nextDouble();
        double multa = 0;

        while(!plv.equals("SAIR")){
            mlt(multa, velo, avenida, plv);
            System.out.print("Digite a placa do carro: ");
            plv = sc.next();
            if(plv.equals("SAIR")){
                break;
            }
            System.out.print("Digite a velocidade do veículo: ");
            velo = sc.nextDouble();
        }

    }
    public static void mlt(double multa, double velo, int avenida, String plv) {
        multa = velo - avenida;
        if(multa>0 && multa<=10){
            System.out.println("--------------------");
            System.out.println("A placa do seu veículo é: "+plv);
            System.out.println("A velocidade do seu veículo foi de: "+velo);
            System.out.println("O valor de sua multa é de R$ 50");
            System.out.println("--------------------");
        } else if(multa>10 && multa<=30){
            System.out.println("--------------------");
            System.out.println("A placa do seu veículo é: "+plv);
            System.out.println("A velocidade do seu veículo foi de: "+velo);
            System.out.println("O valor de sua multa é de R$ 100");
            System.out.println("--------------------");
        } else if(multa>30){
            System.out.println("--------------------");
            System.out.println("A placa do seu veículo é: "+plv);
            System.out.println("A velocidade do seu veículo foi de: "+velo);
            System.out.println("O valor de sua multa é de R$ 200");
            System.out.println("--------------------");
        } else if(multa<0){
            System.out.println("A velocidade do seu carro está dentro do limite");
        }
    }
}