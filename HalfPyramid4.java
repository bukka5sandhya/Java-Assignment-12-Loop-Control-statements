import java.util.Scanner;
public class HalfPyramid4{
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt(); //10(input)
        int K =input.nextInt(); //5(input)
        int present_num =K*(K+1)/2+N-1; 
        for(int i=0;i<K;i++){ 
            for(int j=0; j<=i;j++){
                System.out.print(present_num--+" ");
            }
            System.out.println();
        }
    }
}

//output
//24
//23 22
//21 20 19
//18 17 16 15 
//14 13 12 11 10