public class CreditCardNumberValidation {


    public int sumOfDoubleEvenPlace(long creditCardNumber) {

        int sumOfDoubleEvenPlace = 0;

        String creditCardnNumberToString = Long.toString(creditCardNumber);

        for (int i = (creditCardnNumberToString.length() - 2); i >= 0; i -= 2) {

            int doubleNumber = (Integer.parseInt(Character.toString(creditCardnNumberToString.charAt(i))) * 2);

            if (doubleNumber > 9) {

                int nubmer1 = doubleNumber / 10;
                int number2 = doubleNumber % 10;
                doubleNumber = nubmer1 + number2;
            }

            sumOfDoubleEvenPlace += doubleNumber;

        }

        return sumOfDoubleEvenPlace;
    }

    public int sumOfOddPlace(long creditCardNumber) {

        int sumOfOddPlace = 0;

        String creditCardnNumberToString = Long.toString(creditCardNumber);

        for (int i = (creditCardnNumberToString.length() - 1); i >= 0; i -= 2) {

            int number = Integer.parseInt(Character.toString(creditCardnNumberToString.charAt(i)));

            sumOfOddPlace += number;

        }
        return sumOfOddPlace;
    }

    public boolean prefixMatchedTest(long creditCardNumber, int prefix) {

        String creditCardnNumberToString = Long.toString(creditCardNumber);

        String prefixToString = Integer.toString(prefix);

        if(creditCardnNumberToString.startsWith(prefixToString)) {

            return true;

        }
        return false;
    }
}
