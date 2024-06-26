import java.util.Scanner;
public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Definicion de variables
        int numeroFinalUsuario;
        int tamanoFiguras;
        int tamanoSerie;
        int tamanoLetras;
        char caracterUsuario, caracterUsuarioDos;
        int numeroRepeticionesUsuario;
        int nivelesFiguras;
        char letraFinalUsuario;
        String fraseUsuario;
        String nombre, apellido;
        char letraAEliminar;
        double porcent1, porcent2, porcent3, porcent4;
        int porcentaje = 20;
        

        // Instanciaminetos
        CuencaMarcos MC = new CuencaMarcos();
        DeLaCruzKevin DLK = new DeLaCruzKevin(1);
        FuentesCarlos CF = new FuentesCarlos();
        ZambranoDante ZD = new ZambranoDante();
        EcheverriaGabriela EG = new EcheverriaGabriela();
        CuasapazJonathan CJ = new CuasapazJonathan();

        
        // Ejecucion del codigo
        // Ingresar sus nombres por favor
        System.out.println();
        System.out.println("GRUPO 2");
        System.out.println("Integrantes del grupo:");
        System.out.println("-   Cuenca Marcos");
        System.out.println("-   De La Cruz Kevin");
        System.out.println("-   Fuentes Carlos");
        System.out.println("-   Echeverria Gabriela");
        System.out.println("-   Cuasapaz Jonathan");
        System.out.println("-   Zambrano Dante");
        

    
        System.out.println( );
        System.out.println("----------------Ejercicios de la serie de numeros-----------------");
        System.out.println("Para algunos de las siguientes series, se necesitara ingresar un numero que sera utilizado para el final de la serie ");
        System.out.println("RECORDATORIO: si el numero ingresado es menor, la serie se adaptara al numero mas cercano");
        System.out.println( );
        System.out.print("Ingrese el tamaño de la serie 1 (SN1): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES1();
        System.out.print("Ingrese el tamaño de la serie 2 (SN2): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES2();
        System.out.print("Ingrese el tamaño de la serie 3 (SN3): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES3();
        System.out.print("Ingrese el tamaño de la serie 4 (SN4): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES4();
        System.out.print("Ingrese el tamaño de la serie 5 (SN5): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES5();
        System.out.print("Ingrese el tamaño de la serie 6 (SN6): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES6();
        System.out.print("Ingrese el tamaño de la serie 7 (SN7): ");
        tamanoSerie = Validadores.validarIngresoEnteros(sc);
        EG.setGEnum(tamanoSerie);
        EG.GES7();
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

        System.out.println( );
        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        System.out.println("Para algunos de estos ejercicios se necesitara un caracter a su eleccion, para otros una cantidad de repeticiones, y para otros la letra final para finalizar la serie");
        System.out.println( );
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
        MC.MCSC3(caracterUsuario, numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC4: ");
        MC.MCSC4(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC5: ");
        MC.MCSC5(numeroRepeticionesUsuario);
        System.out.println("");

        System.out.println("SC6: ");
        MC.MCSC6(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC7: ");
        MC.MCSC7(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC8: ");
        MC.MCSC8(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC9: ");
        MC.MCSC9(letraFinalUsuario);
        System.out.println("");

        System.out.println("SC10: ");
        MC.MCSC10(letraFinalUsuario);
        System.out.println("");
        System.out.println("");



        System.out.println("----------------Ejercicios de la serie de figuras------------------");

        System.out.println("F1: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF1();

        System.out.println("F2: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF2();
        
        System.out.println("F3: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF3();

        System.out.println("F4: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF4();

        System.out.println("F5: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF5();

        System.out.println("F6: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF6();

        System.out.println("F7: ");
        System.out.print("Ingrese el tamaño: ");
        nivelesFiguras = Validadores.validarIngresoEnteros(sc);
        CJ.setCjTamano(nivelesFiguras);
        CJ.cjF7();

        System.out.println("F8: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF8(tamanoFiguras);
        System.out.println("");

        System.out.println("F9: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF9(tamanoFiguras);
        System.out.println("");

        System.out.println("F10: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF10(tamanoFiguras);
        System.out.println("");

        System.out.println("F11: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF11(tamanoFiguras);
        System.out.println("");

        System.out.println("F12: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF12(tamanoFiguras);
        System.out.println("");

        System.out.println("F13: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF13(tamanoFiguras);
        System.out.println("");

        System.out.println("F14: ");
        System.out.println("Ingrese el tamano que desea");
        tamanoFiguras = Validadores.validarIngresoEnteros(sc);
        ZD.zdF14(tamanoFiguras);
        System.out.println("");

        System.out.println("Para estos ejercicios solo se necesita el tamaño del que será cada figura");
        System.out.println( );

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

        System.out.println("----------------Ejercicios de cadenas de caracteres------------------");
        System.out.println("C01: ");
        System.out.println("Ingrese una frase");
        fraseUsuario = sc.nextLine();
        DLK.dKC01(fraseUsuario);

        System.out.println("C02: ");
        System.out.println("Ingrese una frase");
        fraseUsuario = sc.nextLine();
        DLK.dKC02(fraseUsuario);


        System.out.println("C03: ");
        System.out.println("Ingresa una frase");
        fraseUsuario = sc.nextLine();
        System.out.println("Ingresa una vocal a eliminar");
        letraAEliminar = Validadores.validarIngresoVocal(sc);
        MC.MCC03(fraseUsuario, letraAEliminar);
        System.out.println("");

        System.out.println("C04: ");
        System.out.println("Ingresa una frase");
        fraseUsuario = sc.nextLine();
        System.out.println("Ingresa una letra a eliminar");
        letraAEliminar = Validadores.validarIngresoLetra(sc);
        MC.MCC04(fraseUsuario, letraAEliminar);
        System.out.println("");

        System.out.println("C05: ");
        System.out.print("Ingrese una frase: ");
        sc.nextLine();
        fraseUsuario = sc.nextLine();
        CJ.cjC05(fraseUsuario);

        System.out.println("C06: ");
        System.out.println("Ingrese una frase:");
        sc.nextLine();
        fraseUsuario = sc.nextLine();
        CF.CFC06(fraseUsuario);

        System.out.println("----------------Ejercicios de Arrays------------------");

        System.out.println();
        System.out.println("A01: ");
        System.out.println("Ingrese 4 porcentajes");
        porcent1 = Validadores.validarIngresoDouble(sc);
        porcent2 = Validadores.validarIngresoDouble(sc);
        porcent3 = Validadores.validarIngresoDouble(sc);
        porcent4 = Validadores.validarIngresoDouble(sc);
        DLK.dKA01(porcent1, porcent2, porcent3, porcent4);


        System.out.println();
        System.out.println("A02: ");
        System.out.println("Ingresa el caracter que se usara para dibujar las iniciales del nombre");
        caracterUsuario = Validadores.validarIngresoCaracteres(sc);
        System.out.println("Ingresa el tamano que tendran ambas letras");
        tamanoLetras = Validadores.validarIngresoEnteros(sc);
        MC.MCA02(tamanoLetras, caracterUsuario);
        System.out.println("");

        System.out.println("A02: ");
        System.out.println("Ingrese su nombre:");
        sc.nextLine();
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = sc.nextLine();
        CF.CFA06(nombre,apellido);

        System.out.println();
        System.out.println("A03: ");
        CJ.cjA03();



        System.out.println("----------------Ejercicios de Loading------------------");

        System.out.println();
        System.out.println("L01: ");
        DLK.dKL01();

        System.out.println();
        System.out.println("L02: ");
        System.out.println("Ingrese un caracter: ");
        caracterUsuario = Validadores.validarIngresoCaracteres(sc);
        DLK.dKL02(caracterUsuario);

        System.out.println("L03: ");
        System.out.println("Ingresa el caracter que se usara en el loading");
        caracterUsuario = Validadores.validarIngresoCaracteres(sc);
        MC.MCL03(caracterUsuario);
        System.out.println("");

        System.out.println("L04: ");
        MC.MCL04();
        System.out.println("");

        System.out.println();
        System.out.println("L05: ");
        CJ.cjL05(20, 10000);
        System.out.println();

        System.out.println("L06:");
        CJ.cjL06();
        System.out.println();
        
        System.out.println("L07: ");
        CF.CFL07(porcentaje);
        System.out.println("");

        System.out.println("L08: ");
        System.out.println("Ingrese su nombre:");
        sc.nextLine();
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = sc.nextLine();
        CF.CFL08(nombre,apellido);





    
    
        System.out.println("Finalizacion del programa");
        
    }
}

