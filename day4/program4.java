class program4 {

    static int count = 0; 
    public program4() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        program4 obj1 = new program4();
        program4 obj2 = new program4();
        program4 obj3 = new program4();
        program4 obj4 = new program4();
        
      
        program4.displayCount(); 
    }
}
