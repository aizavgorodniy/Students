package net.ukr.azav;

import java.util.Arrays;


public class Group {
    private Student[] group = new Student[10];

    public Group(Student[] group) {
        super();
        this.group = group;
    }

    public Group() {
        super();
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        Student  student;
        for (int i = 0; i < group.length; i++) {
            for (int j = group.length - 1; j > i; ) {
                if (group[j - 1] == null && group [j] == null) {
                    j--;
                } else if (group[j - 1] == null && group [j] != null){
                    group[j - 1] = group[j];
                    group[j] = null;
                    j--;

                } else if (group[j - 1] != null && group [j] == null) {
                    j--;
                } else {
                    if	(group[j - 1].compareTo(group[j]) >= 0) {
                        student = group[j - 1];
                        group[j - 1] = group[j];
                        group[j] = student;

                    }
                    j--;
                }
            }
        }
        return "Group: " + Arrays.toString(group);
    }

    public String add(Student student) {
        String s = "";
        boolean flag = false;
        for (int i = 0; i < group.length;) {
            if (group[i] == null) {
                i++;
            } else if (group[i].equals(student)) {
                flag = true;
                i++;
            } else {
                i++;
            }
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null && flag == false) {
                group[i] = student;
                s = "Student was added to the stated group";
                break;
            }
        }

        return s;

    }

    public String del(Student student) {
        String s = "";

        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                s = "There is not such student in the group";
                break;
            } else if (group[i].equals(student)) {
                group[i] = null;
                s = "Student was deleted from the stated group";
                break;
            }
        }
        if (s.equals("")) {
            return "There is not such student in the group";
        } else {
            return s;
        }
    }

    public String search(Student student) {
        String s = "";
        int position = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                s = "There is not such student in the group";

            } else if (group[i].equals(student)) {
                position = i + 1;
                s = "Student's position in the list is " + position;
                break;
            }
        }
        if (s.equals("")) {
            return "There is not such student in the group";
        } else {
            return s;
        }
    }



}


