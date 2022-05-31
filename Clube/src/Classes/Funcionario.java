package Classes;

public class Funcionario extends Clube {

    public Funcionario(String nome, long cpf, long telefone, String endereco) {
        super(nome, cpf, telefone, endereco, null);
        
    }

    @Override
    public void pagamentoFuncionario() {
        System.out.println("PJ");
    }

    public void mostrarFuncionario() {
        System.out.println("Nome Funcionario:" + getNome());
        System.out.println("CPF Funcionario:" + getCpf());
        System.out.println("Telefone Funcionario:" + getTelefone());
        System.out.println("Endereco Funcionario:" + getEndereco());
    }
}