import java.util.Arrays;

/**
 *Clase que realiza las series numericas del 8 al 12 y las series de caracteres 1 y 2
 
 @author Fuentes Carlos
 **/
public class FuentesCarlos {
    /** *
     * Metodo que retorna una serie numerica, la cual finalizara en el numero ingresado por el usuario
     * @param cfNumeroFinal
    */
    public void CFSN8(int cfNumeroFinal) {
                
        // Inicializar el primer número de la secuencia
        int numero = 3;
        
        // Generar a secuencia 3, 8, 13, 18, 23...
        //si el numero ingresado por el usuario es menor al ultimo numero, la serie se adaptara al numero mas cercano
        while (numero <= cfNumeroFinal) {
            System.out.print(numero + " ");
            numero += 5;  
        }
       
    }
    /**
     * Metodo que retorna una serie numerica, la cual finalizara en el numero ingresado por el usuario
     * @param cfNumeroFinal
     */
    public void CFSN9(int cfNumeroFinal){

        //inicializar el primer numero de la serie
        int numeroDos = 2;
        //Generar la serie 2, 4, 8, 16, 32...
        //si el numero ingresado por el usuario es menor al ultimo numero, la serie se adaptara al numero mas cercano
        while(numeroDos <= cfNumeroFinal){
            System.out.print(numeroDos + " ");
            numeroDos = numeroDos*2;
        }

    }
    /**
     * Metodo que retorna una serie numerica, la cual finalizara en el numero ingresado por el usuario
     * @param cfNumeroFinal
     */
    public void CFSN10(int cfNumeroFinal){
        //inicializar el primer numero
        int numeroTres = 3;
        //generar la serie 3, 9, 27, 81... 
        while (numeroTres <= cfNumeroFinal) {
            System.out.print(numeroTres + " ");
            numeroTres = numeroTres*3;
        }
    }
    /**
     * Metodo que retorna una serie numerica, la cual finalizara en el numero ingresado por el usuario
     * @param cfNumeroFinal
     */
    public void CFSN12(int cfNumeroFinal){
        //inicializar el primer numero
        int numeroCuatro = 2;
        int contador = 4;
        //generar la serie 2 6 12 20 30...
        while (numeroCuatro <= cfNumeroFinal) {
            
            System.out.print(numeroCuatro + " ");
            numeroCuatro += contador;
            contador = contador+2;
            
        }
    }
    /**
     * Este metodo retornara una serie de caracteres en patron secuencial
     * @param cfCaracterUno
     * @param cfCaracterDos
     * @param cfNumeroRepeticione
     */
    public void CFSC1(char cfCaracterUno, char cfCaracterDos, int cfNumeroRepeticione){
        //generara la seria CaracterUno, CaracterDos, CaracterUno, CaracterDos...
        for(int i = 0; i < cfNumeroRepeticione;i++){
            if(i%2==0){
                System.out.print(cfCaracterUno + " ");
            }else{
                System.out.print(cfCaracterDos+ " ");
            }
        }
    }

    public void CFSC2(char cfCaracter, int cfNumeroRepeticiones){
        int anterior = 1;
        int actual = 1;
        for (int i = 1; i <= cfNumeroRepeticiones; i++) {
            for (int j = 1; j <= actual; j++) {
                System.out.print(cfCaracter);
            }
            System.out.println();
            if (actual > cfNumeroRepeticiones) {
                break;
            }
            System.out.println();
            int temp = actual;
            actual = actual + anterior;
            anterior = temp;

        
        }
        
    
    
    }

    public void CFC06(String cfFrase){

        String fraseInvertida = invertirYCambiarConsonantes(cfFrase);

        System.out.println("Frase invertida con consonantes cambiadas a mayúsculas: " + fraseInvertida);
    }

    
    private static String invertirYCambiarConsonantes(String frase) {
        
        char[] caracteres = frase.toCharArray();

        
        int n = caracteres.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = cambiarConsonante(caracteres[n - 1 - i]);
            caracteres[n - 1 - i] = cambiarConsonante(temp);
        }


        return new String(caracteres);
    }

    
    private static char cambiarConsonante(char c) {
        if (Character.isLetter(c) && !"AEIOUaeiou".contains(String.valueOf(c))) {
            return Character.toUpperCase(c);
        } else {
            return c;
        }
    }

    public void CFA06(String nombre, String apellido){
        int longitudMax = Math.max(nombre.length(), apellido.length());
        char[][] matriz = new char[longitudMax][longitudMax];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < longitudMax; i++) {
            for (int j = 0; j < longitudMax; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Colocar las letras del nombre en la diagonal principal
        for (int i = 0; i < nombre.length(); i++) {
            matriz[i][i] = nombre.charAt(i);
        }

        // Colocar las letras del apellido en la diagonal secundaria
        for (int i = 0; i < apellido.length(); i++) {
            matriz[i][longitudMax - 1 - i] = apellido.charAt(i);
        }

        // Imprimir la matriz resultante
        for (int i = 0; i < longitudMax; i++) {
            for (int j = 0; j < longitudMax; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
    public void animarBarraDeProgreso() throws InterruptedException {
        int duracionAnimacion = 5000; 
        int intervaloActualizacion = 200; 
        int pasos = duracionAnimacion / intervaloActualizacion; 
        int progreso = 0; 
        
        for (int paso = 0; paso <= pasos; paso++) {
            
            progreso = paso * 100 / pasos;
        
            CFL07(progreso);
            

            Thread.sleep(intervaloActualizacion);
            
            limpiarConsola();
        }
        
        CFL07(100);
    }
    public void CFL07(int porcentaje){
        
        int longitudBarra = 20;

        int caracteresLlenos = porcentaje * longitudBarra / 100;
        int caracteresVacios = longitudBarra - caracteresLlenos;
        int indicePunta = porcentaje % 4;
        String barra = "[";
        
        for (int i = 0; i < caracteresLlenos; i++) {
            barra += "=";
        }
        
        switch (indicePunta) {
            case 0:
                barra += "/";
                break;
            case 1:
                barra += "|";
                break;
            case 2:
                barra += "-";
                break;
            case 3:
                barra += "\\";
                break;
            default:
                break;
        }
        
        
        for (int i = 0; i < caracteresVacios; i++) {
            barra += " ";
        }
        
        barra += "] ";

        barra += porcentaje + "%";

        System.out.println(barra+"\r");
    }
    public static void limpiarConsola() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    
    public void CFL08(String nombre, String apellido){
        String nombreCompleto = nombre +" "+apellido;
        mostrarCarga(nombreCompleto);
    }
    public void mostrarCarga(String texto) {
        int longitudTexto = texto.length();
        int progreso = 0;

        for (int i = 0; i <= longitudTexto; i++) {
            progreso = i * 100 / longitudTexto;

            String barra = "[";

            for (int j = 0; j < i; j++) {
                barra += texto.charAt(j);
            }

            for (int j = i; j < longitudTexto; j++) {
                barra += " ";
            }

            barra += "] " + progreso + "%";

            System.out.print("\r" + barra);

        
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }
}
        

