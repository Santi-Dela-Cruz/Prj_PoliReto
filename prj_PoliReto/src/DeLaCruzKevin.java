
/**
 * Clase que proporciona diversos metodos tanto get/set y metodos que realizan una operaciones basada en diferentes series.
 * @author De La Cruz Kevin.
 */
public class DeLaCruzKevin {

    private int dkNivel;

    /**
     * Metodo que inicializa el nivel/tamano
     *
     * @param nivel: Valor del nivel/tamano inicial.
     */
    public DeLaCruzKevin(int nivel) {
        this.dkNivel = nivel;
    }

    /**
     * Metodo que establece el nivel/tamano
     *
     * @param dkNivel: Valor del nuevo nivel/tamano.
     */
    public void setDkNivel(int dkNivel) {
        this.dkNivel = dkNivel;
    }

    /**
     * Metodo que obtiene el nivel/tamno actual
     *
     * @return int: Retorna el nivel actual
     */
    public int getDkNivel() {
        return this.dkNivel;
    }

    /*
        * Imprime el triángulo de Pascal hasta el nivel dado.
     */
    public void dkF15() {

        /*
            Objetivo:
            1
            1  1
            1  2  1
            1  3  3  1
            1  4  6  4  1
            1  5 10 10  5  1
         */
        System.out.println();
        for (int i = 0; i < dkNivel; i++) {
            int res = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(res + " ");
                res = res * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    /*
        * Imprime una estructura de signos más y menos en forma de X y cruz.
     */
    public void dkF16(int dkNivel) {
        /*
            Objetivo:
               +               +
                   -       -
                       +
                   -       -
               +               +
         */

        char caracterActual = '-';
        char caracterSiguiente = '+';

        for (int i = 0; i < dkNivel; i++) {
            for (int j = 0; j < dkNivel; j++) {
                if (j == i || j == dkNivel - 1 - i) {
                    if (i == dkNivel / 2) {
                        System.out.print('+');
                    } else {
                        System.out.print(caracterActual);
                    }
                } else {
                    System.out.print(' ');
                }
            }
            // Alternar el carácter sin usar operador ternario
            char temp = caracterActual;
            caracterActual = caracterSiguiente;
            caracterSiguiente = temp;

            System.out.println();
        }

    }


    /*
        * Imprime una estructura de unos y ceros en forma de X y cruz.
     */
    public void dkF17(int dkNivel) {
        /*
            Objetivo:
               1               1
                   0       0
                       1
                   0       0
               1               1
         */

        char caracterActual = '0';
        char caracterSiguiente = '1';

        for (int i = 0; i < dkNivel; i++) {
            for (int j = 0; j < dkNivel; j++) {
                if (j == i || j == dkNivel - 1 - i) {
                    if (i == dkNivel / 2) {
                        System.out.print('1');
                    } else {
                        System.out.print(caracterActual);
                    }
                } else {
                    System.out.print(' ');
                }
            }
            // Alternar el carácter sin usar operador ternario
            char temp = caracterActual;
            caracterActual = caracterSiguiente;
            caracterSiguiente = temp;

            System.out.println();
        }
    }

    /*
        * Imprime una secuencia de números en formato de triángulo.
     */
    public void dkF18() {

        /*
            Objetivo:
            2
            1 2
            1 3 2
            1 4 5 2
            1 5 9 7 2
            1 6 14 16 2
            ...
         */
        int[] filaAnterior = new int[dkNivel];
        int[] filaActual = new int[dkNivel];

        for (int i = 0; i < dkNivel; i++) {
            filaActual[0] = 1;
            System.out.print(filaActual[0] + " ");
            for (int j = 1; j < i; j++) {
                filaActual[j] = filaAnterior[j - 1] + filaAnterior[j];
                System.out.print(filaActual[j] + " ");
            }
            if (i > 0) {
                filaActual[i] = 2;
                System.out.print(filaActual[i]);
            }
            System.out.println();
            System.arraycopy(filaActual, 0, filaAnterior, 0, i + 1);
        }
    }

    /*
        * Imprime una estructura de signos más y asteriscos en formato de triángulo.
     */
    public void dkF19() {

        /*
            Objetivo:
            *
            * *
            * 3 *
            * 4 5 *
            * 5 9 7 *
            ...
         */
        int[] filaAnterior = new int[dkNivel];
        int[] filaActual = new int[dkNivel];

        for (int i = 0; i < dkNivel; i++) {
            filaActual[0] = 1;
            System.out.print("+ ");
            for (int j = 1; j < i; j++) {
                filaActual[j] = filaAnterior[j - 1] + filaAnterior[j];
                System.out.print(filaActual[j] + " ");
            }
            if (i > 0) {
                filaActual[i] = 2;
                System.out.print("* ");
            }
            System.out.println();
            System.arraycopy(filaActual, 0, filaAnterior, 0, i + 1);
        }
    }
}
