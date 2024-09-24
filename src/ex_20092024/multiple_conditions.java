package ex_20092024;



public class multiple_conditions {
    public static void main(String[] args) {
        int score = 85;
        char grade = 'e';
        if (score >= 90) {
            grade = 'a';
        } else if (score <= 70 && score >= 90) {
            grade = 'b';
        } else if (score >= 81 && score <=90) {
            grade = 'c';
        } else if (score >= 100 || score <= 70) {
            grade = 'e';
        } else {
            grade = 'f';
        }
        System.out.println("grade is" + grade);


    }
}




