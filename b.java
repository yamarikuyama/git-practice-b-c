import java.util.Scanner;

class b{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int x=scanner.nextInt();

        int[] num=new int[x];

        for(int i=0;i<num.length;i++){
            num[i]=scanner.nextInt();
        }

        for(int j=1;j<num.length;j++){
            int before=num[j-1];
            int after=num[j];

            if(before>after){
                int a=before-after;
                System.out.println("down "+a);
            }
            else if(before<after){
                int b=after-before;
                System.out.println("up "+b);
            }
            else{
                System.out.println("stay");
            }
        }

    }
}