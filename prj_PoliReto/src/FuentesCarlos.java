fuentes carlos


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
}