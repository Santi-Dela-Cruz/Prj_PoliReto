public class CuencaMarcos {

    public void MCSC3(char mcCaracter, int mcCantidadRepeticiones) {
        String mcStringFinal = "*";
        for (int i = 0; i < mcCantidadRepeticiones; i++) {
            mcStringFinal += mcCaracter;
            System.out.print(mcStringFinal + " ");
        }
    }

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

    public void MCSC8(char mcLetraFinal) {
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

    public void MCSC9(char mcLetraFinal) {
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
            if (banderaCaracterExtra){
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
}
