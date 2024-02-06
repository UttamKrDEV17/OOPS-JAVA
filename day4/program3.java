import java.util.Scanner;

class program3 {

    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of input here");
        int num = obj.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = obj.nextInt();
        }
        bubbleSort(arr);
        System.out.println("sorted array:");
        for(int i=0;i<num;i++){
            
            System.out.println(arr[i]);
        }
        obj.close();
    }
    public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
