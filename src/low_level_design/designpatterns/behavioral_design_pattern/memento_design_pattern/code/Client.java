package low_level_design.designpatterns.behavioral_design_pattern.memento_design_pattern.code;

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

    ConfigurationOriginator originator = new ConfigurationOriginator();
    originator.setHeight(9);
    originator.setWidth(10);

    //Save it
    ConfigurationMemento snapshot1 = originator.createMemento();
    //Add to history
    configurationCareTaker.addMemento(snapshot1);

    //Originator changing to new state
    originator.setHeight(10);
    originator.setWidth(11);

    //Save it
    ConfigurationMemento snapshot2 = originator.createMemento();
    //Add to history
    configurationCareTaker.addMemento(snapshot2);

    //Originator changing to new state
    originator.setHeight(11);
    originator.setWidth(12);

    //Save it
    ConfigurationMemento snapshot3 = originator.createMemento();
    //Add to history
    configurationCareTaker.addMemento(snapshot3);

    ConfigurationMemento restoredConfigurationMemento = configurationCareTaker.undo();
    originator.restoreMemento(restoredConfigurationMemento);
    originator.printCurrentState();
  }
}
