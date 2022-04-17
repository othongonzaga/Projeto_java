public class Main {
    public static void main(String[] args){
        cliente c1 = new cliente();
        c1.setNome("Othon César");
        c1.setCPF("09902650481");
        c1.setTelefone("81 99545-7575");
        c1.setEndereco("Rua Governador Jose Bezerra");
        c1.setTipoPlano("Premium");
        
        funcionario f1 = new funcionario();
        f1.setNome("Manga Rosa");
        f1.setCPF("012.525.012-55");
        f1.setTelefone("81 985910-2447");
        f1.setEndereco("Rua do Povo");


      System.out.println(c1);
      System.out.println(f1);
    }
}