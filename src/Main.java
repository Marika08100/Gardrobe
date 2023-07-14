import Clothes.Clothes;
import Clothes.TShirt;
import Clothes.Clothes;
import Clothes.Coats;
import Clothes.Pants;
import Clothes.Shirt;
import Clothes.Shoes;
import Clothes.So
import Types.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            System.out.println("nem talalhato a file");
        } finally {
            System.out.println("a fajl beolvasas befejezodott");
        }
        for (String line : lines) {
            String[] parts = line.split(",");
            String type = parts[1];
            Gender gender = Gender.valueOf(parts[1]);
            Condition condition = Condition.valueOf(parts[2]);

            switch (type){
                case "póló" :
                    wardrobe.addClothes(new TShirt(gender,condition,parts[3],Boolean.parseBoolean(parts[4])));
                    break;
                case "ing" :
                    wardrobe.addClothes(new Shirt(type,gender,condition, ShirtLength.valueOf(parts[3])));
                    break;
                case "nadrág" :
                    wardrobe.addClothes(new Pants(type,gender,condition, PantsLength.valueOf(parts[3])));
                case "kabát" :
                    wardrobe.addClothes(new Coats(type,gender,condition, CoatType.valueOf(parts[3])));
                case "cipő" :
                    wardrobe.addClothes(new Shoes(type,gender,condition,Integer.parseInt(parts[3])));
                case "zokni" :
                    wardrobe.addClothes(new Sock);
            }
        }


    }
}