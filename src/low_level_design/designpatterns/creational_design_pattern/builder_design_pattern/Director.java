package low_level_design.designpatterns.creational_design_pattern.builder_design_pattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setAge(12).setSubjects().build();
    }


    public Student createMBAStudent() {
        return studentBuilder.setAge(12).setFatherName("Aditya").setSubjects().build();
    }
}
