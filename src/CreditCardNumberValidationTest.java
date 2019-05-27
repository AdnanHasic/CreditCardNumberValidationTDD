import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditCardNumberValidationTest {

    CreditCardNumberValidation card1;
    long creditCardNumber;

    @BeforeEach
    void setUp() {


        card1 = new CreditCardNumberValidation();
        creditCardNumber = 512345678901234L;

    }

    @Test
    public void isValidTest_ShouldReturnTrue_IfCreditCardNumberIsValid() {


    }

    @Test
    public void sumOfDoubleEvenPlaceTest_ShouldReturnSumOfDoubleEvenPlace_IfGivenCreditCardNumber() {

        int result = card1.sumOfDoubleEvenPlace(creditCardNumber);

        int expected = 31;

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void sumOfOddPlaceTest_ShouldReturnSumOfOddPlace_IfGivenCreditCardNumber() {

        int result = card1.sumOfOddPlace(creditCardNumber);

        int expected = 31;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void prefixMatchedTest_ShouldReturnTrue_IfGivenNumberPrefixForCreditCardNumber(){

        boolean expected = card1.prefixMatchedTest(creditCardNumber, 5);

        Assertions.assertTrue(expected);
    }

    @Test
    public void getSizeTest_ShouldReturnNumberOfDigitsInCreditCardNumber_IfGivenCreditCardNumber(){

        int result = card1.getSize(creditCardNumber);

        int expected = 15;
    }

}