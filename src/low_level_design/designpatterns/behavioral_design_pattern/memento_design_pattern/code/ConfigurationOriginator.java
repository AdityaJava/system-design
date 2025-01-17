package low_level_design.designpatterns.behavioral_design_pattern.memento_design_pattern.code;

/**
 * ConfigurationOriginator
 */
public class ConfigurationOriginator {
  private int height;
  private int width;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public ConfigurationMemento createMemento() {
    return new ConfigurationMemento(height, width);
  }

  public void restoreMemento(ConfigurationMemento mementoToBeRestored) {
    this.height = mementoToBeRestored.getHeight();
    this.width = mementoToBeRestored.getWidth();
  }

  public void printCurrentState() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "ConfigurationOriginator{" + "height=" + height + ", width=" + width + '}';
  }
}
