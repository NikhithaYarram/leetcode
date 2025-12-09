import java.util.Scanner;

public class HouseOrientation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();
        scanner.close();

        String orientation = getHouseOrientation(houseNumber);
        System.out.println("House " + houseNumber + " is \"" + orientation + "\".");
    }

    public static String getHouseOrientation(int houseNumber) {
        if (houseNumber == 1) {
            return "independent";
        }

        int positionInBlock = (houseNumber - 1) % 16 + 1;

        if (positionInBlock == 1) {
            return "independent";
        } else if (positionInBlock >= 2 && positionInBlock <= 4) {
            return "facing each other";
        } else if (positionInBlock >= 5 && positionInBlock <= 8) {
            return "face away";
        } else if (positionInBlock >= 9 && positionInBlock <= 12) {
            return "face each other";
        } else if (positionInBlock >= 13 && positionInBlock <= 16) {
            return "face away";
        } else {
            return "independent";
        }
    }
}
