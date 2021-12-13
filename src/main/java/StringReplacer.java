public class StringReplacer implements StringTransformer {
    char a,b;
    public StringReplacer(char a, char b){
        this.a = a;
        this.b = b;
    }
    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(a,b));
    }
}
