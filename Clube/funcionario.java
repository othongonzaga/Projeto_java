public class funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
  
    void setNome(String novoNome) {
        nome = "[Nome do Funcionário]. "  + novoNome;
    }
    String getNome() {
        return nome;
    }
        
    void setCPF(String novoCPF) {
        nome = "[CPF do Funcionário]. "  + novoCPF;
    }
    String getCPF() {
        return cpf;
    }
    void setTelefone(String novoTelefone) {
        nome = "[Telefone do Funcionário]. "  + novoTelefone;
    }
    String getTelefone() {
        return telefone;
    }
    void setEndereco(String novoEndereco) {
        nome = "[Endereço do Funcionário]. "  + novoEndereco;
    }
    String getEndereco() {
        return endereco;
    }


}