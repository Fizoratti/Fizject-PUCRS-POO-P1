public class Comercial extends Imovel {
    public Comercial(String p, int a, double lat, double lon) {
        super(p,a,lat,lon);
    }

    public double calculaImposto() {
        double valor;
        if(super.getAreaConstruida() <= 100) {
            valor = 100.0;
        }
        if(super.getAreaConstruida() > 100) {
            valor = (super.getAreaConstruida() - 100) * super.getValorReferencia();
        }
        if(super.getAreaTerreno() > 150) {
            valor += 100 * super.getValorReferencia();
        }
        return valor;
    }
}