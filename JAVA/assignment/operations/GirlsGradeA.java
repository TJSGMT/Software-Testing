class GirlsGradeA {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        int totalGradeA = totalStudents / 2; // 50% of 90 = 45
        int boysGradeA = 20;

        int girlsGradeA = totalGradeA - boysGradeA;

        System.out.println("Number of girls getting grade A = " + girlsGradeA);
    }
}
