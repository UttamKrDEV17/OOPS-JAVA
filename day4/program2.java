class program2 {
    public static void main(String[] args) {
        if(args.length !=10){
            System.out.println("Error....");
            return;
        }
        double[] arr;
        arr = new double[10];
        for(int i=0;i<10;i++){
            arr[i]=Double.parseDouble(args[i]);
            if(arr[i]%2==1){
                System.out.println(arr[i] + "is odd");
            }
            else{
                System.out.println(arr[i] + "is even");
            }
        }
    }    
}
