public class CalculateAverageAge {
    public static void main(String[] args) {
        int[] ageOfStudents = new int[5];
        ageOfStudents[0] = 10;
        ageOfStudents[1] = 12;
        ageOfStudents[2] = 15;
        ageOfStudents[3] = 11;
        ageOfStudents[4] = 9;

        int totalAge = ageOfStudents[0]+ageOfStudents[1]+ageOfStudents[2]+ageOfStudents[3]+ageOfStudents[4];
        float averageAge = totalAge/5;
        System.out.println("Average Age = "+averageAge);
    }
}
