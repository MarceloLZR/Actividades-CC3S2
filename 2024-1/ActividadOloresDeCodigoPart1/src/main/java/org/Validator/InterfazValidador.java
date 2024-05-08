package org.Validator;

import java.util.Scanner;

public class InterfazValidador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Validador de Datos");
        System.out.println("Por favor, seleccione la opción que desea validar:");
        System.out.println("1. Email");
        System.out.println("2. Número de teléfono (en formato internacional)");
        System.out.println("3. Código postal");
        System.out.println("4. URL");
        System.out.println("0. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                validateEmail(scanner);
                break;
            case 2:
                validatePhoneNumber(scanner);
                break;
            case 3:
                validatePostalCode(scanner);
                break;
            case 4:
                validateURL(scanner);
                break;
            case 0:
                System.out.println("Gracias por usar el Validador de Datos. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
        }

        scanner.close();
    }

    private static void validateEmail(Scanner scanner) {
        System.out.println("Por favor, introduzca el email a validar:");
        String email = scanner.next();
        boolean isValid = DataValidator.validateEmail(email);
        System.out.println("El email ingresado " + (isValid ? "es válido." : "no es válido."));
    }

    private static void validatePhoneNumber(Scanner scanner) {
        System.out.println("Por favor, introduzca el número de teléfono a validar:");
        String phoneNumber = scanner.next();
        boolean isValid = DataValidator.validatePhoneNumber(phoneNumber);
        System.out.println("El número de teléfono ingresado " + (isValid ? "es válido." : "no es válido."));
    }

    private static void validatePostalCode(Scanner scanner) {
        System.out.println("Por favor, introduzca el código postal a validar:");
        String postalCode = scanner.next();
        boolean isValid = DataValidator.validatePostalCode(postalCode);
        System.out.println("El código postal ingresado " + (isValid ? "es válido." : "no es válido."));
    }

    private static void validateURL(Scanner scanner) {
        System.out.println("Por favor, introduzca la URL a validar:");
        String url = scanner.next();
        boolean isValid = DataValidator.validateURL(url);
        System.out.println("La URL ingresada " + (isValid ? "es válida." : "no es válida."));
    }
}
