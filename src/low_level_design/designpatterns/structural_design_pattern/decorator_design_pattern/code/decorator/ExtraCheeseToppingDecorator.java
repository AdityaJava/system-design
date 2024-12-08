package low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.decorator;

import low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.base.BasePizza;

public class ExtraCheeseToppingDecorator extends ToppingDecorator {
    private final BasePizza basePizza;

    public ExtraCheeseToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
