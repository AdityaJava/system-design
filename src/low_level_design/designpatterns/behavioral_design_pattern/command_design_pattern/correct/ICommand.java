package low_level_design.designpatterns.behavioral_design_pattern.command_design_pattern.correct;

/**
 * ICommand
 *
 * Maxxton Group 2025
 *
 * @author a.dudhal (a.dudhal@maxxton.com)
 */
public interface ICommand {
  void execute();

  void undo();
}
