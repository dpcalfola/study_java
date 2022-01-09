package quizClass;

class Student {

    //멤버 변수 선언
    private String name;
    private String school;
    private String grade;


    //생성자
    Student() {

    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, String school) {
        this(name);
        this.school = school;
    }

    Student(String name, String school, String grade) {
        this(name, school);
        this.grade = grade;
    }


    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
