import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/import.txt");
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("nem talalhato a file");
        } finally {
            System.out.println("a fajl beolvasas befejezodott");
        }


    }
}