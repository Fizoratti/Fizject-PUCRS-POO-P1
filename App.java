
public class App {
    public static void main(String args[]) {
        Imovel r1 = new Residencial("Robson", 70, 12.456, 54.321, 89);
        Imovel c1 = new Comercial("Laércio", 540, 15.486, 87.321);
        Geo g1 = new Geo(12.236, 16.325);

        System.out.println(r1.toString());
        System.out.println(c1.toString());
        System.out.println("\n"+g1.toString());
    }
}