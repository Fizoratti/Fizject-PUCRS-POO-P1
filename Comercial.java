
public class Comercial extends Imovel {
    public Comercial(String p, int a, double lat, double lon) {
        super(p,a,lat,lon);
    }

    public double calculaImposto() {
        double valor = 0.0;
        if(super.getAreaConstruida() <= 100) {
            valor = 100.0;
        }
        if(super.getAreaConstruida() > 100) {
            valor = (super.getAreaConstruida() - 100) * super.getValorReferencia();
        }
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + "Imposto: "+this.calculaImposto();
    }
}