package Classes;

public interface Contrato_Clube {

    public void CadastroDados (String nome, int cpf, int telefone, String endereco, String plano);
    public void RemoverCadastro (int cpf);
    public void ProcurarCliente (String nome);
    
}