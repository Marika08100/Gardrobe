import java.util.ArrayList;
import java.util.List;

public class Gardrobe {
    List<Clothes> clothes = new ArrayList<>();
    public Gardrobe(Clothes clothes){
        this.clothes = new ArrayList<>();
    }
    public void addClothes(Clothes clothes){
        this.clothes.add(clothes);
    }
    // Szortírozd a ruháimat a fajtájuk szerint!
    // Azaz gondoskodj arról, hogy a pólók, az ingek, a nadrágok stb. külön-külön legyenek.
}
