
package projecto1;

public class Projecto1 {

    public static void main(String[] args) {
 
        /*
        Realizar un programa de intercambio de variables
        por ejemplo: si una variable numero vale 35, y una variable2 vale 20
        realizar las acciones necesarias para que numero pase a valer 20 y
        numero2 35. una vez realizado impirmir en pantalla
        */
        
        int numero, numero2, aux;
        
        numero = 35;
        numero2 = 20;
        aux = 20; //se usa siempre para poder resolver problemas
        
        numero2 = numero;
        numero = aux;
        
        System.out.println("el valor de numero es igual a " + numero + " " + 
                "y el valor de numero2 es igual a " + numero2);
        
        
    }
    
}
