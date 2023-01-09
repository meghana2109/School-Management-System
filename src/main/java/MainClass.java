import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student(001,"Meghana","M","Manjunath","99002188223",2);
        Student s2 = new Student(002,"Pawan","Kumar","Kempanna","8867874529",4);

        Teacher t1 = new Teacher(001,"Gayathri","M", new String[]{"Science", "Maths", "English"},990011220);
        Teacher t2 = new Teacher(002,"Latha","K", new String[]{"Hindi", "English"},890011220);

        System.out.println("Student details : "+s1.firstName+" "+s1.secondName);
        System.out.println("Student class : "+s1.classNumber);

        System.out.println("Student details : "+s2.firstName+" "+s2.secondName);
        System.out.println("Student class : "+s2.classNumber);

        System.out.println("Teacher details : "+t1.firstName+" "+t1.secondName);
        System.out.println("Teacher Subjects : "+ Arrays.toString(t1.subjects));


        System.out.println("Teacher details : "+t2.firstName+" "+t2.secondName);
        System.out.println("Teacher Subjects : "+ Arrays.toString(t2.subjects));
    }
}
