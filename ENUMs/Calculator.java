package ENUMs;

public class Calculator {

    public static void main(String[] args) {

        Operation operation = Operation.sum;

        double result = operation.calculate(32,43);

        System.out.println(result);
        System.out.println(operation.getOperationSymbol());

        ////////////////////////////////////////////////////////////////////

        Operation operation2 = Operation.mul;

        double result2 = operation2.calculate(150,5);

        System.out.println(result2);
        System.out.println(operation2.getOperationSymbol());

    }

}
