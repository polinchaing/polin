package arrayLesson;

public class Practice {
    public static void main(String[] args) {
        int[] scores= {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<scores.length; i++){
            System.out.println("Normal order : ");
            System.out.println(scores[i]);
        }
        for(int i=scores.length-1; i>=0; i--){
            System.out.println("Reversed order : ");
            System.out.println(scores[i]);
        }
    }
}
