import java.io.IOException;
import java.util.Scanner;

public class FloorCounter {

    public static int getMaxFloor(int apartmentNum) {
        var macLvl = apartmentNum / 3;
        if (apartmentNum % 3 > 0) {
            return macLvl + 1;
        } else {
            return macLvl;
        }
    }

    public static void main(String[] args) throws IOException {
        var fc = new FloorCounter();

        System.out.println("Enter the number of floors: ");
        try (var scanner = new Scanner(System.in)){
            int apartmentNum = scanner.nextInt();
            System.out.println("Your room is on the " + getMaxFloor(apartmentNum) + " floor.");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
