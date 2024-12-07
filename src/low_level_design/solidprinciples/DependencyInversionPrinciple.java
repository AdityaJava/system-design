package low_level_design.solidprinciples;

//Definition: Class should depend on interfaces rather than concrete classes
interface KeyboardInterface {

}

interface MouseInterface {

}

class WiredKeyboard implements KeyboardInterface {

}

class WiredMouse implements MouseInterface {

}


//--Wrong working starts
//Here we cannot change this class to take bluetooth
class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse wiredMouse;

    MacBook(WiredKeyboard keyboard, WiredMouse wiredMouse) {
        this.keyboard = keyboard;
        this.wiredMouse = wiredMouse;
    }
}
//--Wrong working ends

//--Correct working starts
//Here we are using Interfaces instead of concrete classes
//So tomorrow if we decide to bluetooth keyboard or mouse we can do that

class MacBook1 {
    private final KeyboardInterface keyboard;
    private final MouseInterface mouse;

    MacBook1(KeyboardInterface keyboard, MouseInterface mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
//--Correct working ends


public class DependencyInversionPrinciple {
}
