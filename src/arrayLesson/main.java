package arrayLesson;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of student : ");
        n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the score " + (i + 1) + ":");
            scores[i] = sc.nextInt();
        }
            System.out.println("All even scores : ");
            for(int num : scores){
                if(num % 2 == 0){
                    System.out.println(num+" ");
                }
            }
            System.out.println("All odd scores : ");
            for(int num : scores){
                if(num % 2 == 0)continue; {
                    System.out.println(num + " ");
                }
            }
            int sum = 0;
            for(int num : scores){
                sum += num;
            }
            double average = sum /(double)n;
        int max = scores[0];
        for(int i = 1; i < n; i++){
            if(scores[i] > max)max = scores[i];
        }
        int min = scores[0];
        for(int i = 1; i < n; i++){
            if(scores[i] < min)min = scores[i];
        }
        Arrays.sort(scores);
        System.out.println("All Scores");
        System.out.println(Arrays.toString(scores));
        System.out.println("average is : "+average);
        System.out.println("min is : "+min);
        System.out.println("max is : "+max);
        System.out.println("sum is : "+sum);
        System.out.println("Final scores: ");
        System.out.println(Arrays.toString(scores));
    }
}
