package low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code;

import low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.base.BasePizza;
import low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.base.MargheritaPizza;
import low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.decorator.ExtraCheeseToppingDecorator;
import low_level_design.designpatterns.structural_design_pattern.decorator_design_pattern.code.decorator.MushroomToppingDecorator;

public class PizzaStore {
    public static void main(String[] args) {
        //Now I want extra cheese and margarita pizza

        BasePizza margheritaPizza = new MargheritaPizza();

        BasePizza cheeseToppings = new ExtraCheeseToppingDecorator(margheritaPizza);
        BasePizza mushrooms = new MushroomToppingDecorator(cheeseToppings);

        //System.out.println(cheeseToppings.cost());
        System.out.println(mushrooms.cost());

    }
}
