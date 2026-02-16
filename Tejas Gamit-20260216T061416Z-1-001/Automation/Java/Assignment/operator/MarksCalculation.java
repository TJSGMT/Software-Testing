class MarksCalculation {
    public static void main(String[] args) {
        int m1 = 78;
        int m2 = 45;
        int m3 = 62;

        int total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
