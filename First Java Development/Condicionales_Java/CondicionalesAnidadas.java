package Condicionales_Java;

public class CondicionalesAnidadas {

    public static void main(String args[]){

       int num_uno = 8;
       int num_dos = 4;
       int resultado = 0;
       int operacion = 4;

       if(operacion == 1){
           resultado = num_uno + num_dos;
           System.out.println("El resultado de la suma es " + resultado);
       }else if(operacion == 2) {
        resultado = num_uno - num_dos;
        System.out.println("El resultado de la resta es " + resultado);
       }else if(operacion == 3){
        resultado = num_uno * num_dos;
        System.out.println("El resultado de la multiplicacion es " + resultado);
       }else if(operacion == 4) {
        resultado = num_uno / num_dos;
        System.out.println("El resultado de la divicion es " + resultado);
       }else {
           System.out.println("La operacion no existe");
       }
    }
}
