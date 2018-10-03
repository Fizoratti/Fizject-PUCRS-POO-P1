public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private static double valorReferencia;
    private Geo geoloc;

    public Imovel(String p, int a, double lat, double lon) {
        this.proprietario = p;
        this.areaConstruida = a;
        this.geoloc = new Geo(lat, lon);
    }

    public String toString() {
        return "";
    }
}