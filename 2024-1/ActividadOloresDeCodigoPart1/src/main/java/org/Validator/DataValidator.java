package org.Validator;

public class DataValidator {
    public static void main(String[] args) {
// Ejemplo de cómo llamar a la función de validación
        System.out.println(validateEmail("example@example.com"));
        System.out.println(validatePhoneNumber("+123-4567-8901"));
        System.out.println(validatePostalCode("12345"));
        System.out.println(validateURL("http://example.com"));
    }
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    public static boolean validatePhoneNumber(String phone) {
        String phoneRegex = "^\\+?\\d{1,3}?[- .]?\\d{1,5}?[- .]?\\d{4,10}$";
        return phone.matches(phoneRegex);
    }
    public static boolean validatePostalCode(String postalCode) {
        String postalCodeRegex = "^\\d{5}$"; // Simple US ZIP code pattern
        return postalCode.matches(postalCodeRegex);
    }
    public static boolean validateURL(String url) {
        String urlRegex = "^(https?://)?(www\\.)?[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\/.*)?$";
        return url.matches(urlRegex);
    }
}
