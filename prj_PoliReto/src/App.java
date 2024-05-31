import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Definicion de variables
        int numeroFinalUsuario;
        char caracterUsuario, caracterUsuarioDos;
        int numeroRepeticionesUsuario;
        char letraFinalUsuario;
        int nivelesFiguras;

        // Instanciaminetos
        CuencaMarcos imprimirMCSC = new CuencaMarcos();
        DeLaCruzKevin DLK = new DeLaCruzKevin(1);
        FuentesCarlos CF = new FuentesCarlos();

        // Ejecucion del codigo
        System.out.println("GRUPO 2");
        System.out.println("Integrantes del grupo:");
        System.out.println("Marcos Cuenca");
        System.out.println("De La Cruz Kevin");
        System.out.println("Fuentes Carlos");





        // Ingresar sus nombres por favor

       
        System.out.println("----------------Ejercicios de la serie de numeros-----------------");
        System.out.println("Para algunos de las siguientes series, se necesitara ingresar un numero que sera utilizado para el final de la serie ");
        System.out.println("RECORDATORIO: si el numero ingresado es menor, la serie se adaptara al numero mas cercano");
        System.out.println("Ingrese un numero que finalizara las series: ");
        numeroFinalUsuario = Validadores.validarIngresoEnteros(sc);
        System.out.print("SN8: ");
        CF.CFSN8(numeroFinalUsuario);
        System.out.println("");
        System.out.print("SN9: ");
        CF.CFSN9(numeroFinalUsuario);
        System.out.println("");
        System.out.print("SN10: ");
        CF.CFSN10(numeroFinalUsuario);
        System.out.println("");
        System.out.print("SN12: ");
        CF.CFSN12(numeroFinalUsuario);
        System.out.println("");











        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        System.out.println(
                "Para algunos de estos ejercicios se necesitara un caracter a su eleccion, para otros una cantidad de repeticiones, y para otros la letra final para finalizar la serie");
        System.out.println("Ingresa el primer caracter a tu eleccion");
        caracterUsuario = Validadores.validarIngresoCaracteres(sc);
        System.out.println("Ingresa el segundo caracter a tu eleccion");
        caracterUsuarioDos = Validadores.validarIngresoCaracteres(sc);
        System.out.println("Ingresa el numero de repeticiones que realizaran algunas series");
        numeroRepeticionesUsuario = Validadores.validarIngresoEnteros(sc);
        System.out.println("Ingresa la letra con la que finalizaran ciertas series");
        letraFinalUsuario = Validadores.validarIngresoLetra(sc);

        System.out.println("SC1: ");
        CF.CFSC1(caracterUsuario, caracterUsuarioDos, numeroRepeticionesUsuario);
        System.out.println("");
        System.out.println("SC2: ");
        CF.CFSC2(caracterUsuarioDos, numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC3: ");
        imprimirMCSC.MCSC3(caracterUsuario, numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC4: ");
        imprimirMCSC.MCSC4(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC5: ");
        imprimirMCSC.MCSC5(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC6: ");
        imprimirMCSC.MCSC6(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC7: ");
        imprimirMCSC.MCSC7(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC8: ");
        imprimirMCSC.MCSC8(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC9: ");
        imprimirMCSC.MCSC9(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC10: ");
        imprimirMCSC.MCSC10(letraFinalUsuario);
        System.out.println("");
        System.out.println("");






        System.out.println("----------------Ejercicios de la serie de figuras------------------");
        /*
         F1
         F2
         F3
         F4
         ...
         */
        
        System.out.println("F15: ");
        System.out.print("Ingrese el nivel que desea que tenga la figura: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        DLK.setDkNivel(nivelesFiguras);
        DLK.dkF15();

        System.out.println("F16: ");
        System.out.print("Ingrese el nivel que desea que tenga la figura: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        DLK.setDkNivel(nivelesFiguras);
        DLK.dkF16(DLK.getDkNivel());

        System.out.println("F17: ");
        System.out.print("Ingrese el nivel que desea que tenga la figura: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        DLK.setDkNivel(nivelesFiguras);
        DLK.dkF17(DLK.getDkNivel());

        System.out.println("F18: ");
        System.out.print("Ingrese el nivel que desea que tenga la figura: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        DLK.setDkNivel(nivelesFiguras);
        DLK.dkF18();

        System.out.println("F19: ");
        System.out.print("Ingrese el nivel que desea que tenga la figura: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        DLK.setDkNivel(nivelesFiguras);
        DLK.dkF19();
        
    }
}

