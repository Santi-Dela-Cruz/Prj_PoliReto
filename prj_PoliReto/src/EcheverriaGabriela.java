/**
 * Poli Retos
 * clase EcheverrriaGabriela
 * @version 1.0
 * @ Gabriela Echeverria
 */
public class EcheverriaGabriela {
    private int GEnum;

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
}
