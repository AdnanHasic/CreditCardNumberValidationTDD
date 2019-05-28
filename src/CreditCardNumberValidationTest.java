import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditCardNumberValidationTest {

    CreditCardNumberValidation card1;
        long creditCardNumber;

        @BeforeEach
        public  void setUp() {

            card1 = new CreditCardNumberValidation();
            creditCardNumber = 512345678901234L;

        }

        @Test
        public void isValidTest_ShouldReturnFalse_IfCreditCardNumberIsNotValid() {

            boolean result = card1.isValid(card1.prefixMatchedTest(creditCardNumber, 5),
                    card1.sumIsDivisibleBy10(card1.getSumOfEvenAndOddPlace(card1.sumOfDoubleEvenPlace(creditCardNumber),
                            card1.sumOfOddPlace(creditCardNumber))),
                    card1.getSize(creditCardNumber));

            Assertions.assertFalse(result);
        }

        @Test
        public void isValidTest_ShouldReturnTrue_IfCreditCardNumberIsValid() {

            boolean result = card1.isValid(card1.prefixMatchedTest(creditCardNumber, 5),
                    card1.sumIsDivisibleBy10(card1.getSumOfEvenAndOddPlace(card1.sumOfDoubleEvenPlace(4388576018410707L),
                            card1.sumOfOddPlace(4388576018410707L))),
                    card1.getSize(4388576018410707L));

           Assertions.assertTrue(result);


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
        public void prefixMatchedTest_ShouldReturnTrue_IfGivenNumberPrefixForCreditCardNumber() {

            boolean expected = card1.prefixMatchedTest(creditCardNumber, 5);

            Assertions.assertTrue(expected);
        }

        @Test
        public void prefixMatchedTest_ShouldReturnFalse_IfGivenNumberPrefixForCreditCardNumber() {

            boolean expected = card1.prefixMatchedTest(creditCardNumber, 9);
            Assertions.assertFalse(expected);
        }

        @Test
        public void getSizeTest_ShouldReturnNumberOfDigitsInCreditCardNumber_IfGivenCreditCardNumber() {

            int result = card1.getSize(creditCardNumber);
            int expected = 15;
        }

        @Test
        public void getSumOfEvenAndOddPlaceTest_ShoulReturnSumOfTheSumOfOddPlaceAndSumOfEvenPlace() {

            int result = card1.getSumOfEvenAndOddPlace(card1.sumOfOddPlace(creditCardNumber),
                    card1.sumOfDoubleEvenPlace(creditCardNumber));

            int expected = 62;

            Assertions.assertEquals(expected, result);
        }

        @Test
        public void sumIsDivisibleBy10Test_ShouldReturnFalse_IfGivenSumOfEvenAndOddPlace() {

            boolean result = card1.sumIsDivisibleBy10(card1.getSumOfEvenAndOddPlace(card1.sumOfOddPlace(creditCardNumber),
                    card1.sumOfDoubleEvenPlace(creditCardNumber)));
            Assertions.assertFalse(result);
        }

        @Test
        public void sumIsDivisibleBy10Test_ShouldReturnTrue_IfGivenSumOfEvenAndOddPlace() {

            boolean result = card1.sumIsDivisibleBy10(60);

            Assertions.assertTrue(result);

        }


    }
