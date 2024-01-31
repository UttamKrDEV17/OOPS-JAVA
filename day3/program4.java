class program4 {
    public static void main(String[] args) {
        int number,reverse,start;
        number = 121241;
        reverse= 0;
        start=number;
        while(number!=0){
            reverse=reverse*10;
            reverse= reverse + number%10;
            number = number/10;
        }
        if(reverse==start){
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not-palindrome");
        }
    }
}
