package Main;

import Classes.Contrato_Clube;
import Classes.Dados_Clube;

public class Main {

    public static void main(String[] args) {
        Contrato_Clube Clube1 = new Dados_Clube();
        //Dados_Clube Clube1 = new Dados_Clube();
        Clube1.CadastroDados("Kofun", 6666, 666666, "Caruaru", "b");
        //Clube1.RemoverCadastro(6666);
        Clube1.ProcurarCliente("Kofun");

    }
}
