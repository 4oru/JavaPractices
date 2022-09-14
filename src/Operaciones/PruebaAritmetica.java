package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        var resultado = aritmetica1.sumarConRetorno();
        System.out.print("El valor de la suma es: "+resultado);

        resultado = aritmetica1.sumarConArgumentos(5,8);
        System.out.println("El valor de la suma con Argumentos es: "+resultado);
    }
}
