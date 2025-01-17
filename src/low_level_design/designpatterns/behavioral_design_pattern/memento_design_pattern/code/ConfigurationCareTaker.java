package low_level_design.designpatterns.behavioral_design_pattern.memento_design_pattern.code;

import java.util.Stack;

/**
 * ConfigurationCareTaker
 */
public class ConfigurationCareTaker {
  Stack<ConfigurationMemento> history = new Stack<>();

  public void addMemento(ConfigurationMemento memento) {
    history.push(memento);
  }

  public ConfigurationMemento undo() {
    if (!history.isEmpty()) {
      history.pop();
      if (!history.isEmpty()) {
        return history.pop();
      }
    }
    return null;
  }
}
