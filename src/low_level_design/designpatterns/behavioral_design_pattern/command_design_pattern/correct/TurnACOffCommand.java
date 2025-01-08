package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.correct;

import low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.AirConditioner;

/**
 * TurnACOffCommand
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class TurnACOffCommand implements ICommand {
  AirConditioner airConditioner;

  public TurnACOffCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  @Override
  public void execute() {
    airConditioner.turnOff();
  }

  @Override
  public void undo() {
    airConditioner.turnOn();
  }
}
