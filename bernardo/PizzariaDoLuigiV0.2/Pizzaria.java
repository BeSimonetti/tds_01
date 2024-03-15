import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Pedido pedido = new Pedido();
        System.out.println("Bem vindo a pizzaria!!");
        String continuar;
        do{
            ItemDoPedido item = new ItemDoPedido();

            System.out.print("Informe o tipo de pizza: ");
            item.setTipo(scanner.nextLine());
        
            System.out.print("Informe o sabor da pizza: ");
            item.setSabor(scanner.nextLine());
            
            System.out.print("Informe o valor da pizza: ");
            item.setValor(scanner.nextDouble());
            scanner.nextLine();
            
            pedido.adicionarItemDoPedido(item);
            
            System.out.println("mais alguma coisa?");
            continuar = scanner.nextLine();
        } while (!continuar.equalsIgnoreCase(""));

        System.out.print("Nome do cliente: ");
        pedido.setCliente(scanner.nextLine());

        System.out.print("Taxa de entrega: ");
        pedido.setTxEntrega(scanner.nextDouble());
        scanner.nextLine();

        pedido.imprimir();
    }
}
