public class Grade {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks >= 61 && marks <= 80) {
            System.out.println("Grade C");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Your are Great >>>> Leave India");
        }
    }
}
