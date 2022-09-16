package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica1 a: "+ aritmetica1.a);
        System.out.println("Aritmetica1 b :"+aritmetica1.b);

        //Segundo constructor
        Aritmetica aritmetica2 = new Aritmetica(10, 20);
        System.out.println("Aritmetica2 a: "+aritmetica2.a);
        System.out.println("Aritmetica2 b: "+aritmetica2.b);

    }
}
