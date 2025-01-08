package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.correct;

import low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.AirConditioner;

/**
 * Clie
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Clie {
  public static void main(String[] args) {

    AirConditioner airConditioner = new AirConditioner();

    ICommand iCommand = new TurnAcOnCommand(airConditioner);
    RemoteControl remoteControl = new RemoteControl(iCommand);
    remoteControl.pressButton();
    remoteControl.undo();

    ICommand iCommand1 = new TurnACOffCommand(airConditioner);
    RemoteControl remoteControl1 = new RemoteControl(iCommand1);
    remoteControl1.pressButton();
    remoteControl1.undo();

  }
}
