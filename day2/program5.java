class instancemethod{
    int adder(int a,int b){
        return a+b;
    }
}

class program5 {
    public static void main(String[] args) {
        instancemethod obj = new instancemethod();
        System.out.println(obj.adder(100,400));
    }
}
