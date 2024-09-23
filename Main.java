public class Main {
    public static void main(String[] args) {
        int int0perandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum = 5.50;
        double doubleProduct = 7.50;
        double doubleDifference = 8.50;
        double doubleQuotient = 9.50;

        intSum = int0perandA + intOperandB;
        intProduct = int0perandA * intOperandB;
        intDifference = int0perandA - intOperandB;
        intQuotient = int0perandA / intOperandB;
        intModulo = int0perandA % intOperandB;

        System.out.println("The Sum using ints of" + int0perandA + "" + intOperandB + "is" + intSum);
        System.out.println("The product using ints of" + int0perandA + "" + intOperandB + "is" + intProduct);
        System.out.println("The difference using ints of" + int0perandA + "" + intOperandB + "is" + intDifference);
        System.out.println("The quotient using ints of" + int0perandA + "" + intOperandB + "is" + intQuotient);
        System.out.println("The remainder using ints of" + int0perandA + "" + intOperandB + "is" + intModulo);

        doubleSum = int0perandA + intOperandB;
        doubleProduct = int0perandA * intOperandB;
        doubleDifference = int0perandA - intOperandB;
        doubleQuotient = int0perandA / intOperandB;

        System.out.println("The Sum using double of" + doubleOperandA + "" + doubleOperandB + "is" + doubleSum);
        System.out.println("The product using double of" + doubleOperandA + "" + doubleOperandB + "is" + doubleProduct);
        System.out.println("The difference using double of" + doubleOperandA + "" + doubleOperandB + "is" + doubleDifference);
        System.out.println("The quotient using double of" + doubleOperandA + "" + doubleOperandB + "is" + doubleQuotient)
    ;}
}

