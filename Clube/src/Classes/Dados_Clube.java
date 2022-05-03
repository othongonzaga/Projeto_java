package Classes;

import Classes.Clube;

import java.util.ArrayList;

public class Dados_Clube implements Contrato_Clube{

        public ArrayList<Clube> CLUBE_Array = new ArrayList<Clube>();

        public void CadastroDados (String nome, int cpf, int telefone, String endereco, String plano){

            Clube Cadastro = new Clube(nome, cpf, telefone, endereco, plano);
            this.CLUBE_Array.add(Cadastro);
        }

        public void RemoverCadastro (int cpf){

            for(int i=0; i < CLUBE_Array.size(); i++){

                if(cpf==CLUBE_Array.get(i).getCpf()){

                    if(i==CLUBE_Array.size()-1){

                        CLUBE_Array.get(i).setNome("NULL");
                        CLUBE_Array.get(i).setCpf(0);
                        CLUBE_Array.get(i).setTelefone(0);
                        CLUBE_Array.get(i).setEndereco("NULL");
                        CLUBE_Array.get(i).setPlano("NULL");

                        i = CLUBE_Array.size() + 1;
                    }
                    else {
                        for (int x = i; x < CLUBE_Array.size() - 1; x++) {

                            CLUBE_Array.get(x).setNome(CLUBE_Array.get(x + 1).getNome());
                            CLUBE_Array.get(x).setCpf(CLUBE_Array.get(x + 1).getCpf());
                            CLUBE_Array.get(x).setTelefone(CLUBE_Array.get(x + 1).getTelefone());
                            CLUBE_Array.get(x).setEndereco(CLUBE_Array.get(x + 1).getEndereco());
                            CLUBE_Array.get(x).setPlano(CLUBE_Array.get(x + 1).getPlano());

                        }
                        i = CLUBE_Array.size() + 1;
                    }
                }

                else if (i==CLUBE_Array.size()-1){

                    System.out.println("Não foi Encontrado");

                }

            }


        }

        public void ProcurarCliente (String nome){

            for(int i=0; i < CLUBE_Array.size(); i++){

                if(nome.equals(CLUBE_Array.get(i).getNome())){

                    System.out.println("Nome do Cliente: "+ CLUBE_Array.get(i).getNome());
                    System.out.println("CPF: " + CLUBE_Array.get(i).getCpf());
                    System.out.println("Telefone: "+ CLUBE_Array.get(i).getTelefone());
                    System.out.println("Endereço: "+ CLUBE_Array.get(i).getEndereco());
                    System.out.println("Plano: "+ CLUBE_Array.get(i).getPlano());

                    i=CLUBE_Array.size()+1;
                }

                if (i==CLUBE_Array.size()-1){

                    System.out.println("");
                    System.out.println("Não foi encontrado o Dado desse Operador.");
                    System.out.println("");

                }

            }

        }

        public ArrayList<Clube> getCLUBE_Array() {
            return CLUBE_Array;
        }

        public void setCLUBE_Array(ArrayList<Clube> clube) {
            CLUBE_Array = clube;
        }


}
