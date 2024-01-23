class about{
    String name;
    int rollno;
    int section;    
}

class program1{
    public static void main(String[] args){
    about s1 = new about();
    s1.name = "Uttam";
    s1.rollno = 22051474;
    s1.section = 45;
    System.out.println("name:" + s1.name);
    System.out.println("rollno:" + s1.rollno);
    System.out.println("section: CSE-" + s1.section);
    
}
}
