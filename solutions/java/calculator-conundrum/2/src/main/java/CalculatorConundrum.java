class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        
        String result = operand1 + " " + operation + " " + operand2 + " = ";

        illegalOperationsHandler(operand1, operand2, operation);
  
        if(operation.equals("+")){
            return result + (operand1 + operand2);
        }
        else if(operation.equals("*")){
            return result + (operand1 * operand2);
        }
        else if(operation.equals("/")){
            try{
            return result + (operand1 / operand2);}
            catch(ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            } 
        }return null;
}

    private void illegalOperationsHandler(int operand1, int operand2, String operation){
        if(operation == null){
             throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }else if(!operation.equals("+") && !operation.equals("*") && !operation.equals("/")){
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");}
        }   
}

