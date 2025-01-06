package low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.adaptee;

public class WeightMachineForBabies implements WeightMachine {
    int weightInPounds;

    public WeightMachineForBabies(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public double getWeightInPounds() {
        return weightInPounds;
    }
}
