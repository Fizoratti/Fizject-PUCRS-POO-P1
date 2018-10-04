
public class Residencial extends Imovel {
    private int areaTerreno;

    public Residencial(String p, int a, double lat, double lon, int at) {
        super(p,a,lat,lon);
        this.areaTerreno = at;
    }

    public int getAreaTerreno() {
        return this.areaTerreno;
    }
    public void setAreaTerreno(int at) {
        this.areaTerreno = at;
    }

    public double calculaImposto() {
        double valor = 0.0;
        if(super.getAreaConstruida() <= 200) {
            valor = 0.0;
        }
        if(super.getAreaConstruida() > 200) {
            valor = (super.getAreaConstruida() - 200) * super.getValorReferencia();
        }
        if(this.getAreaTerreno() > 500) {
            valor += 100 * super.getValorReferencia();
        }
        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nImposto: "+this.calculaImposto();
    }
}