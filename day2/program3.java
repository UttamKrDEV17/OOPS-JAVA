class student{
    String name;
    int rollno;
    int section;
    public student(String name,int rollno,int section){
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }
}

class program3 {
    public static void main(String[] args) {
        student s1 = new student("uttam", 22051474, 45);
        System.out.println("name:" + s1.name);
        System.out.println("rollno:" + s1.rollno);
        System.out.println("section: CSE-" + s1.section);
    }
}
