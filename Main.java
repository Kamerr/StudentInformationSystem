package OBG;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ali","Al","0123456","MAT");
        Teacher teacher2 = new Teacher("Ahmet","Sayan","00000","FZK");
        Teacher teacher3 = new Teacher("Hakan","Gül","54556","BIO");

        Courses tarih = new Courses("Tarih","101","TRH");
        tarih.addTeacher(teacher1);
        Courses fizik = new Courses("Fizik","102","FZK");
        fizik.addTeacher(teacher2);
        Courses biyo = new Courses("Biyoloji","103","BIO");
        biyo.addTeacher(teacher3);

        Student student1 = new Student("Ömer","1235","4B",tarih,fizik,biyo);
        student1.addNote(100,80,75);
        student1.addSozlu(50,50,72);

        student1.isPass();

    }
}
