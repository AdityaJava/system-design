package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.directoryproblem;

public class File implements FileSystem {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public File() {
    }

    @Override
    public void ls() {
        System.out.println("--" + fileName);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
