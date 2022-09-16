package Operaciones;

public class Aritmetica {
    int a;
    int b;

    //Constructor vacio

    public Aritmetica(){
        System.out.println("Ejecutando el metodo constructor");
    }

    public  Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("Sobre Carga de Constructores");
    }

    public void sumar() {
       int resultado = a + b;
        System.out.println("El valor del resultado de la suma es: "+resultado);

    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; //El Argumento A arg1 se agisna al atributo de la clase O objeto "a" osea a this.a HACIENDO referencia al objeto que se esta ejecutando en ese momento
        this.b = arg2;

        return this.sumarConRetorno();
    }

}
