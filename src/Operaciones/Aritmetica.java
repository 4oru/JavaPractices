package Operaciones;

public class Aritmetica {
    int a;
    int b;

    public void sumar() {
       int resultado = a + b;
        System.out.println("El valor del resultado de la suma es: "+resultado);

    }

    public int sumarConRetorno() {
        return a + b;
    }

}
