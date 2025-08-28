import java.util.Scanner;

public class MenuPrincipal {
    private CalculadoraRecursiva calculadora;
    private Scanner scanner;

    public MenuPrincipal() {
        this.calculadora = new CalculadoraRecursiva();
        this.scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        mostrarMenuPrincipal();
        procesarOpcion();
    }

    private void mostrarMenuPrincipal() {
        System.out.println("\n=== CALCULADORA RECURSIVA ===");
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci");
        System.out.println("3. Suma de Dígitos");
        System.out.println("4. Inversión de Cadena");
        System.out.println("5. Contar Vocales");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void procesarOpcion() {
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                menuFactorial();
                break;
            case 2:
                menuFibonacci();
                break;
            case 3:
                menuSumaDigitos();
                break;
            case 4:
                menuInversionCadena();
                break;
            case 5:
                menuContarVocales();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                scanner.close();
                return;
            default:
                System.out.println("Opción no válida");
                break;
        }

        pausar();
        ejecutar(); // Recursión para volver al menú
    }

    private void menuFactorial() {
        System.out.println("\n--- CÁLCULO DE FACTORIAL ---");
        System.out.print("Ingrese un número: ");
        long numero = scanner.nextLong();

        if (numero >= 0) {
            long resultado = calculadora.factorial(numero);
            System.out.println("Factorial de " + numero + " = " + resultado);
        } else {
            System.out.println("Error: El número debe ser positivo");
        }
    }

    private void menuFibonacci() {
        System.out.println("\n--- SUCESIÓN DE FIBONACCI ---");
        System.out.print("Ingrese la posición: ");
        long numero = scanner.nextLong();

        if (numero >= 0) {
            long resultado = calculadora.fibonacci(numero);
            System.out.println("Fibonacci en posición " + numero + " = " + resultado);
        } else {
            System.out.println("Error: La posición debe ser positiva");
        }
    }

    private void menuSumaDigitos() {
        System.out.println("\n--- SUMA DE DÍGITOS ---");
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            int resultado = calculadora.sumarDigitos(numero);
            System.out.println("Suma de dígitos de " + numero + " = " + resultado);
        } else {
            System.out.println("Error: El número debe ser positivo");
        }
    }

    private void menuInversionCadena() {
        System.out.println("\n--- INVERSIÓN DE CADENA ---");
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (cadena != null && !cadena.trim().isEmpty()) {
            String resultado = calculadora.invertirCadena(cadena);
            System.out.println("Cadena original: " + cadena);
            System.out.println("Cadena invertida: " + resultado);
        } else {
            System.out.println("Error: La cadena no puede estar vacía");
        }
    }

    private void menuContarVocales() {
        System.out.println("\n--- CONTAR VOCALES ---");
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (cadena != null) {
            int resultado = calculadora.contarVocales(cadena);
            System.out.println("Cadena: " + cadena);
            System.out.println("Número de vocales: " + resultado);
        } else {
            System.out.println("Error: La cadena no puede ser nula");
        }
    }

    private void pausar() {
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }


    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.ejecutar();
    }
}
