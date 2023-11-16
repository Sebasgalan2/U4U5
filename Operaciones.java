

// The main method must be in a class named "Main".
class Main {
    public static void suma(int a, int b) {
         return a + b;

    }

    public static int resta(int a, int b) {

        return a - b;

    }

    public static int multiplicacion(int a, int b) {

        return a * b;

    }

    public static int division(int a, int b) {

        return a / b;

    }

    public static void main(String[] args) {
        int resultado = Operaciones.suma(9, 6);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("*************************************");
        int segundo = Operaciones.resta(7, 5);
        System.out.println("El resultado de la resta es: " + segundo);
        System.out.println("*************************************");
        int tercero = Operaciones.multiplicacion(8, 16);
        System.out.println("El resultado de la multiplicacion es: " + tercero);
        System.out.println("*************************************");
        int cuarto = Operaciones.division(24, 2);
        System.out.println("El resultado de la division es: " + cuarto);

    }
}
    }
}