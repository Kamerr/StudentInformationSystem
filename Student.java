package OBG;

public class Student {
    Courses courses1;
    Courses courses2;
    Courses courses3;

    String name;
    String studentNo;
    String classes;


    double avarege;
    double noteOrt1;
    double noteOrt2;
    double noteOrt3;

    boolean isPass;

    Student(String name, String studentNo, String classes , Courses courses1, Courses courses2, Courses courses3){
        this.name=name;
        this.studentNo=studentNo;
        this.classes= classes;
        this.courses1= courses1;
        this.courses2=courses2;
        this.courses3=courses3;

        this.avarege=0.0;
        this.isPass=false;

    }
    void addNote(int note1, int note2, int note3){
        if (note1 >=0 && note1<=100 ){
            this.courses1.note= (int) (note1*0.8);
        }
        if (note2 >=0 && note2<=100){
            this.courses2.note= (int) (note2*0.8);
        }
        if (note3 >=0 && note3<=100){
            this.courses3.note= (int) (note3*0.8);
        }


    }
    void addSozlu(int sozlu1 ,int sozlu2 ,int sozlu3){
        if (sozlu1>=0 && sozlu1<=100){
            this.courses1.sozluNote = (int) (sozlu1*0.2);
        }
        if (sozlu2>=0 && sozlu2<=100){
            this.courses2.sozluNote = (int) (sozlu2*0.2);
        }
        if (sozlu3>=0 && sozlu3<=100){
            this.courses3.sozluNote = (int) (sozlu3*0.2);
        }
    }

    void isPass(){
        this.noteOrt1 = this.courses1.note  + this.courses1.sozluNote ;
        this.noteOrt2 = this.courses2.note+this.courses2.sozluNote ;
        this.noteOrt3 = this.courses3.note + this.courses3.sozluNote ;
        this.avarege = (noteOrt1 + noteOrt2 +noteOrt3)/3;
        if (this.avarege>=55){
            this.isPass=true;

            System.out.println("Gectiniz.");
        }else {
            System.out.println("Kaldiniz.");
        }
        printNote();

    }
    void printNote(){

        System.out.println(this.name+" : "+this.courses1.className +  " Oranlanmis Notu : "+ this.courses1.note + " ---" +  " Oranlanmis Sozlu Notu: " +this.courses1.sozluNote + " ---" +  " Tarih Not Ort : "+ this.noteOrt1);
        System.out.println(this.name+" : "+this.courses2.className +   " Oranlanmis Notu : "+ this.courses2.note + " ---" +  " Oranlanmis Sozlu Notu: " +this.courses2.sozluNote + " ---" +  " Fizik Not Ort : "+ this.noteOrt2);
        System.out.println(this.name+" : "+this.courses3.className +   " Oranlanmis Notu : "+ this.courses3.note + " ---" +  " Oranlanmis Sozlu Notu: " +this.courses3.sozluNote + " ---" +  " Biyoloji Not Ort : "+ this.noteOrt3);
        System.out.println("Ortalama : " + this.avarege);

    }


}
