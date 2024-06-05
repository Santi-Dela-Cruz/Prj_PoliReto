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
}
