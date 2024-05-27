import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Definicion de variables
        char caracterUsuario;
        int numeroRepeticionesUsuario;
        char letraFinalUsuario;

        // Ejecucion del codigo
        System.out.println("GRUPO 2");
        System.out.println("Integrantes del grupo:");
        System.out.println("Marcos Cuenca");





        // Ingresar sus nombres por favor

        System.out.println("----------------Ejercicios de la serie de numeros-----------------");
        System.out.println("");











        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        System.out.println(
                "Para algunos de estos ejercicios se necesitara un caracter a su eleccion, para otros una cantidad de repeticiones, y para otros la letra final para finalizar la serie");
        System.out.println("Ingresa un caracter a tu eleccion");
        caracterUsuario = sc.next().charAt(0);
        System.out.println("Ingresa el numero de repeticiones que realizaran algunas series");
        numeroRepeticionesUsuario = sc.nextInt();
        System.out.println("Ingresa la letra con la que finalizaran ciertas series");
        letraFinalUsuario = sc.next().charAt(0);

        System.out.println("SC1: ");
        System.out.println("");

        System.out.println("SC2: ");
        System.out.println("");

        System.out.println("SC3: ");
        CuencaMarcos imprimirMCSC3 = new CuencaMarcos();
        imprimirMCSC3.MCSC3(caracterUsuario, numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC4: ");
        CuencaMarcos imprimirMCSC4 = new CuencaMarcos();
        imprimirMCSC4.MCSC4(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC5: ");
        CuencaMarcos imprimirMCSC5 = new CuencaMarcos();
        imprimirMCSC5.MCSC5(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC6: ");
        CuencaMarcos imprimirMCSC6 = new CuencaMarcos();
        imprimirMCSC6.MCSC6(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC7: ");
        CuencaMarcos imprimirMCSC7 = new CuencaMarcos();
        imprimirMCSC7.MCSC7(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC8: ");
        CuencaMarcos imprimirMCSC8 = new CuencaMarcos();
        imprimirMCSC8.MCSC8(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC9: ");
        CuencaMarcos imprimirMCSC9 = new CuencaMarcos();
        imprimirMCSC9.MCSC9(letraFinalUsuario);
        System.out.println("");
        System.out.println("");










        System.out.println("----------------Ejercicios de la serie de figuras------------------");








        
    }
}
