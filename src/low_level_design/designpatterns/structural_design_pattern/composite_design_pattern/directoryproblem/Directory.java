package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.directoryproblem;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public Directory(List<FileSystem> fileSystemList) {
        this.fileSystemList = fileSystemList;
    }

    public Directory() {
    }

    @Override
    public void ls() {
        System.out.println(this.directoryName);
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<FileSystem> getFileSystemList() {
        return fileSystemList;
    }

    public void setFileSystemList(List<FileSystem> fileSystemList) {
        this.fileSystemList = fileSystemList;
    }

    public void addFileSystemList(List<FileSystem> fileSystemList) {
        if (this.fileSystemList == null) {
            this.fileSystemList = new ArrayList<>();
        }
        this.fileSystemList.addAll(fileSystemList);
    }

}
