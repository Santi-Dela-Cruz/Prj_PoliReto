
/**
 * Clase que proporciona diversos metodos tanto get/set y metodos que realizan una operaciones basada en diferentes series.
 * @author De La Cruz Kevin.
 */
public class DeLaCruzKevin {

    private int dkNivel;

    public void main(String[] args) {
        dKC01("Hola");
    }

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

    public void dKC01(String frase){
        /*
         * C01)    Pedir una frase y contador las vocales. 
        Ejemplo, frase: ballena
                salida: tiene 3 vocales
         */
        char[] fraseLista = frase.toUpperCase().toCharArray();
        int contador = 0;
        for (char vocales : fraseLista) {
            if (vocales == 'A' || vocales == 'E' || vocales == 'I' || vocales == 'O' || vocales == 'U') {
                contador++;
            }
        }

        System.out.println("Frase: " + frase.toUpperCase());
        System.out.println("La frase tiene: " + contador + " vocales");        
    }

    public void dKC02(String frase){
        /*
         * C02)    Pedir una frase y contador las letras.  
        Ejemplo, frase : ballena
                salida: tiene 4 letras
         */

         char[] fraseLista = frase.toUpperCase().toCharArray();
        int contador = 0;
        for (char letras : fraseLista) {
            if (Character.isLetter(letras)) {
                contador++;
            }
        }

        System.out.println("Frase: " + frase.toUpperCase());
        System.out.println("La frase tiene: " + contador + " letras");

    }

    public void dKA01(double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4) {
        /*
         * Crear una array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.
            Ejemplo:    Pancracia Carmeliana Altamirano Perez
             Ingrese el porcentaje de carga: 100 75 50 25
             Pancracia Carmeliana Altamirano Perez
             [==============>] 100% Pancracia
             [==========>    ]  75% Carmeli
             [=======>       ]  50% Altam
             [===>           ]  25% Pe
         */

        double[] porcentajes = {porcentaje1, porcentaje2, porcentaje3, porcentaje4};
        String[] dkNombreCompleto = {"KEVIN", "SANTIAGO", "DE LA CRUZ", "CANAR"};
        int barraLongitud = 15;

        for (int i = 0; i < dkNombreCompleto.length; i++) {
            int dkCargaNombreCompleto = (int) Math.ceil((dkNombreCompleto[i].length() * porcentajes[i]) / 100.0);
            StringBuilder barra = new StringBuilder();
            int progresoActual = (int) ((porcentajes[i] / 100.0) * barraLongitud);

            barra.append("[");
            for (int j = 0; j < barraLongitud; j++) {
                if (j < progresoActual) {
                    barra.append("=");
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(String.format("%3d", (int) porcentajes[i])).append("% ");
            barra.append(dkNombreCompleto[i].substring(0, dkCargaNombreCompleto));

            System.out.println(barra.toString());
        }
    }

    public void dKL01(){
        /*
         *Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100%  / 100%
         */

        String[] dkSignos = {"\\", "|", "/", "-"};
        int dkPorcentaje = 0;

        while (dkPorcentaje <= 100) {
            for (String dkSigno : dkSignos) {
                System.out.print("\r" + dkSigno + " " + dkPorcentaje + "%");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException dkExcepcion) {
                    dkExcepcion.printStackTrace();
                }
                dkPorcentaje++;
                if (dkPorcentaje > 100) {
                    break;
                }
            }
        }
        System.out.println("\rCompletado! 100%");

    }

    public void dKL02(char dkCaracter) {
        /*
         * L02) Pedir un carácter para simular la carga y la longitud de la barra es de 20 caracteres [###         ] 20%
         */
    
        int dkLongitudBarra = 20;
        int dkPorcentaje = 0;
    
        while (dkPorcentaje <= 100) {
            int dkProgresoActual = (int) ((dkPorcentaje / 100.0) * dkLongitudBarra);
            StringBuilder dkBarra = new StringBuilder();
    
            dkBarra.append("[");
            for (int i = 0; i < dkLongitudBarra; i++) {
                if (i < dkProgresoActual) {
                    dkBarra.append(dkCaracter);
                } else {
                    dkBarra.append(" ");
                }
            }
            dkBarra.append("] ").append(String.format("%3d", dkPorcentaje)).append("%");
    
            System.out.print("\r" + dkBarra.toString());
    
            try {
                Thread.sleep(100); // Pausa para simular el progreso
            } catch (InterruptedException dkExcepcion) {
                dkExcepcion.printStackTrace();
            }
    
            dkPorcentaje++;
        }
    
        System.out.println("\r[####################] 100%");
    }
    
}

