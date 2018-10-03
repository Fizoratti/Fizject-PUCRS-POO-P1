public abstract class Imovel {
    //Atributos
    private String proprietario;
    private int areaConstruida;
    private static double valorReferencia;
    private Geo geoloc;

    //Construtor
    public Imovel(String p, int a, double lat, double lon) {
        this.proprietario = p;
        this.areaConstruida = a;
        this.geoloc = new Geo(lat, lon);
    }

    //Métodos Get/Set
    public String getProprietario() {
        return this.proprietario;
    }
    public void setProprietario(String p) {
        this.proprietario = p;
    }
    public int getAreaConstruida() {
        return this.areaConstruida;
    }
    public void serAreaConstruida(int a) {
        this.areaConstruida = a;
    }
    public double getValorReferencia() {
        return this.valorReferencia;
    }
    public void setValorReferencia(double vr) {
        this.valorReferencia = vr;
    }

    //Abstract Method
    public abstract double calculaImposto();

    @Override
    public String toString() {
        return "";
    }
}