package W2;
import java.util.Scanner;

public class StudentManagement {
    private Student[] students;

    public StudentManagement(){
        students = new Student[0];
    }
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup() == s2.getGroup();
    }
    public void addStudent(Student newStudent){
        int n = students.length + 1;
        Student[] newStudents = new Student[n];
        for(int i = 0; i < n - 1; i++){
            newStudents[i] = students[i];
        }
        newStudents[n - 1] = newStudent;
        students = newStudents;
    }
    public String studentsByGroup(){
        String ans = "";
        for(int i = 0; i < students.length; i++){
            ans = ans + students[i].getInfo() + "\n";
        }
        return ans;
    }
    public void removeStudent(String id){
        int idx = students.length;
        for(int i = 0; i < students.length; i++){
            if(id.equals(students[i].getId())) idx = i;
        }
        Student[] newStudents = new Student[students.length - 1];
        if(idx >= students.length) return;
        for(int i = 0; i < idx; i++){
            newStudents[i] = students[i];
        }
        for(int i = idx; i < students.length - 1; i++){
            newStudents[i] = students[i + 1];
        }
        students = newStudents;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManagement list = new StudentManagement();
        System.out.println("Number of students: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Student s = new Student("Ani_" + Integer.toString(i), "2202_" + Integer.toString(i), "2202" + Integer.toString(i) + "@vnu.edu.vn");
            list.addStudent(s);
        }
        System.out.println("List of students CA-CLC2: ");
        System.out.println(list.studentsByGroup());
        list.removeStudent("2202_1");
        System.out.println("List of students in CA-CLC2 after removed: ");
        System.out.println(list.studentsByGroup());

        sc.close();
    }
}
