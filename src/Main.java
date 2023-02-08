public class Main {
    public static void main(String[] args) {
        //Primera Parte
        suma(25, 35, 10);

        //Segunda Parte
        Coche miCoche = new Coche();
        miCoche.setPuertas();

        System.out.println("El número de Puertas es: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int res;
        res = a + b + c;
        System.out.println("La suma de los tres números es : " + res);
    }
}

class Coche {
    public int puertas = 5;

    public void setPuertas() {
        this.puertas++;
    }
}