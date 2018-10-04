import java.util.List;

public class CadastroImoveis {
    private List<Imovel> lista;

    public CadastroImoveis() {
        lista = new ArrayList<>();
    }

    public String claculaImpostoTotal() {
        double total;
        Imovel imovel;
        for(int i = 0; i < lista.size(); i++) {
            imovel = (Imovel) lista.get(i);
            total = total + imovel.calculaImposto();
        }
        return "Valor total de imposto: "+total;
    }
}