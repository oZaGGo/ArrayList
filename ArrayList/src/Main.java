import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elige ejercicio:");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Ejercicio Complejo");
            System.out.println("2. Ejercicio Simple");
            System.out.println("3. Salir");
            int option = scanner.nextInt();
            if (option == 3) break;
            switch(option){
                case 1:
                    EjercicioComplejo.main();
                    break;
                case 2:
                    EjercicioSimple.main();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
