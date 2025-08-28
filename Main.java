public class Main {
    public static void main(String[] args) {
        CalculadoraRecursiva calculadora = new CalculadoraRecursiva();
        MenuPrincipal menu = new MenuPrincipal(calculadora);
        menu.ejecutar();
    }
}