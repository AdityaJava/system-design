package low_level_design.designpatterns.behavioral_design_pattern.memento_design_pattern.code;

/**
 * ConfigurationMemento
 */
public class ConfigurationMemento {
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

  public ConfigurationMemento(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
