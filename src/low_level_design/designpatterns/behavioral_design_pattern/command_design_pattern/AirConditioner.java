package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern;

/**
 * AirConditioner
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public class AirConditioner {
  boolean isOn;
  int temperature;

  public AirConditioner(boolean isOn, int temperature) {
    this.isOn = isOn;
    this.temperature = temperature;
  }

  public AirConditioner() {
  }

  public boolean isOn() {
    return isOn;
  }

  public void setOn(boolean on) {
    isOn = on;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public void turnOn() {
    System.out.println("Turning AC on");
    isOn = true;
  }

  public void turnOff() {
    System.out.println("Turning AC off");
    isOn = false;
  }
}
