package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.correct;

import low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.AirConditioner;

/**
 * TurnAcOnCommand
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class TurnAcOnCommand implements ICommand {
  AirConditioner airConditioner;

  public TurnAcOnCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOn();
  }

  @Override
  public void undo() {
    airConditioner.turnOff();
  }
}
