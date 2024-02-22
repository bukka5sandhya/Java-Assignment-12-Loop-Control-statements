import java.util.Scanner;
public class HalfPyramid3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //1(input)
        int N = input.nextInt(); //3(input)
        int sumOfNum = 1;
        int counter = M;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=sumOfNum;j++){
                System.out.print(counter+" ");
                counter ++;
            }
            System.out.println();
            sumOfNum++;
        }
    }
    
}

//output 
//1
//2 3
//4 5 6
