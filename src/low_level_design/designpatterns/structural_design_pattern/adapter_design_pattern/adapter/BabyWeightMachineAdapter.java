package low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.adapter;

import low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.adaptee.WeightMachine;

public class BabyWeightMachineAdapter implements WeightMachineAdapterInt {
    WeightMachine weightMachine;

    public BabyWeightMachineAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        return 0.453592 * weightMachine.getWeightInPounds();
    }
}
