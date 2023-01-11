import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class createStudent {      
    Scanner sc=new Scanner(System.in);
    List<firstYear> studentList1=new ArrayList<>();
    List<secondYear> studentList2=new ArrayList<>();
    List<thirdYear> studentList3=new ArrayList<>();
    List<finalYear> studentList4=new ArrayList<>();
    public void EnterStudentYear1() {
       
        int in=0;  
        do{
       firstYear stud1=new firstYear();
       System.out.println("Enter the student Name :");
       String name=sc.next();
       stud1.setName(name);
       System.out.println("Enter the student marks :");
       List<Integer> mark1=new ArrayList<>();
       for(int i=0;i<5;i++) {
        int mark=sc.nextInt();
       mark1.add(mark);
       stud1.setMark(mark1);
       }
       studentList1.add(stud1);
       System.out.println("Are you want to enter another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
       in=sc.nextInt();
       
    
    }while(in==1);
    
    
  }
  public void  StudentDetails1() {
    int total=0;
    int in=0;
    do{
    System.out.println("Enter the student roll no");
    int num=sc.nextInt();
    int size = studentList1.get(num-1).mark.size();
    for(int i=0;i<size;i++) {
     total+= studentList1.get(num-1).mark.get(i);   
    }
        System.out.println("Student Name :"+studentList1.get(num-1).getName());
        System.out.println("College Name :"+parent.getClgname());
        System.out.println("Department : "+parent.getDept());
        System.out.println("Year of studying : First year");
        System.out.println("Total mark : "+total);
        System.out.println("Are you want to view another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
        in=sc.nextInt();
      }while(in==1);
    }

public void EnterStudentYear2() {
       
    int in=0;  
    do{
   secondYear stud=new secondYear();
   System.out.println("Enter the student Name :");
   String name=sc.next();
   stud.setName(name);
   System.out.println("Enter the student marks :");
   List<Integer> mark1=new ArrayList<>();
   for(int i=0;i<5;i++) {
    int mark=sc.nextInt();
   mark1.add(mark);
   stud.setMark(mark1);
   }
   studentList2.add(stud);
   System.out.println("Are you want to enter another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
   in=sc.nextInt();

}while(in==1);


}
public void  StudentDetails2() {
int total=0;
int in=0;
do{
System.out.println("Enter the student roll no");
int num=sc.nextInt();
int size = studentList2.get(num-1).mark.size();
for(int i=0;i<size;i++) {
 total+= studentList2.get(num-1).mark.get(i);   
}
    System.out.println("Student Name :"+studentList2.get(num-1).getName());
    System.out.println("College Name :"+parent.getClgname());
    System.out.println("Department : "+parent.getDept());
    System.out.println("Year of studying : Second year");
    System.out.println("Total mark : "+total);
    System.out.println("Are you want to view another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
    in=sc.nextInt();
}while(in==1);
}

public void EnterStudentYear3() {
       
    int in=0;  
    do{
   thirdYear stud=new thirdYear();
   System.out.println("Enter the student Name :");
   String name=sc.next();
   stud.setName(name);
   System.out.println("Enter the student marks :");
   List<Integer> mark1=new ArrayList<>();
   for(int i=0;i<5;i++) {
    int mark=sc.nextInt();
   mark1.add(mark);
   stud.setMark(mark1);
   }
   studentList3.add(stud);
   System.out.println("Are you want to enter another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
   in=sc.nextInt();

}while(in==1);


}
public void  StudentDetails3() {
int total=0,in=0;
do{
System.out.println("Enter the student roll no");
int num=sc.nextInt();
int size = studentList3.get(num-1).mark.size();
for(int i=0;i<size;i++) {
 total+= studentList3.get(num-1).mark.get(i);   
}
    System.out.println("Student Name :"+studentList3.get(num-1).getName());
    System.out.println("College Name :"+parent.getClgname());
    System.out.println("Department : "+parent.getDept());
    System.out.println("Year of studying : Third year");
    System.out.println("Total mark : "+total);
    System.out.println("Are you want to view another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
    in=sc.nextInt();
}while(in==1);
}

public void EnterStudentYear4() {
       
    int in=0;  
    do{
   finalYear stud=new finalYear();
   System.out.println("Enter the student Name :");
   String name=sc.next();
   stud.setName(name);
   System.out.println("Enter the student marks :");
   List<Integer> mark1=new ArrayList<>();
   for(int i=0;i<5;i++) {
    int mark=sc.nextInt();
   mark1.add(mark);
   stud.setMark(mark1);
   }
   studentList4.add(stud);
   System.out.println("Are you want to enter another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
   in=sc.nextInt();

}while(in==1);


}
public void  StudentDetails4() {
int total=0,in=0;
do{
System.out.println("Enter the student roll no");
int num=sc.nextInt();
int size = studentList4.get(num-1).mark.size();
for(int i=0;i<size;i++) {
 total+= studentList4.get(num-1).mark.get(i);   
}
    System.out.println("Student Name :"+studentList4.get(num-1).getName());
    System.out.println("College Name :"+parent.getClgname());
    System.out.println("Department : "+parent.getDept());
    System.out.println("Year of studying : Final year");
    System.out.println("Total mark : "+total);
    System.out.println("Are you want to view another student detail "+"\n press 1 for yes "+"\n press 2 for go to main menu");
    in=sc.nextInt();
}while(in==1);
}

}

class parent {
    static String clgName="Sri Ramanujar  Engineering College";
    static String deptName="Computer Science Engineering";
    public static String getClgname() {
        return clgName;
    }
    public static String getDept() {
        return deptName;
    }

}
class firstYear {
     String name;
    List<Integer> mark=new ArrayList<>();
  
    public void setName(String user) {
        name=user;
    }
    public void setMark(List<Integer> userMark) {
        mark=userMark;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getMark() {
        return mark;
    }
    
}
class secondYear {
    String name;
    List<Integer> mark=new ArrayList<>();
  
    public void setName(String user) {
        name=user;
    }
    public void setMark(List<Integer> userMark) {
        mark=userMark;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getMark() {
        return mark;
    }

}
class thirdYear {
    String name;
    List<Integer> mark=new ArrayList<>();
    
    public void setName(String user) {
        name=user;
    }
    public void setMark(List<Integer> userMark) {
        mark=userMark;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getMark() {
        return mark;
    }

}
class finalYear {
    String name;
    List<Integer> mark=new ArrayList<>();
    
    public void setName(String user) {
        name=user;
    }
    public void setMark(List<Integer> userMark) {
        mark=userMark;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getMark() {
        return mark;
    }
    
}


