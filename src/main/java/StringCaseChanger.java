public class StringCaseChanger implements StringTransformer {
    String string = "";
    char ch;
    public void execute(StringDrink drink){
        String newDrink = invertCase(drink.getText());
        drink.setText(newDrink);
    }
    public static String invertCase(String str)
    {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            chars[i] = Character.isUpperCase(chars[i])
                    ? Character.toLowerCase(chars[i])
                    : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }

}

