/**
 * Poli Retos
 * Clase CuasapazJonathan
 * @version 1.0
 * @autor Jonathan Cuasapaz
 */
public class CuasapazJonathan {
    private int cjTamano;

    /**
     * Obtiene el tamano para una figura
     * @return tamano
     */
    public int getCjTamano() {
        return cjTamano;
    }

    /**
     * Establece el tamano para una figura
     * @param cjTamano: Valor del tamano de la figura
     */
    public void setCjTamano(int cjTamano) {
        this.cjTamano = cjTamano;
    }

    /**
     * Imprime la figura F1: 
     * Un cuadrado de caracteres "*" 
     */
    public void cjF1(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) {
            for (int j = 0; j < cjTamano; j++) {
                if(i == 0 || i == cjTamano -1 || j == 0 || j == cjTamano - 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F2: 
     * Un cuadrado de caracteres "*" y "+" alternados entre si
     */
    public void cjF2(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) {
            for (int j = 0; j < cjTamano; j++) {
                if(i == 0 || i == cjTamano -1 || j == 0 || j == cjTamano - 1) {
                    if((i + j) % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("+ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F3: 
     * Un triangulo rectangulo isosceles apegado a la izquierda de caracteres "*"
     */
    public void cjF3(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F4: 
     * Un triangulo rectangulo isosceles apegado a la derecha de caracteres "*"
     */
    public void cjF4(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) { 
            for (int j = 0; j < cjTamano - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F5: 
     * Una piramide invertida de caracteres "*"
     */
    public void cjF5(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (cjTamano - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F6: 
     * Una piramide de caracteres "*"
     */
    public void cjF6(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) {
            for (int j = 0; j < cjTamano - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la figura F7: 
     * Una serie de escalones apegada a la izquierda con caracteres "_" y "|"
     */
    public void cjF7(){
        System.out.println();
        for (int i = 0; i < cjTamano; i++) { 
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            if (i == 0) {
                System.out.println("___");
            } else {
                System.out.println("|___");
            }
        }
        System.out.println();
    }
}
