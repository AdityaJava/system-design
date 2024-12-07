package low_level_design.solidprinciples.LiskovSubstitutionSolution.solution;

import java.util.Arrays;
import java.util.List;

//Here as a solutiion we removed startEngine which is not generic and placed it inside EngineVehicle class
interface VehicleInterface {
    int getNumberOfWheels();
}

class Vehicle implements VehicleInterface {

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}

//Here we've placed the startEngine method
class EngineVehicle extends Vehicle {
    public Boolean startEngine() {
        return true;
    }
}

class Bicycle extends Vehicle {

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}

class Car extends EngineVehicle {

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public Boolean startEngine() {
        return true;
    }
}


public class LiskovSubstitutionSolution {
    public static void main(String[] args) {
        //Now here it is giving compile time exception for adding bicycle
        //This will save us from Runtime Exception. Uncomment code to see it
//        List<EngineVehicle> engineVehicles = Arrays.asList(new Car(), new Bicycle());

        //This will give NPE for Bicycle at Runtime and compiler is also not able to recognize at compile time
//        for (EngineVehicle engineVehicle : engineVehicles) {
//            System.out.println(engineVehicle.startEngine().toString());
//        }
    }
}
