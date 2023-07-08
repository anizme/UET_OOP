package W2;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(){
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@.vnu.edu.vn";
    }
    public Student(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }
    public Student(Student s){
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    public String getName() {return name;}
    public void setName(String n) {name = n;}
    public String getId() {return id;}
    public void setId(String i) {id = i;}
    public String getGroup() {return group;}
    public void setGroup(String g) {group = g;}
    public String getEmail() {return email;}
    public void setEmail(String e) {email = e;}

    public String getInfo(){
        return getName() + " - " + getId() + " - " + getGroup() + " - " + getEmail();
    }
}
