public class Average {
    public static char getGrade(int s1, int s2, int s3) {
        int sum = s1 + s2 + s3;
        int avg = sum / 3;
        // Determine the grade based on the average
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 80) {
            return 'B';
        } else if (avg >= 70) {
            return 'C';
        } else if (avg >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93)); // should return 'A'
        System.out.println(getGrade(70, 70, 100)); // should return 'B'
        System.out.println(getGrade(70, 70, 70)); // should return 'C'
        System.out.println(getGrade(65, 70, 59)); // should return 'D'
        System.out.println(getGrade(44, 55, 52)); // should return 'F'
    }
}
