package low_level_design.designpatterns.structural_design_pattern.composite_design_pattern.directoryproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("movieDirectory");
        Directory comedyMovieDirectory = new Directory("comedyMovieDirectory");
        Directory horrorMovieDirectory = new Directory("horrorMovieDirectory");

        movieDirectory.addFileSystemList(new ArrayList<>(List.of(comedyMovieDirectory, horrorMovieDirectory)));

        File hulchulMovie = new File("hulchul.mov");
        File bhootMovie = new File("bhootMovie.mov");
        comedyMovieDirectory.addFileSystemList(Arrays.asList(hulchulMovie));
        horrorMovieDirectory.addFileSystemList(Arrays.asList(bhootMovie));

        movieDirectory.ls();
    }
}
