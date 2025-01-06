package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.arithmeticproblem;

public class Number implements ArithmeticExpression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }
}
