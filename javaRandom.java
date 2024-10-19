import java.util.Random;

public class Repg{

    private static final String DOMAIN = "@example.com";
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    private static final int PASSWORD_LENGTH = 12; // You can adjust the length
    private static final int EMAIL_NAME_LENGTH = 8; // Length of random email name

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String email = generateRandomEmail();
            String password = generateRandomPassword();
            System.out.println("User " + (i + 1) + ":");
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
            System.out.println();
        }
    }

    private static String generateRandomEmail() {
        Random random = new Random();
        StringBuilder emailName = new StringBuilder(EMAIL_NAME_LENGTH);
        for (int i = 0; i < EMAIL_NAME_LENGTH; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); 
            emailName.append(randomChar);
        }
        return emailName + DOMAIN;
    }

    private static String generateRandomPassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
    }
}
