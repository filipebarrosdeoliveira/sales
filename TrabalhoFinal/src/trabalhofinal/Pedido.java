package trabalhofinal;



import java.util.Date;

/**
 * Created by FilipeBarros on 16/06/17.
 * Classe responsável pela criação e emissão de pedido
 */


public class Pedido   {

  private Date dataPedido;
  private String vendedor;
  private Boolean status;
  private String observacoes;
  private String desconto;
  private String ipi;
  private String icms;
  private String quantidade;

  public static void criarPedido (String args[]) {

  }

  public static void cancelarPedido (String args[]) {

  }

  public static void encerrarPedido (String args[]) {

  }


    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getVendedor() {

      return vendedor;
    }

    public void setVendedor(String vendedor)
    {
        this.vendedor = vendedor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
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
}
