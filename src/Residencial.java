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

    
}