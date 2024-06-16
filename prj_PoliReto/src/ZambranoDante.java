import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * Esta clase contiene varias funciones que imprimen figuras
 * @author Dante Zambrano
 * @version 1.0
 */
public class ZambranoDante {
    /**
     * Esta funcion imprime una escalera de abajo arriba
     * @param zdTamano numero de escalones que se imprimiran
     * @return void
     */
    public void zdF8(int zdTamano){
        
        for (int i = zdTamano; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
                System.out.print("___|");

            for (int j = 0; j < zdTamano - i; j++) {
                System.out.print("   ");
            }
                System.out.println();
        }
    }
    /**
     * Esta funcion imprime una escalera de doble sentido
     * @param zdTamano numero de escalones que se imprimiran
     * @return void
     */
    public void zdF9(int zdTamano){
        for (int i = zdTamano; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
                System.out.print("___|");

            for (int j = 0; j < zdTamano - i; j++) {
                System.out.print("        ");
            }
                System.out.print("|___");
                System.out.println();
        }
    
    }
    /**
     * Esta funcion nos retorna una escalera con signos positivos y negativos
     * @param zdTamano numero de escalones que se imprimiran
     * @return void
     */
    public void zdF10(int zdTamano){
        
        for(int i=0;i<zdTamano;i++){
            for(int j=0;j<=i;j++){
                System.out.print("    ");
            }
            if (i%2==0) {
                System.out.print("|_+_");
            }else
                System.out.print("|_-_");
                System.out.println();
        }
    }
    /**
     * Esta funcion nos retorna una escalera con escalones crecienes
     * |_
     *   |__
     *      |___
     * @param zdTamano numero de escalones que se imprimiran
     * @return void
     */
    public void zdF11(int zdTamano){
        zdTamano=zdTamano+1;
        for (int x = 2; x <= zdTamano; x++) {
            for (int i = 0; i < zdTamano - x; i++) {
                System.out.print(" ");
            }
                System.out.print("|");

            for (int j = 1; j < x; j++) {
                System.out.print("_");
            }
                System.out.println();

            for (int k = 1; k < x; k++) {
                System.out.print("  "); 
            }
        }
                System.out.println(); 
        
    }
    /**
     * Esta funcion imprime una piramide numerica decreciente desde 1 a 9 
     * @param zdTamano numero de filas que van a ser impresas
     * @return void
     */
    public void zdF12(int zdTamano){
        if (zdTamano>9) {
            zdTamano=9;
        }
        int zdMaximo = 10;
        for(int i=zdTamano;i>0;i--){
            for(int j=1;j<zdMaximo;j++){
                System.out.print(j);
        }
        zdMaximo--;
                System.out.println();
       }
    }
    /**
     * Esta funcion imprime una piramide numerica ascendente desde 1 a 9
     * @param zdTamano numero de filas que van a ser impresas
     * @return void 
     */
    public void zdF13(int zdTamano){
        if (zdTamano>9) {
            zdTamano=9;
        }
        int zdMaximo = 1;

        for(int i=zdTamano;i>0;i--){
            for(int j=1;j<=zdMaximo;j++){
                System.out.print(j);
            
        }
        zdMaximo++;
                System.out.println();
       }
    }
    /**
     * Esta funcion imprime la piramide de pascal en forma de triangulo 
     * @param zdTamano numero de filas que se van a imprimir
     * @return void
     */
    public void zdF14(int zdTamano){
        for (int i = 0; i < zdTamano; i++) {
            
            for (int j = 0; j < zdTamano - i - 1; j++) {
                System.out.print(" ");
            }
    
            int cont = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(cont + " ");
                cont = cont * (i - j) / (j + 1);
            }

            cont = 1;
            for (int j = i; j > 0; j--) {
                cont = cont * j / (i - j + 1);
                System.out.print(cont + " ");
            }
    
                System.out.println();
        }
    
    }

    public void zdL11(){
        
        int nivel = 0;
        do {
            
            Random rand = new Random();
            int cont = rand.nextInt(11); 
            
           
                for (int i = 0; i < cont; i++) {
                    System.out.print("-");
                }
                System.out.print("   ");
                for (int i = 0; i < cont; i++) {
                    System.out.print("-");
                }
                System.out.println();
            
            nivel ++;
        } while (nivel<50);
    }

    String mapa = "..".repeat(40);
    public void zdL12(){
        Boolean posiBossIzq = true;
       
        
        if(posiBossIzq) {
            for (int i = 0; i < mapa.length(); i++) 
                setBoss(i);
            for (int i = mapa.length(); i >= 0; i--) 
                setBoss(i);
        } 
    }
    
    public void setBoss(int posicionBoss) {
        String cabello = "   \\|||/";
        String ojos ="   (> <)" ;      
        String boca ="ooO-(_)-Ooo";
        String movimientoCabello     = "\r"
                                    + ".".repeat(posicionBoss) 
                                    + cabello
                                    + ".".repeat(mapa.length()-posicionBoss);
        String movimientoOjos     = "\r"
                                    + ".".repeat(posicionBoss) 
                                    + ojos
                                    + ".".repeat(mapa.length()-posicionBoss);
        String movimientoBoca     = "\r"
                                    + ".".repeat(posicionBoss) 
                                    + boca
                                    + ".".repeat(mapa.length()-posicionBoss);
        
        System.out.print("\033[H\033[2J"); 
        System.out.print( "\r" +movimientoCabello + "\n" + movimientoOjos + "\n" + movimientoBoca + "\n");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
    }

    public void zdC08(String frase){
        if (frase.length() >= 1) {
            StringBuilder fraseModificada = new StringBuilder();
            boolean mayuscula = true;
    
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (Character.isLetter(c)) {
                    if (mayuscula) {
                        fraseModificada.append(Character.toUpperCase(c));
                    } else {
                        fraseModificada.append(Character.toLowerCase(c));
                    }
                    mayuscula = !mayuscula; 
                } else {
                    fraseModificada.append(c); 
                }
            }
    
            System.out.println(fraseModificada.toString() + ".");
        } else {
            System.out.println("La frase debe tener al menos 1 letra.");
        }
    }

    public void zdC09(String[] args) {
        Set<String> palabras = new HashSet<>(Arrays.asList("delira", "lidera", "Ballena", "llenaba", "Alondra", "Ladrona", "España", "apañes", "Enrique", "quieren"));
        Scanner scanner = new Scanner(System.in);

        for (String palabra : palabras) {
            System.out.println("Ingresa un anagrama de la palabra: " + palabra);
            Set<String> anagramas = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                String entrada = scanner.nextLine();
                if (zdAnagrama(palabra, entrada)) {
                    System.out.println("Muy bien!!!");
                    anagramas.add(entrada);
                    break;
                } else {
                    System.out.println("Incorrecto. Inténtalo de nuevo.");
                }
            }
            if (anagramas.isEmpty()) {
                System.out.println("Respuesta: " + anagramas);
            }
        }
    }

    private  boolean zdAnagrama(String palabra, String entrada) {
        char[] palabraArray = palabra.toCharArray();
        char[] entradaArray = entrada.toCharArray();
        Arrays.sort(palabraArray);
        Arrays.sort(entradaArray);
        return Arrays.equals(palabraArray, entradaArray);
    }



}
