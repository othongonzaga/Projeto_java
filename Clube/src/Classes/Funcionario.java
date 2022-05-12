package Classes;

public class Funcionario extends Clube {

    public Funcionario(String nome, int cpf, int telefone, String endereco) {
        super(nome, cpf, telefone, endereco, endereco);
        
    }

    @Override
    public void pagamentoFuncionario() {
        System.out.println("PJ");
    }
}