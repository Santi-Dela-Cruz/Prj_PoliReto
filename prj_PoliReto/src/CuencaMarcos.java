import java.util.Arrays;

/**
 * Clase que realiza las series de caracteres de la 3 a la 10
 * 
 * @author Cuenca Marcos
 */
public class CuencaMarcos {

    /*
     * Metodo que devuelve una serie que, con un caracter elegido por el usuario, va
     * aumentando segun la cantidad de repeticiones que pida el usuario
     */
    public void MCSC3(char mcCaracter, int mcCantidadRepeticiones) {
        String mcStringFinal = (mcCaracter + "");
        for (int i = 0; i < mcCantidadRepeticiones; i++) {
            mcStringFinal += mcCaracter;
            System.out.print(mcStringFinal + " ");
        }
    }

    /*
     * Metodo que devuelve una cantidad de repeticiones de un patron de 4 simbolos
     */
    public void MCSC4(int mcCantidadRepeticiones) {
        char mcPrimerSimbolo = 43;
        char mcSegundoSimbolo = 45;
        char mcTercerSimbolo = 42;
        char mcCuartoSimbolo = 47;
        for (int i = 0; i < mcCantidadRepeticiones; i++) {
            System.out.print(mcPrimerSimbolo + "  ");
            System.out.print(mcSegundoSimbolo + "  ");
            System.out.print(mcTercerSimbolo + "  ");
            System.out.print(mcCuartoSimbolo + "  ");
        }
    }

    /*
     * Metodo que devuelve una cantidad de repeticiones de un patron de 5 simbolos
     */
    public void MCSC5(int mcCantidadRepeticiones) {
        char mcPrimerSimbolo = 124;
        char mcSegundoSimbolo = 92;
        char mcTercerSimbolo = 47;
        char mcCuartoSimbolo = 45;

        for (int i = 0; i < mcCantidadRepeticiones; i++) {
            System.out.print(mcSegundoSimbolo + "  ");
            System.out.print(mcPrimerSimbolo + "  ");
            System.out.print(mcTercerSimbolo + "  ");
            System.out.print(mcCuartoSimbolo + "  ");
            System.out.print(mcPrimerSimbolo + "  ");
        }

    }

    /*
     * Metodo que devuelve el abecedario hasta una letra a elección del usuario
     */
    public void MCSC6(char mcLetraFinal) {
        int mcLetraNumeroASCII = 97;
        char mcLetraActual = (char) mcLetraNumeroASCII;
        if ((mcLetraFinal < 97) || (mcLetraFinal > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio 6 no se va a ejecutar");
        } else {
            while (mcLetraActual < mcLetraFinal) {
                mcLetraActual = (char) mcLetraNumeroASCII;
                System.out.print(mcLetraActual + "  ");
                mcLetraNumeroASCII += 1;
            }
        }

    }

    /*
     * Metodo que devuelve el abecedario, pero saltando una letra el caracter se
     * sustituye por un + o -
     */
    public void MCSC7(char mcLetraFinal) {
        int mcLetraNumeroASCII = 97;
        char mcLetraActual = (char) mcLetraNumeroASCII;
        int mcBanderaSimbolo = 0;
        if ((mcLetraFinal < 97) || (mcLetraFinal > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio 7 no se va a ejecutar");
        } else {
            while (mcLetraActual < mcLetraFinal) {
                mcLetraActual = (char) mcLetraNumeroASCII;
                if (mcLetraActual % 2 == 0) {
                    if (mcBanderaSimbolo == 0) {
                        System.out.print("+" + "  ");
                        mcBanderaSimbolo = 1;
                    } else {
                        System.out.print("-" + "  ");
                        mcBanderaSimbolo = 0;
                    }
                } else {
                    System.out.print(mcLetraActual + "  ");
                }
                mcLetraNumeroASCII += 1;
            }
        }

    }

    /*
     * Metodo que devuelve el abecedario, pero la cantidad de repeticiones de cada
     * letra aumenta en 2
     */
    public void MCSC8(char mcLetraFinal) {
        int mcLetraNumeroASCII = 97;
        char mcLetraActual = (char) mcLetraNumeroASCII;
        int mcNumeroRepeticiones = 2;
        if ((mcLetraFinal < 97) || (mcLetraFinal > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio 8 no se va a ejecutar");
        } else {
            while (mcLetraActual < mcLetraFinal) {
                mcLetraActual = (char) mcLetraNumeroASCII;
                for (int i = 0; i < mcNumeroRepeticiones; i++) {
                    System.out.print(mcLetraActual);
                }
                System.out.print("  ");
                mcLetraNumeroASCII += 1;
                mcNumeroRepeticiones += 2;
            }
        }
    }

    /*
     * Metodo que devuelve el abecedario, pero la cantidad de repeticiones de cada
     * letra aumenta en 2
     */
    public void MCSC9(char mcLetraFinal) {
        int mcLetraNumeroASCII = 97;
        char mcLetraActual = (char) mcLetraNumeroASCII;
        int mcNumeroRepeticiones = 1;
        if ((mcLetraFinal < 97) || (mcLetraFinal > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio 8 no se va a ejecutar");
        } else {
            while (mcLetraActual < mcLetraFinal) {
                mcLetraActual = (char) mcLetraNumeroASCII;
                for (int i = 0; i < mcNumeroRepeticiones; i++) {
                    System.out.print(mcLetraActual);
                }
                System.out.print("  ");
                mcLetraNumeroASCII += 1;
                mcNumeroRepeticiones += 2;
            }
        }
    }

    /*
     * Metodo que devuelve el abecedario, pero siguiendo un patron basado en la
     * secuencia de Fibonacci
     */
    public void MCSC10(char mcLetraFinal) {
        int mcLetraNumeroASCII = 97;
        char mcLetraActual = (char) mcLetraNumeroASCII;
        int mcTotalRepeticiones = 1;
        int mcValorLetra1 = 0;
        int mcValorLetra2 = 1;
        boolean banderaCaracterExtra = true;

        if ((mcLetraFinal < 97) || (mcLetraFinal > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio 9 no se va a ejecutar");
        } else {
            // El patron de repeticion de los caracteres se basa en una secuencia de
            // Fibonacci
            if (banderaCaracterExtra) {
                banderaCaracterExtra = false;
                System.out.print(mcLetraActual + "  ");
                mcLetraNumeroASCII += 1;
            }
            while (mcLetraActual < mcLetraFinal) {
                mcLetraActual = (char) mcLetraNumeroASCII;
                for (int i = 0; i < mcTotalRepeticiones; i++) {
                    System.out.print(mcLetraActual);
                }
                System.out.print("  ");
                mcLetraNumeroASCII += 1;
                mcTotalRepeticiones = mcValorLetra1 + mcValorLetra2;
                mcValorLetra1 = mcValorLetra2;
                mcValorLetra2 = mcTotalRepeticiones;
            }
        }
    }

    //Ejercicios nuevos
    /*
     * Metodo que devuelve la frase ingresada pero sin una vocal elegida por el usuario
     */
    public void MCC03 (String frase, char vocalEliminada){
        String fraseSinVocal = "";

        for (int i=0; i<frase.length(); i++){
            char letraActual = frase.charAt(i);
            if (letraActual==vocalEliminada){
                fraseSinVocal+=" ";
            } else {
                fraseSinVocal+=letraActual;
            }
        }
        System.out.println("Frase elegida: "+frase);
        System.out.println("Vocal a eliminar: "+vocalEliminada);
        System.out.println("Frase sin la vocal: "+fraseSinVocal);

    }

    /*
     * Metodo que devuelve la frase ingresada pero sin una letra elegida por el usuario
     */
    public void MCC04 (String frase, char letraEliminada){
        String fraseSinLetra = "";

        for (int i=0; i<frase.length(); i++){
            char letraActual = frase.charAt(i);
            if (letraActual==letraEliminada){
                fraseSinLetra+=" ";
            } else {
                fraseSinLetra+=letraActual;
            }
        }
        System.out.println("Frase elegida: "+frase);
        System.out.println("Letra a eliminar: "+letraEliminada);
        System.out.println("Frase sin la letra: "+fraseSinLetra);

    }

    /*
     * Metodo que devuelve las iniciales MC impresas dado un tamano y un caracter dados por el usuario
     */
    public void MCA02 (int tamano, char caracter){
        //Dado que mi nombre es Marcos Cuenca, las iniciales seran MC
        int anchuraMC = tamano;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if ((j == 0) || (j == anchuraMC - 1) || ((i == j) && (j <= anchuraMC / 2)) || ((i + j == anchuraMC - 1) && (j >= anchuraMC / 2))) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for (int j = 0; j < anchuraMC; j++) {
                if ((i == 0) || (i == tamano - 1) || (j == 0)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }    
    
    }
    
    /*
     * Metodo que devuelve una barra de carga que se desplaza de izquierda a derecha
     */
    public void MCL03 (char caracter){
        String [] arregloCarga = new String[19];

        for (int porcentajeCarga = 0; porcentajeCarga<101; porcentajeCarga += 20) {
            for (int i = 0; i < arregloCarga.length; i++){
                for (int j = 0; j < arregloCarga.length; j++) {
                    arregloCarga[j] = " ";
                }
                arregloCarga[i] = "" + caracter;
    
                String cadena = "\r[";
                for (int s = 0; s < arregloCarga.length; s++){
                    cadena += arregloCarga[s];
                }
                cadena += "] " + porcentajeCarga + "%";
    
                System.out.print(cadena);

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {}
            }

            for (int i = arregloCarga.length - 1; i > 0; i--) {
                for (int j = 0; j < arregloCarga.length; j++) {
                    arregloCarga[j] = " ";
                }
                arregloCarga[i] = "" + caracter;
    
                String cadena = "\r[";
                for (int s = 0; s < arregloCarga.length; s++) {
                    cadena += arregloCarga[s];
                }
                cadena += "] " + porcentajeCarga + "%";

                System.out.print(cadena);
    
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {}
            }
        }
    }

    /*
     * Metodo que devuelve una barra de carga que usa los caracteres o0o para simular movimiento
     */
    public void MCL04 (){
        String [] arregloCarga = new String[3];
        for (int porcentajeCarga = 0; porcentajeCarga<101; porcentajeCarga+=20){
            for (int i = 0; i < arregloCarga.length; i++) {
                for (int j = 0; j < arregloCarga.length; j++) {
                    arregloCarga[j] = "o";
                }
                arregloCarga[i] = "0";
    
                String cadena = "\r";
                for (int s = 0; s < arregloCarga.length; s++) {
                    cadena += arregloCarga[s];
                }
                cadena += "  " + porcentajeCarga + "%";

                System.out.print(cadena);
    
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {}
            }
            for (int i = arregloCarga.length-1; i > 0; i--) {
                for (int j = 0; j < arregloCarga.length; j++) {
                    arregloCarga[j] = "o";
                }
                arregloCarga[i] = "0";
    
                String cadena = "\r";
                for (int s = 0; s < arregloCarga.length; s++) {
                    cadena += arregloCarga[s];
                }
                cadena += "  " + porcentajeCarga + "%";

                System.out.print(cadena);
    
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {}
            }
        }
        
    }
}
