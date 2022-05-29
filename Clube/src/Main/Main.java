package Main;

import Classes.Clube;
import Classes.Contrato_Clube;
import Classes.Dados_Clube;
import Classes.Funcionario;

public class Main {

    public static void main(String[] args) {
        Contrato_Clube Clube1 = new Dados_Clube();
        System.out.println(Clube1 instanceof Dados_Clube);
        //Dados_Clube Clube1 = new Dados_Clube();
        Clube1.CadastroDados("Kofun", 6666, 666666, "Caruaru", "b");
        //Clube1.RemoverCadastro(6666);
        Clube1.ProcurarCliente("Kofun");

        Clube funcionario1 = new Funcionario("João", 7777777, 55555, "Caruaru");

        funcionario1.pagamentoFuncionario();
    }
}
