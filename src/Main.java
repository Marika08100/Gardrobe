import Clothes.*;
import Types.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Types.Condition;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        File file = new File("res/clothes.txt");
        List<String> lines = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nem található a fájl");
        } finally {
            System.out.println("A fájl beolvasás befejeződött");
        }

        for (String line : lines) {
            String[] parts = line.split(",");
            String type = parts[0];
            Gender gender = Gender.valueOf(parts[1].toUpperCase());
            Condition condition = Condition.valueOf(parts[2].toUpperCase());

            switch (type) {
                case "póló" -> wardrobe.addClothes(new TShirt(gender, condition, parts[3], Boolean.parseBoolean(parts[4].toUpperCase())));
                case "ing" -> wardrobe.addClothes(new Shirt(gender, condition, ShirtLength.valueOf(parts[3].toUpperCase())));
                case "nadrág" -> wardrobe.addClothes(new Pants(gender, condition, PantsLength.valueOf(parts[3].toUpperCase())));
                case "kabát" -> wardrobe.addClothes(new Coats(gender, condition, CoatType.valueOf(parts[3].toUpperCase())));
                case "cipő" -> wardrobe.addClothes(new Shoes(gender, condition, Integer.parseInt(parts[3])));
                case "zokni" -> wardrobe.addClothes(new Sock(gender, condition, SocksType.valueOf(parts[3].toUpperCase())));
                default -> System.out.println("Érvénytelen ruha típus: " + type);
            }
        }

        wardrobe.discardClothes();
        wardrobe.sortClothesByType();
    }
}
