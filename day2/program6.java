class program6{
    private String name;
    private int age;   
    public String getName() {
        return name;
    } 
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public static void main(String[] args) {
        program6 obj = new program6();
        obj.setName("UTTAM");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}