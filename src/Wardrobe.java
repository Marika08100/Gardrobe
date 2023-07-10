import Clothes.Clothes;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Clothes> clothes = new ArrayList<>();
    public Wardrobe(Clothes clothes){
        this.clothes = new ArrayList<>();
    }
    public void addClothes(Clothes clothes){
        this.clothes.add(clothes);
    }
    // Szortírozd a ruháimat a fajtájuk szerint!
    // Azaz gondoskodj arról, hogy a pólók, az ingek, a nadrágok stb. külön-külön legyenek.
    public void sortClothesByType(){
        List<Clothes> tShirts = new ArrayList<>();
        List<Clothes> shirts = new ArrayList<>();
        List<Clothes> pants = new ArrayList<>();
        List<Clothes> coats = new ArrayList<>();
        List<Clothes> shoes = new ArrayList<>();
        List<Clothes> socks = new ArrayList<>();

        for(Clothes clothes : clothes){
            switch (clothes.getType()){
                case "T-Shirt":
                    tShirts.add(clothes);
                case "Shirt":
                    shirts.add(clothes);
                case "Pants" :
                    pants.add(clothes);
                case "Coat":
                    coats.add(clothes);
                case "Shoes":
                    shoes.add(clothes);
                case "Sock":
                    socks.add(clothes);
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
}
