public class Main{
    public static void main(String[] args){
        
        int[] arr = {1,23,45,67,879,99,54};
        int max = 0;
        
        for(int num : arr){
            if(max < num){
            max = num;
            }
        }
        System.out.println("Max number is = "+max);
    }
}
