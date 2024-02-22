import java.util.Scanner;
public class indivisibleNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //11(input)
        int count  = 0;
        for(int i=1;i<=N;i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 4 != 0  && i % 5 != 0  && i % 6 != 0  && i % 7 != 0 && i % 8 != 0 && i % 9 != 0 && i % 10 != 0 ){
                count++;

            }
        }
        System.out.println(count); //2(output)

    }
}

//11 is divisible by 1 an 11 so  output is 2