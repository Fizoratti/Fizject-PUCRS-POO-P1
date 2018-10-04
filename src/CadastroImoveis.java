import java.util.List;

public class CadastroImoveis {
    private List<Imovel> lista;

    public CadastroImoveis() {
        lista = new ArrayList<>();
    }

    public String listar() {
        Imovel imovel;
        String listagem;
        for(int i = 0; i < lista.get.size(); i++) {
            imovel = (Imovel) lista.get(i);
            listagem += "(" + i + ") " + imovel.toString() + "\n";
        }
        return listagem;
    }
    public String listar(String p) {
        Imovel imovel;
        String listagem;
        for(int i = 0; i < lista.get.size(); i++) {
            imovel = (Imovel) lista.get(i);
            if(imovel.getProprietario == p) {
                listagem += "(" + i + ") " + imovel.toString() + "\n";
            }
        }
        return listagem;
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