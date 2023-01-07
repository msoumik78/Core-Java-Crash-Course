public class WhileLoop {
    public static void main(String[] args) {
        int[] ageOfStudents = new int[5];
        ageOfStudents[0] = 10;
        ageOfStudents[1] = 12;
        ageOfStudents[2] = 15;
        ageOfStudents[3] = 11;
        ageOfStudents[4] = 9;
        int totalAge = 0;
        int loopCount = 0;
        while (loopCount < ageOfStudents.length ) {
            totalAge = totalAge + ageOfStudents[loopCount];
            loopCount++;
        }
        System.out.println("Average age = "+totalAge/5);
    }
}
