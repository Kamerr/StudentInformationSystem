package OBG;

public class Teacher {
    String name;
    String lastname;
    String phoneNumber;
    String branch;

    Teacher(String name , String lastName, String phoneNumber, String branch){
        this.name= name;
        this.lastname=lastName;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
    void print(){
        System.out.println("Isim : " + this.name);
        System.out.println("soyisim:"+this.lastname);
        System.out.println("Telefon : "+ this.phoneNumber);
        System.out.println("Alan : " + this.branch);
    }
}
