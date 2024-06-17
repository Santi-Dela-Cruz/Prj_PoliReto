/**
 * Poli Retos
 * Clase CuasapazJonathan
 * @version 1.0
 * @autor Jonathan Cuasapaz
 */
public class CuasapazJonathan {
    private int cjTamano;
    private String cjNombre;

    /**
     * Constructor de la clase CuasapazJonathan
     * Establece el nombre
     */
    public CuasapazJonathan(){
        cjNombre = "jonathan";
    }

    /**
     * Obtiene el nombre 
     * @return Nombre
     */
    public String cjGetNombre() {
        return cjNombre;
    }

    /**
     * Obtiene el tamano para una figura
     * @return Tamano
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
     * Metodo que imprime la figura F1: 
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
     * Metodo que imprime la figura F2: 
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
     * Metodo que imprime la figura F3: 
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
     * Metodo que imprime la figura F4: 
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
     * Metodo que imprime la figura F5: 
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
     * Metodo que imprime la figura F6: 
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
     * Metodo que imprime la figura F7: 
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

    /**
     * Metodo que recibe una frase, la invierte y convierte las vocales en mayúsculas
     * @param cjFrase  Frase a modificar
     */
    public void cjC05(String cjFrase) {
        String cjFraseInvertida = "";
        String cjresultado = "";

        for (int i = cjFrase.length() - 1; i >= 0; i--) {
            cjFraseInvertida += cjFrase.charAt(i);
        }

        for (int i = 0; i < cjFraseInvertida.length(); i++) {
            char c = cjFraseInvertida.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                cjresultado += Character.toUpperCase(c);
            else 
                cjresultado += c;
        }
        System.out.println("Frase invertida con vocales mayusculas: " + cjresultado);
        System.out.println();
    }

    /**
     * Metodo que grafica la función f(x) = 2x usando caracteres de un nombre
     * en un plano de coordenadas positivo
     * @param cjNombre Nombre a usar en la gráfica de la funcion
     */
    public void cjA03() {
        int cjRango = cjNombre.length();
        System.out.println();

        for (int cjEjeY = cjRango; cjEjeY > 0; cjEjeY--) {
            System.out.printf(cjEjeY + " |");

            for (int cjEjeX = 0; cjEjeX < cjRango; cjEjeX++) {
                if (cjEjeY - 1 == cjEjeX)
                    System.out.print(" " + cjNombre.charAt(cjEjeX));
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.print("0 |");
        for (int cjEjeX = 0; cjEjeX < cjRango; cjEjeX++)
            System.out.print("__");
        System.out.println();

        System.out.println();
    }
    
    /**
     * Metodo que dibuja una barra de carga de 20 caracteres
     * La barra avanza cambiando la punta entre '>' y '-'
     * @param cjLongitud Longitud de la barra de carga
     * @param cjDuracion Duracion de la carga en milisegundos
     */
    public void cjL05(int cjLongitud, int cjDuracion) throws InterruptedException {
        int cjIntervalo = cjDuracion / cjLongitud;

        for (int i = 0; i <= cjLongitud; i++) {
            StringBuilder cjBarra = new StringBuilder("[");
        
            for (int j = 0; j < cjLongitud; j++) {
                if (j < i)
                    cjBarra.append("=");
                else if (j == i) {
                    if (i % 2 == 0)
                        cjBarra.append(">");
                    else
                        cjBarra.append("-");
                } else
                    cjBarra.append(" ");
            }
            cjBarra.append("]");

            int cjPorcentaje = (i * 100) / cjLongitud;
            System.out.print("\r" + cjBarra.toString() + " " + cjPorcentaje + "%");

            Thread.sleep(cjIntervalo);
        }
        System.out.println();
    }

    /**
     * Metodo que dibuja una barra de carga de 20 caracteres
     * la barra <=> se desplaza de izquierda a derecha
     */
    public void cjL06() throws InterruptedException {
        int cjLongBarra = 20;
        int cjLongSimbolo = 3;
        
        for (int cjPorcentaje = 0; cjPorcentaje <= 100; cjPorcentaje += 5) {
            int cjPosicion = (cjPorcentaje * (cjLongBarra - cjLongSimbolo)) / 100;
            StringBuilder cjBarra = new StringBuilder("[");

            for (int i = 0; i < cjPosicion; i++) {
                cjBarra.append(" ");
            }
            cjBarra.append("<=>");

            for (int i = cjPosicion + cjLongSimbolo; i < cjLongBarra; i++) {
                cjBarra.append(" ");
            }
            cjBarra.append("]");
            
            System.out.print("\r" + cjBarra.toString() + " " + cjPorcentaje + "%");
            System.out.flush();
            Thread.sleep(300);
        }
        System.out.println();
    }
}
