public class CreditCardNumberValidation {


    public int sumOfDoubleEvenPlace(long creditCardNumber) {

        int  sumOfDoubleEvenPlace = 0;

       String creditCardnNumberToString = Long.toString(creditCardNumber);

       for(int i =(creditCardnNumberToString.length() - 2); i >= 0; i -= 2) {

           int doubleNumber = (Integer.parseInt(Character.toString(creditCardnNumberToString.charAt(i))) * 2);

           if(doubleNumber > 9) {

               int nubmer1 = doubleNumber / 10;
               int number2 = doubleNumber % 10;
               doubleNumber = nubmer1 + number2;
           }

           sumOfDoubleEvenPlace += doubleNumber;

       }

        return sumOfDoubleEvenPlace;
    }
}
