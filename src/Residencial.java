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
        if(super.getAreaConstruida() <= 200) {
            return 0.0;
        }else if(super,getAreaConstruida() > 200) {
            if(super.getAreaTerreno() > 500) {
                return 100 * super.getValorReferencia();
            }
            return (super.getAreaConstruida() - 200) * super.getValorReferencia();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Imposto: "+this.calculaImposto();
    }
}