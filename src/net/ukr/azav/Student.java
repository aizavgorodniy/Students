package net.ukr.azav;

public class Student extends Human {

    private double averageMark;

    public Student(String name, String surname, int age, double averageMark) {
        super(name, surname, age);
        this.averageMark = averageMark;
    }

    public Student(String name, String surname, int age, int height, double weight) {
        super(name, surname, age);
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return super.toString() + ", average mark = " + averageMark;
    }


    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            Student student = (Student) obj;

            if (student.averageMark == this.averageMark) {
                return true;

            }
        }
        return false;
    }



}
