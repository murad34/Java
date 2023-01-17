package ENUMs;

public enum Operation {

    sum('+'), sub('-'), mul('*'), div('/');

    private char c;

    Operation() {

    }

    Operation(char c) {
        this.c = c;
    }

    public double calculate(double a, double b) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        }

        return 000;
    }

    public char getOperationSymbol() {
        return this.c;
    }

}
