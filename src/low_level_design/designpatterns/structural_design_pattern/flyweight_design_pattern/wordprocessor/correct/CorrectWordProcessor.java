package low_level_design.designpatterns.structural_design_pattern.flyweight_design_pattern.wordprocessor.correct;

public class CorrectWordProcessor {
    public static void main(String[] args) {
        ILetter object = LetterFactory.createLetter('t');
        object.display(0, 0);
        ILetter object2 = LetterFactory.createLetter('h');
        object2.display(0, 1);
    }
}
