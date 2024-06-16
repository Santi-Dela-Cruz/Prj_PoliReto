import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Poli Retos
 * clase EcheverriaGabriela
 * @version 1.0
 * @ Gabriela Echeverria
 */
public class EcheverriaGabriela {
    private int GEnum;
    private char[][] matrix;
    private String fullName = "Gabriela Echeverria";
    private String amArchivo = "archivo";
    private double amNumero = 100.0;
    private double amProgreso = 0.0;
    private double amTotal = 100.0;
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private Random random = new Random();

    /**
     * Obtiene el tamaño
     * @return tamaño
     */
    public int getGEnum() {
        return GEnum;
    }

    /**
     * Establece el tamaño
     * @param gEnum tamaño de la serie
     * @throws IllegalArgumentException si el tamaño no es un número positivo mayor que cero
     */
    public void setGEnum(int gEnum) {
        if (gEnum <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser un número positivo mayor que cero.");
        }
        GEnum = gEnum;
    }

    /**
     * Imprime la serie SN1
     */
    public void GES1() {
        int n = GEnum;
        int a = 0, b = 1, c;
        System.out.print("SN1 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN2
     */
    public void GES2() {
        int n = GEnum;
        System.out.print("SN2 es: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN3
     */
    public void GES3() {
        int n = GEnum;
        int a = 0, b = 1;
        int c, d = 1;

        System.out.print("SN3: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + "/" + d + " ");
            c = a + b;
            a = b;
            b = c;
            d += 2;
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN4
     */
    public void GES4() {
        int n = GEnum;
        System.out.print("SN4: ");
        int a = 0, b = 1, c;
        int d = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/" + d + " ");
            c = a + b;
            a = b;
            b = c;
            d += 2;
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN5
     */
    public void GES5() {
        int n = GEnum;
        System.out.print("SN5 es: ");
        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN6
     */
    public void GES6() {
        int n = GEnum;
        System.out.print("SN6 es: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }

    /**
     * Imprime la serie SN7
     */
    public void GES7() {
        int n = GEnum;
        System.out.print("SN7 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print((1 + 3 * i) + " ");
        }
        System.out.println();
    }

    /**
     * Determina si un número es primo
     * @param num el número a verificar
     * @return true si el número es primo, false en caso contrario
     */
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para eliminar un caracter de una frase y convertir la frase resultante a mayúsculas
     * @param frase La frase original
     * @param caracter El caracter a eliminar
     */
    public void GEC07(String frase, char caracter) {
        int verificateChar = frase.indexOf(caracter);

        if (verificateChar != -1) {
            System.out.println((frase.replace(Character.toString(caracter), "")).toUpperCase());
        } else {
            System.out.println("Caracter no encontrado en la frase");
        }
    }

    /**
     * Método para imprimir el nombre completo en una matriz
     */
    public void GEA05() {
        int size = fullName.length();
        matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = ' ';
            }
        }

        for (char c : fullName.toCharArray()) {
            int x, y;
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (matrix[x][y] != ' ');

            if (matrix[x][y] == c) {
                matrix[x][y] = '*';
            } else {
                matrix[x][y] = c;
            }
            amImprimirMatriz();
            delay(500);
        }
    }

    /**
     * Método para imprimir la matriz
     */
    public void amImprimirMatriz() {
        for (char[] row : matrix) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Método para pausar la ejecución
     * @param amTiempo El tiempo de pausa en milisegundos
     */
    public void delay(int amTiempo) {
        try {
            TimeUnit.MILLISECONDS.sleep(amTiempo);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Método para simular una barra de carga con el nombre completo
     * @param nombre El nombre a usar
     * @param apellido El apellido a usar
     */
    public void GEL09(String nombre, String apellido) {
        int tamanio = nombre.length() + apellido.length() + 1;
        char[] nombreChar = nombre.toCharArray();
        char[] apellidoChar = apellido.toCharArray();
        int porcentaje = 0;
        StringBuilder carga = new StringBuilder("[" + " ".repeat(tamanio) + "]");
        for (int i = 0; i < tamanio; i++) {
            if (i < nombre.length()) {
                carga.setCharAt(i + 1, nombreChar[i]);
            } else if (i == nombre.length()) {
                carga.setCharAt(i + 1, ' ');
            } else {
                carga.setCharAt(i + 1, apellidoChar[i - nombre.length() - 1]);
            }
            porcentaje = (i + 1) * 100 / tamanio;
            System.out.print("\r" + carga);
            System.out.print(" " + porcentaje + "%");
            carga.setCharAt(i + 1, ' ');
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\n");
    }

    /**
     * Método para simular la descarga de un archivo
     */
    public void GeL10() {
        System.out.println("Descargando " + amArchivo + " (" + amNumero + " kB)");
        while (amProgreso < amTotal) {
            amProgreso += new Random().nextInt(5) + 1;
            int progresoPorcentaje = (int) ((amProgreso / amTotal) * 100);
            StringBuilder barraProgreso = new StringBuilder();
            for (int i = 0; i < 50; i++) {
                if (i < progresoPorcentaje / 2) {
                    barraProgreso.append("-");
                } else {
                    barraProgreso.append(" ");
                }
            }
            System.out.print("\r" + ANSI_GREEN + barraProgreso + ANSI_RESET + " " + String.format("%.1f", amProgreso) + " / " + amNumero + " kB");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n¡Descarga completa!");
    }
}