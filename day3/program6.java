class program6 {
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("Error....");
            return;
        }
        double a,b,c;
        a=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
        c=Double.parseDouble(args[2]);
        double temp;
        double largest;
        temp = a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("largest number is " + largest);
    }
}
