import java.util.Scanner;


// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
       double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner cr = new Scanner (System.in);
        boolean salir = false;
        int opcion;
        double suma = 0;
        double multiplicacion = 1;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros [i];
        }
        for (int i = 0; i < numeros.length; i++) {
            multiplicacion = multiplicacion * numeros[i];
        }
        while (!salir){
            System.out.println("1.- Realizar suma de los numeros del arreglo");
            System.out.println("2.- Realizar multiplicacion de los numeros del arreglo");
            System.out.println("3.- Salir del menu");
            
            System.out.println("Escribe una de las alternativa");
            opcion = cr.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("El resultado de la suma es: "+ suma);
                    
                    break;
                    
                case 2:
                    System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
                    
                    break;
                    
                case 3:
                    
                    salir = true;
                    System.out.println("Salio del menu");
                    break;
                    
                default:
                    System.out.println("Seleccione una alternativa entre el 1 y 3");
    }
    
}
}}
    }
}