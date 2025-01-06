package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.arithmeticproblem;

public class Main {

    //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */

    public static void main(String[] args) {
        Expression expression = new Expression();

        //2*()
        expression.setLeftExpression(new Number(2));
        expression.setOperation(Operation.MULTIPLY);

        //1+7
        Expression expression2 = new Expression();
        expression2.setLeftExpression(new Number(1));
        expression2.setOperation(Operation.ADD);
        expression2.setRightExpression(new Number(7));

        //2*(1+7)
        expression.setRightExpression(expression2);
        System.out.println(expression.evaluate());
    }
}
