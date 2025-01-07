package low_level_design.designpatterns.structural_design_pattern.flyweight_design_pattern.wordprocessor.wrong;

// Here row and column are extrinsic data which will change according to input


class Character {
    char character;
    String fontType;
    int size;
    int row;
    int column;

    public Character(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.column = column;
    }
}


public class WrongWordProcessor {
    public static void main(String[] args) {

        //this is the data we want to write into the wordprocessor;
        Character object = new Character('t', "Arial", 10, 0, 0);
        Character object2 = new Character('h', "Arial", 10, 0, 0);
        Character object3 = new Character('i', "Arial", 10, 0, 0);
        Character object4 = new Character('s', "Arial", 10, 0, 0);

        //Now imagine lakhs of characters and each will have object so lakh objects
    }

}
