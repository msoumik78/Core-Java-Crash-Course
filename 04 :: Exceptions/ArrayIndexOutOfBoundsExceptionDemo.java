public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] ageOfStudents = new int[5];
        ageOfStudents[0] = 10;
        ageOfStudents[1] = 12;
        ageOfStudents[2] = 15;
        ageOfStudents[3] = 11;
        ageOfStudents[4] = 9;
        System.out.println("6th element of array = "+ageOfStudents[5]);
    }
}
