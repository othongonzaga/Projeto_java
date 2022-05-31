package Classes;

public interface Contrato_Clube {

    public void CadastroDados (String nome, long cpf, long telefone, String endereco, String plano);
    public void RemoverCadastro (long cpf);
    public void ProcurarCliente (String nome);
    public void EditarCadastro(long cpf);
}