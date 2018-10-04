import java.util.*;

public class CadastroImoveis<Imovel> {
    private ArrayList<Imovel> lista;

    public CadastroImoveis() {
        lista = new ArrayList<>();
    }

    public String listar() {
        Imovel imovel;
        String listagem;
        //Collections.sort(lista);
        for(int i = 0; i < lista.size(); i++) {
            imovel = (Imovel) lista.get(i);
            listagem += "(" + i + ") " + imovel.toString() + getTipoImovel(imovel) + "\n";
        }
        return listagem;
    }

    public String listar(String p) {
        Imovel imovel;
        String listagem;
        for(int i = 0; i < lista.size(); i++) {
            imovel = (Imovel) lista.get(i);
            if(imovel.getProprietario == p) {
                listagem += "(" + i + ") " + imovel.toString() + "\n";
            }
        }
        return listagem;
    }

    public String getTipoImovel(Imovel imovel) {
        String tipo;
        if(imovel instanceof Residencial) {
            tipo = "Residencial";
        }else if(imovel instanceof Comercial){
            tipo = "Comercial";
        }
        return tipo;
    }

    public void addImovel(Imovel i){
        lista.add(i);
    }

    public String calculaImpostoTotal() {
        double total;
        Imovel imovel;
        for(int i = 0; i < lista.size(); i++) {
            imovel = (Imovel) lista.get(i);
            total = total + imovel.calculaImposto();
        }
        return "Valor total de imposto: "+total;
    }
}