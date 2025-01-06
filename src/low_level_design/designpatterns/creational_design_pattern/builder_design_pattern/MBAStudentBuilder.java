package low_level_design.designpatterns.creational_design_pattern.builder_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.addAll(List.of("business", "analytics", "master"));
        this.subjects = subjects;
        return this;
    }
}
