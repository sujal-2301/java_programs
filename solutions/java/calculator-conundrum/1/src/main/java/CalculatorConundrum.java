class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        if(operand2 == 0){
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException() );
        }

        switch (operation) {
            case "+":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);
            case "*":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);
            case "/":
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        } 
    }
}