public class cliente {
    public String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    public String tipoPlano;

    void setNome(String novoNome) {
        nome = "[Nome do Cliente]. "  + novoNome;
    }

    String getNome() {
        return nome;
    }
    
    void setCPF(String novoCPF) {
        nome = "[CPF do Cliente]. "  + novoCPF;
    }
    String getCPF() {
        return cpf;
    }

    void setTelefone(String novoTelefone) {
        nome = "[Telefone do Cliente]. "  + novoTelefone;
    }
    String getTelefone() {
        return telefone;
    }

    void setEndereco(String novoEndereco) {
        nome = "[Endereço do Cliente]. "  + novoEndereco;
    }
    String getEndereco() {
        return endereco;
    }

    void setTipoPlano(String novoTipoPlano) {
        nome = "[Plano do Cliente]. "  + novoTipoPlano;
    }
    String getTipoPlano() {
        return tipoPlano;
    }   

}   