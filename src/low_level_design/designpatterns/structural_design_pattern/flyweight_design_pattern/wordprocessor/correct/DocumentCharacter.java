package low_level_design.designpatterns.structural_design_pattern.flyweight_design_pattern.wordprocessor.correct;

class DocumentCharacter implements ILetter {
    char character;
    String fontType;
    int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    public void display(int row, int column) {
        //Display the character of particular font and size at given location
    }
}
