import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            int j=1;
            while(j<=i){
                if(j==i){
                    System.out.print(j+"=");
                }
                else{
                    System.out.print(j+"+");
                }
                j++;
            }
            System.out.println(sum);
            i++;
        }

    }
}
