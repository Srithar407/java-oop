public class teacher {
    private String name,subject;
    private int id;
     public void setTeacher(String teacherName) {
        name=teacherName;
     }
     public void setSubject(String SubjectName) {
        subject=SubjectName;
     }
     public void setId(int TeacherId) {
        id=TeacherId;
     }
     String getTeacher() {
        return name;
     }
     String getSubject() {
        return subject;
     }
}
