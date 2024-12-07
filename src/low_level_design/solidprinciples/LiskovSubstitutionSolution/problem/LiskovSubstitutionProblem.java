package low_level_design.solidprinciples.LiskovSubstitutionSolution.problem;

import java.util.Arrays;
import java.util.List;

interface VehicleInterface {
    int getNumberOfWheels();

    Boolean startEngine();
}

class Bicycle implements VehicleInterface {

    @Override
    public int getNumberOfWheels() {
        return 0;
    }

    @Override
    public Boolean startEngine() {
        return null;
    }
}

class Car implements VehicleInterface {

    @Override
    public int getNumberOfWheels() {
        return 0;
    }

    @Override
    public Boolean startEngine() {
        return true;
    }
}


public class LiskovSubstitutionProblem {
    public static void main(String[] args) {
        List<VehicleInterface> vehicles = Arrays.asList(new Car(), new Bicycle());

        //This will give NPE for Bicycle at Runtime and compiler is also not able to recognize at compile time
        for (VehicleInterface vehicle : vehicles) {
            System.out.println(vehicle.startEngine().toString());
        }
    }
}
