package trabalhofinal;



import java.util.ArrayList;
import java.util.Date;

/**
 * Created by FilipeBarros on 16/06/17.
 * Classe responsável pela criação e emissão de pedido
 */


public class Pedido  implements java.io.Serializable {

  
  private String desconto;
  private String ipi;
  private String icms;
  private String quantidade;
  private Cliente cliente;
  private String codigo;
  
  private ArrayList <Produto> produtos = new ArrayList<>(); 

  public static void criarPedido (String args[]) {

  }

  public static void cancelarPedido (String args[]) {

  }

  public static void encerrarPedido (String args[]) {

  }


   


    /**
     * @return the desconto
     */
    public String getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the ipi
     */
    public String getIpi() {
        return ipi;
    }

    /**
     * @param ipi the ipi to set
     */
    public void setIpi(String ipi) {
        this.ipi = ipi;
    }

    /**
     * @return the icms
     */
    public String getIcms() {
        return icms;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(String icms) {
        this.icms = icms;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produtos
     */
    public ArrayList <Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(ArrayList <Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
