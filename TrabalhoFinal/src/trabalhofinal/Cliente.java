package trabalhofinal;
/**
 * Created by FilipeBarros on 16/06/17.
 *  Classe responsável pelo cadastro e manutenção dos clientes
 */
public class Cliente implements java.io.Serializable {

    private String codigo;
    private String nome;
    private String telefone;
    private String endereco;
    private String email;






    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}