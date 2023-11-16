import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Piramides");
        System.out.println("Opcion 1: Piramide de asteriscos");
        System.out.println("Opcion 2: Piramide de letras y numeros");
        System.out.println("Salir de menu");
        System.out.println("Eliga alguna de las alternativas");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Introduzca numero de filas");
                int filas = sc.nextInt();

                for (int altura = 1; altura <= filas; altura++) {
                    // espacios blancos
                    for (int blancos = 1; blancos <= filas - altura; blancos++) {
                        System.out.print("");
                    }
                    //Asteriscos
                    for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Introduzca numero de filas");
                filas = sc.nextInt();
                int valor = 1;
                for (int i = 1; i <= filas; i++) {
                    // Imprimir los terminos según el patrón
                    for (int j = 1; j <= i; j++) {
                        if (i % 2 == 1) {
                            // Imprimir los números si el nivel es impar
                            System.out.print(valor + " ");
                            valor++;
                        } else {
                            // Imprimir las letras si el nivel es par
                            System.out.print((char) ('A' + j - 1));
                        }
                    }

                    // Ir a la siguiente línea después de cada nivel
                    System.out.println();
                }
                break;
        }

    }

}
    }
}