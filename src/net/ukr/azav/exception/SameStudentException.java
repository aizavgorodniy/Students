package net.ukr.azav.exception;

public class SameStudentException extends Exception {
    @Override
    public String toString() {

        return "The student is already in the group";
    }
}
