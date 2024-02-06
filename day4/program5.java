import java.util.Scanner; 

class program5{
    public static void duplicate(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(" no of Occurance"+ count);
            count = 0;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of input here");
        int num = obj.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = obj.nextInt();
        } 
        duplicate(arr);
        obj.close();
    }  
}
