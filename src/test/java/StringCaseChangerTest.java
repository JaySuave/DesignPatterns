import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCaseChangerTest{
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aB-cD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("Ab-Cd", drink.getText());
    }
}