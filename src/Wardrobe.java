import Clothes.Clothes;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Clothes> clothes = new ArrayList<>();

    public Wardrobe() {
    }

    public void addClothes(Clothes clothes) {
        this.clothes.add(clothes);
    }

    // Szortírozd a ruháimat a fajtájuk szerint!
    // Azaz gondoskodj arról, hogy a pólók, az ingek, a nadrágok stb. külön-külön legyenek.
    public void sortClothesByType() {
        List<Clothes> tShirts = new ArrayList<>();
        List<Clothes> shirts = new ArrayList<>();
        List<Clothes> pants = new ArrayList<>();
        List<Clothes> coats = new ArrayList<>();
        List<Clothes> shoes = new ArrayList<>();
        List<Clothes> socks = new ArrayList<>();

        for (Clothes clothes : clothes) {
            switch (clothes.getType()) {
                case "póló":
                    tShirts.add(clothes);
                    break;
                case "ing":
                    shirts.add(clothes);
                    break;
                case "nadrág":
                    pants.add(clothes);
                    break;
                case "kabát":
                    coats.add(clothes);
                    break;
                case "cipő":
                    shoes.add(clothes);
                    break;
                case "zokni":
                    socks.add(clothes);
                    break;
                default:
                    System.out.println("This clothes is not in my wardrobe");
            }
        }

        System.out.println("T-Shirts:");
        for (Clothes clothing : tShirts) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();

        System.out.println("Shirts:");
        for (Clothes clothing : shirts) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();

        System.out.println("Pants:");
        for (Clothes clothing : pants) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();

        System.out.println("Coats:");
        for (Clothes clothing : coats) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();

        System.out.println("Shoes:");
        for (Clothes clothing : shoes) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();

        System.out.println("Socks:");
        for (Clothes clothing : socks) {
            System.out.println(clothing.getGender() + " - " + clothing.getCondition());
        }
        System.out.println();
    }

    // Segíts nekem a ruhák selejtezésében a következőképpen:
    // A ruhákat az állapotuk szerint selejtezem…
    // a 4-es és az 5-ös állapotú ruhákat megtartom,
    // a 2-es és a 3-es állapotú ruhákat eladományozom,
    // az 1-es ruhákat kidobom.
    public void discardClothes() {
        int originalCount = clothes.size();
        int discardedCount = 0;
        int donatedCount = 0;
        List<Clothes> validClothes = new ArrayList<>();

        for (Clothes clothing : clothes) {
            int condition = clothing.getCondition();

            if (condition >= 4) {
                validClothes.add(clothing);
            } else if (condition>= 2) {
                donatedCount++;
            } else if (condition == 1) {
                discardedCount++;
            }
        }

        clothes = validClothes;

        System.out.println("Ennyi ruhám volt: " + originalCount);
        System.out.println("Ennyit kidobtam:  " + discardedCount);
        System.out.println("Ennyit eladományoztam: " + donatedCount);
    }
}
