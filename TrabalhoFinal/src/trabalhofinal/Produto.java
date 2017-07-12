package trabalhofinal;

/**
 * Created by FilipeBarros on 16/06/17.
 * Classe responsável pelo cadastro de produtos e sua manutenção
 */
public class Produto implements java.io.Serializable {

    private String nome;
    private String codigo;
    private String descricao;
    private String fornecedor;
    private String preco;
    private String operacao1;
    private String operacao2;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    

  
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
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

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

    boolean getNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the operacao1
     */
    public String getOperacao1() {
        return operacao1;
    }

    /**
     * @param operacao1 the operacao1 to set
     */
    public void setOperacao1(String operacao1) {
        this.operacao1 = operacao1;
    }

    /**
     * @return the operacao2
     */
    public String getOperacao2() {
        return operacao2;
    }

    /**
     * @param operacao2 the operacao2 to set
     */
    public void setOperacao2(String operacao2) {
        this.operacao2 = operacao2;
    }

  
}




