package OBG;

public class Courses {
    Teacher teacher;
    String className;
    String code;
    String prefix;
    int note;
    int sozluNote;

    Courses(String className,String code, String prefix){
        this.className= className;
        this.code=code;
        this.prefix = prefix;


    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){

            this.teacher = teacher;
            //printTeacherInfo();
        }else {
            System.out.println("Ogretmen ve Ders Ugusmuyor.");
        }

    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
