package EstructurasDeControl;

public class EstructurasDeControl {
    public static void main(String args[]){
        int numUno = 5, numDos = 3, resultado = 0;
        int parametro = 3;

        switch(parametro){
            case 1: resultado = numUno + numDos;
            System.out.println("El resultado de la suma es "+resultado);

            break;

            case 2: resultado = numUno - numDos;
            System.out.println("El resultado de la resta es "+resultado);

            break;

            case 3: resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicacion es "+resultado);

            break;

            case 4: resultado = numUno / numDos;
            System.out.println("El resultado de la division es "+resultado);

            break;

            default: System.out.println("Error, la opcion no existe");
            break;
        }
    }
}
