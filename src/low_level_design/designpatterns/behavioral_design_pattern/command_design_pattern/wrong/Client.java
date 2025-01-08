package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.wrong;

import low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.AirConditioner;

/**
 * Client
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class Client {
  public static void main(String[] args) {

    //But here client needs to know all commands and it will be bulky and non maintainenble if the command grows
    AirConditioner airConditioner = new AirConditioner();
    airConditioner.turnOn();
    airConditioner.turnOff();
    airConditioner.setTemperature(90);
  }
}
