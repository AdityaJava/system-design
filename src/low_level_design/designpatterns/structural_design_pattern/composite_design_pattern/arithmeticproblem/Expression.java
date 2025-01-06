package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.arithmeticproblem;

public class Expression implements ArithmeticExpression {
    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    @Override
    public int evaluate() {
        int value = 0;
        switch (operation) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;

        }
        return value;
    }

    public ArithmeticExpression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(ArithmeticExpression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public ArithmeticExpression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(ArithmeticExpression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
