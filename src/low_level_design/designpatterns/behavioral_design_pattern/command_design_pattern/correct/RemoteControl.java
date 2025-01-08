package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.correct;

import java.util.Stack;

/**
 * RemoteControl
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class RemoteControl {
  ICommand iCommand;
  Stack<ICommand> history = new Stack<>();

  public RemoteControl(ICommand iCommand) {
    this.iCommand = iCommand;
  }

  public void pressButton() {
    iCommand.execute();
    history.push(iCommand);
  }

  public ICommand getiCommand() {
    return iCommand;
  }

  public void setiCommand(ICommand iCommand) {
    this.iCommand = iCommand;
  }

  public void undo() {
    ICommand historyCommand = history.pop();
    historyCommand.undo();
  }

}
