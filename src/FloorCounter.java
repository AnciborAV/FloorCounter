import java.io.IOException;
import java.util.Scanner;

public class FloorCounter {

    public static int getMaxFloor(int apartmentNum) {
        var macLvl = apartmentNum / 4;
        if (apartmentNum % 4 > 0) {
            return macLvl + 1;
        } else {
            return macLvl;
        }
    }

    public static void main(String[] args) throws  IOException {
        System.out.println("Enter the number of floors: ");
        try (var scanner = new Scanner(System.in)){
            int apartmentNum = scanner.nextInt();
            System.out.println("Your room is on the " + getMaxFloor(apartmentNum) + " floor.");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
