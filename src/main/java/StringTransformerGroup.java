import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformerList = new ArrayList<>();
    public StringTransformerGroup(List<StringTransformer> transformerList){
        this.transformerList = transformerList;
    }
    public void execute(StringDrink drink) {
        for(StringTransformer it:transformerList){
            it.execute(drink);
        }
    }
}
