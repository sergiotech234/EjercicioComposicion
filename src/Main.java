public class Main {
    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador("HP", "Pavilion", 8);

        Ordenador ordenador2 = new Ordenador("Lenovo", "ThinkPad");

        Ordenador ordenador3 = new Ordenador();

        System.out.println(ordenador);
        System.out.println(ordenador2);
        System.out.println(ordenador3);
    }
}