public class CreditCardNumberValidation {

    public CreditCardNumberValidation() {
    }

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

        String creditCardNumberToString = Long.toString(creditCardNumber);

        if (creditCardNumberToString.startsWith(Integer.toString(prefix))) {

            return true;

        }
        return false;
    }

    public int getSize(long creditCardNumber) {

        String creditCardnNumberToString = Long.toString(creditCardNumber);

        return creditCardnNumberToString.length();
    }

    public int getSumOfEvenAndOddPlace(int number1, int number2) {

        return number1 + number2;
    }

    public boolean sumIsDivisibleBy10(int sumOfEvenAndOddPlace) {

        if (sumOfEvenAndOddPlace % 10 == 0) {
            return true;
        }

        return false;
    }

    public boolean isValid(boolean prefixMatchedTest, boolean sumIsDivisibleBy10, int getSize) {

        if (prefixMatchedTest && sumIsDivisibleBy10 && (getSize < 17) && (getSize > 12)) {
            return true;
        }
            return false;

    }
}
