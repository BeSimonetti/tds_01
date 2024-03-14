import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private double txEntrega;
    private ItemDoPedido itemDoPedido;
    private String cliente;
    double soma;

    public void adicionarItemDoPedido(ItemDoPedido item){
        this.itemDoPedido = item;
    }

    public void setCliente(String nome){
        this.cliente = nome;     //.substring(0,1).toUpperCase() + nome.substring(1).toLowerCase();

    }

    public void setTxEntrega(double txEntrega){
        this.txEntrega = txEntrega;
    }

    public double getTotal(){
        return this.txEntrega + this.itemDoPedido.getValor();
    }
    
    public void imprimir(){
        System.out.println("------------------------------------------");

        System.out.println("                 Pizzaria                 ");
        System.out.println("                Pitisçaria                ");

        System.out.println("------------------------------------------");

        System.out.println("Cliente         : " + this.cliente);
        System.out.println("------------------------------------------");

        System.out.println("Tipo            : " + this.itemDoPedido.getTipo());
        System.out.println("Sabor           : " + this.itemDoPedido.getSabor());
        System.out.println("Valor           : " + this.itemDoPedido.getValor());
        System.out.println("------------------------------------------");

        System.out.println("Taxa de entrega : " + this.txEntrega);
        System.out.println("------------------------------------------");

        System.out.println("Total           : " + getTotal());
        System.out.println("------------------------------------------");

    }
}
