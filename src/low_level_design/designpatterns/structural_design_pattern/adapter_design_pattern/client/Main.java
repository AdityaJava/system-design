package low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.client;

import low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.adaptee.WeightMachineForBabies;
import low_level_design.designpatterns.structural_design_pattern.adapter_design_pattern.adapter.BabyWeightMachineAdapter;

public class Main {
    public static void main(String[] args) {
        BabyWeightMachineAdapter babyWeightMachineAdapter = new BabyWeightMachineAdapter(new WeightMachineForBabies(28));
        System.out.println(babyWeightMachineAdapter.getWeightInKg());
    }
}
