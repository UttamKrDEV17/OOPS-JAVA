class Student{
    int rollno;
    String name;
    static String collegename = "kiit";
}
class Student3{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.rollno = 22051474;
        s1.name = "UTTAM";
        s2.rollno = 22051474;
        s2.name = "UDIT";
        System.out.println(s1.name+"-"+s1.rollno+"-"+s1.collegename);
        System.out.println(s2.rollno+"-"+s2.name+"-"+s2.collegename);
    }
}
