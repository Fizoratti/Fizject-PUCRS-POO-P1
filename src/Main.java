public class Main {
    public static void Main(String args[]) {
        //Questao 4:
        //A)
        CadastroImoveis<Imovel> ci = new CadastroImoveis<>();

        //B)
        ci.add(new Residencial("Robson", 70, 12.456, 54.321));
        ci.add(new Residencial("Jose", 120, 13.456, 11.721));
        ci.add(new Residencial("Bianca", 400, 12.878, 54.321));
        
        //C)
        System.out.println(ci.listar());

        //D)
        System.out.println(ci.listar("John Doe"));

        //E)
        System.out.println(ci.calculaImpostoTotal());

    }
}