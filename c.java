import java.util.Scanner;
import java.util.Arrays;

class c{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int[] num=new int[6];

        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[2]);
    }
}