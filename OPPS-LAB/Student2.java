class Student {
    int rollno;
    String name;
    void insert(int no,String na){
        rollno = no;
        name = na;
    }
}
class Student2 {   
     public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insert(22051474,"Uttam");
        s2.insert(22051475,"Udit");
        System.out.println(s1.rollno + "-" + s1.name); 
        System.out.println(s2.rollno + "-" + s2.name);
    }
}
