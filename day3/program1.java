class data{
    String name;
    int rollno;
    int section;
    String branch;
    void insert(String name,int rollno,int section, String branch){
        this.name = name;
        this.rollno = rollno;
        this.section = section;
        this.branch = branch;
    }
}

class program1 {
    public static void main(String[] args) {
        data s1 = new data();
        s1.insert("Uttam", 1, 45, "CSE");
        System.out.println("name: " + s1.name);
        System.out.println("rollno: " + s1.rollno);
        System.out.println("section: " + s1.section);
        System.out.println("branch: " + s1.branch);
    }
}