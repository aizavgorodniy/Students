package net.ukr.azav.exception;

public class GroupOverTenException extends Exception {

    @Override
    public String toString() {

        return "The group is already full";
    }
}

