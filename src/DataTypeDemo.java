public class DataTypeDemo {
    public static void main(String[] args) {
        byte age = 12;
        short salary = 5000;
        int workerId =3203923;
        long population = 200000;

        // floating point number
        float average = 5.4f;
        double biggerAvg = 67.89;

        // boolean -> true | false
        boolean isFemale = true;//false

        // char ->'a','B' , int ,ascii
        char gender = 'M';
        char unicode ='\u0051'; // = Q
        char ascii = 97; // = a

        System.out.println("ascii value is : "+ascii);

        //wrapper classes
        Character wCharacter;
        Integer wInteger;

        int value=10;
        System.out.println(Integer.toBinaryString(value));
    }
}
