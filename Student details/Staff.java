import java.util.Scanner;
public class Staff {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        createStudent st=new createStudent();
        int choice=1;
        while(choice==1||choice ==2) {
        System.out.println("If you want to enter student Details press 1 OR view student details press 2");
        System.out.println("If you want to exit press 3");
        choice=sc.nextInt();
        if(choice==1) {
            System.out.println("Enter which year student details you want to enter ");
            int year=sc.nextInt();
            switch (year) {
                case 1:
                    st.EnterStudentYear1();
                    break;
                case 2:
                    st.EnterStudentYear2();
                    break;
                case 3:
                    st.EnterStudentYear3();
                    break;
                case 4:
                     st.EnterStudentYear4();
                
            }
        }
        else if(choice==2) {
            System.out.println("Enter which year student details you want to view ");
            int year=sc.nextInt();
            switch (year) {
                case 1:
                    st.StudentDetails1();
                    break;
                case 2:
                    st.StudentDetails2();
                    break;
                case 3:
                    st.StudentDetails3();
                    break;
                case 4:
                     st.StudentDetails4();
               
            }
        }
        else{break;
        }
    }
    sc.close();
    }
    
}
