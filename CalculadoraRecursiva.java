public class CalculadoraRecursiva {

    public long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public long fibonacci(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int sumarDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        return (numero % 10) + sumarDigitos(numero / 10);
    }

    public String invertirCadena(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) +
                invertirCadena(cadena.substring(0, cadena.length() - 1));
    }
}