public abstract class Imovel implements Comparable<Imovel>{
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

    //Function Interface Method
    public int compareTo(Imovel i) {
        if( this.getAreaConstruida() < i.getAreaConstruida() ) {
            return -1;
        }
        if( this.getAreaConstruida() > i.getAreaConstruida() ) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        String s =
        "\nProprietário: "+this.proprietario+
        "\nArea Construida: "+this.areaConstruida+
        "\nLocalização: (lat) "+this.geoloc.getLatitude()+
        " (lon) "+this.geoloc.getLongitude();
        return s;
    }
}