public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink){
        String newString = "";
        char ch;
        for(int i = 0;i<drink.getText().length();i++){
            ch = drink.getText().charAt(i);
            newString = ch + newString;
        }
        drink.setText(newString);
    }
}
