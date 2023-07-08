package W2;

import java.util.Scanner;

public class StudentManagement {
    private Student[] students = new Student[100];;

    private int count = 0;

    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent){
        students[count] = newStudent;
        count++;
    }

    public String studentsByGroup(){
        boolean[] isPrinted = new boolean[100];
        String ans = "";
        for(int i = 0; i <= count; i++){
            if(students[i] == null) return ans;
            else if(!isPrinted[i]) {
                isPrinted[i] = true;
                ans = ans + students[i].getGroup() + "\n" + students[i].getInfo() + "\n";
                for(int j = i + 1; j <= count; j++) {
                    if(students[j] == null) break;
                    if(sameGroup(students[j], students[i])) {
                        isPrinted[j] = true;
                        ans = ans + students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return ans;
    }
    public void removeStudent(String id){
        for(int i = 0; i <= count; i++){
            if(students[i].getId().equals(id)) {
                for(int j = i; j < count; j++) {
                    students[j] = students[j + 1];
                }
                students[count] = null;
                count--;
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManagement list = new StudentManagement();
        Student s = new Student("Hai Anh", "22028162", "haianhsone291124@gmail.com");
        s.setGroup("CACLC2");
        Student s1 = new Student("Anh Quoc", "22028161", "quocat1k29@gmail.com ");
        s1.setGroup("CACLC2");
        Student s2 = new Student("Anh Khoa", "22028160", "anhkhoa@gmail.com");
        s2.setGroup("CACLC3");
        Student s3 = new Student("Hoang Vu", "22021111", "vuniem@gmail.com ");
        s3.setGroup("K67CB");
        list.addStudent(s);
        list.addStudent(s1);
        list.addStudent(s2);
        list.addStudent(s3);
        System.out.println(list.studentsByGroup() + "\n");
        list.removeStudent("22028162");
        System.out.println("Sau khi xoa Hai Anh:");
        System.out.println(list.studentsByGroup() + "\n");
        sc.close();
    }
}