package low_level_design.solidprinciples;

//Definition: If class B is subtype of class A, then we should be able to replace object A with B without breaking the behaviour of the program
//In another words: Subclass should extend the capability of parent class not narrow it down
//For example: suppose ParentClass has 2 features then ChildClass cannot just have 1 feature it should have 2 or more than 2 features

interface BikeInterface {
    void turnOnEngine();

    void accelerate();
}

//---Correct working
class MotorCycle implements BikeInterface {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
//---Correct working End


//---Wrong working start
// This is wrong as we are throwing exception in turnOn Engine that is we are narrowing down the functionality of BikeInterface
// Also we can't replace Bicycle instead of BikeInterface because the functionality will break when we call turnOnEngine on Bicycle object
class Bicycle implements BikeInterface {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("No engine in bicycle");
    }

    @Override
    public void accelerate() {
        //do something
    }
}
//To Solve this we need to create separate interface for bicycle
interface BicycleInterface {
    void accelerate();
}

class Bicycle1 implements BicycleInterface {

    @Override
    public void accelerate() {

    }
}
//---Wrong working End


public class LiskovSubstitutionPrinciple {
}