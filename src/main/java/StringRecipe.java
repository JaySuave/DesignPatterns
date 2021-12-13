import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    private List<StringTransformer> orders = new ArrayList<StringTransformer>();
    public StringRecipe(List<StringTransformer> orders){
        this.orders = orders;
    }
    public void mix(StringDrink drink){
        for(StringTransformer it:orders){
            it.execute(drink);
        }
    }
}
