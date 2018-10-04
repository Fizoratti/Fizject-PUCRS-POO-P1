public class Main {
    public static void main(String args[]) {
        //Questao 4:
        //A)
        CadastroImoveis<Imovel> ci = new CadastroImoveis<>();

        //B)
        ci.addImovel(new Residencial("Robson", 70, 12.456, 54.321, 89));
        ci.addImovel(new Residencial("Jose", 120, 13.456, 11.721, 155));
        ci.addImovel(new Residencial("Bianca", 400, 12.878, 54.321, 666));
        
        //C)
        System.out.println(ci.listar());

        //D)
        System.out.println(ci.listar("John Doe"));

        //E)
        System.out.println(ci.calculaImpostoTotal());

    }
}