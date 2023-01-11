import java.util.*;
public class Example {
 public static void main(String[]args) {
    System.out.println("Enter the number of teacher");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    teacher[] tr=new teacher[size];

    for(int i=0;i<size;i++) {
        teacher teach=new teacher();
        System.out.println("Enter the teacher name:");
        String name=sc.next();
        System.out.println("Enetr the subject:");
        String subject=sc.next();
        
        teach.setTeacher(name);
        teach.setSubject(subject);
        tr[i]=teach;
    }
    System.out.println("Enter the student count:");
    int count=sc.nextInt();
    student stud[]=new student[count];
    for(int i=0;i<count;i++) {
       student s=new student();
       System.out.println("Enter the student name:");
       String name=sc.next();
       System.out.println("Enter the teacher id: ");
        int id=sc.nextInt();
       System.out.println("Enter the student mark:");
       int mark=sc.nextInt();
       s.setName(name);
       s.setMark(mark);
       stud[i]=s;
    }

    // for(int i=0;i<tr.length;i++) {
    //     System.out.println("Student Details"+(i+1));        
    //     System.out.println(tr[i].getTeacher());
    //     System.out.println(tr[i].getSubject());
    // }
    for (int i=0;i<stud.length;i++) {
            System.out.println("Student Detail  "+(i+1));
            System.out.println("Name: "+stud[i].getName());
            System.out.println("Mark"+stud[i].getMark());
    }

    sc.close();
}
 }   

