class student{
    String name;
    int rollno;
    int section;
    void data(String n,int r,int s){
        name = n;
        rollno = r;
        section = s;
    }
}

class program2 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.data("Uttam", 22051474, 45);
        s2.data("udit",1,45);
        System.out.println("name:" + s1.name);
        System.out.println("rollno:" + s1.rollno);
        System.out.println("section: CSE-" + s1.section);
        System.out.println("name:" + s2.name);
        System.out.println("rollno:" + s2.rollno);
        System.out.println("section: CSE-" + s2.section);
    }
}
