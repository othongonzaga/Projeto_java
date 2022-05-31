package Main;

import Classes.Clube;
import Classes.Contrato_Clube;
import Classes.Dados_Clube;
import Classes.Funcionario;

public class Main {

    public static void main(String[] args) {
        Contrato_Clube Clube1 = new Dados_Clube();
        System.out.println(Clube1 instanceof Dados_Clube);
        Clube1.CadastroDados("Kofun", 66665555222l, 81987505212l, "Caruaru", "b");
        Clube1.ProcurarCliente("Kofun");

        Clube1.EditarCadastro(66665555222l);
        Clube1.ProcurarCliente("Kofun");
        //Clube1.RemoverCadastro(66665555222l);

        Clube funcionario1 = new Funcionario("João", 77771212999l, 81995111177l, "Caruaru");

        funcionario1.pagamentoFuncionario();
        ((Funcionario) funcionario1).mostrarFuncionario();
    }
}
