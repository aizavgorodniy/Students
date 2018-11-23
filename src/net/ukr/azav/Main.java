package net.ukr.azav;

import net.ukr.azav.exception.GroupOverTenException;

import net.ukr.azav.exception.SameStudentException;

public class Main {

    public static void main(String[] args) {
        Human humanOne = new Human("Olena", "Kartyzhova", 25);
        System.out.println("Human: " + humanOne.toString());

        Student studentOne = new Student ("Nata", "Kravchuk", 24, 12);
        Student studentTwo = new Student ("Denis", "Kravchuk", 25, 10);
        Student studentThree = new Student ("Yaroslav", "Kravch", 23, 9);
        Student studentFour = new Student ("Yaroslav", "Buravsk", 24, 7);
        Student studentFive = new Student ("Olga", "Babanina", 25, 9);
        Student studentSix = new Student ("Svitlana", "Shevchuk", 23, 5);
        Student studentSeven = new Student ("Oleg", "Diak", 23, 10);
        Student studentEight = new Student ("Jim", "Jhones", 24, 7);
        Student studentNine = new Student ("Omar", "Heys", 23, 10);
        Student studentTen = new Student ("Jackie", "Chan", 26, 12);
        Student studentEleven = new Student ("Tim", "Burton", 23, 9);

        Group group = new Group();


        System.out.println(group.add(studentOne));
        System.out.println(group.add(studentTwo));
        System.out.println(group.add(studentThree));
        System.out.println(group.add(studentFour));
        System.out.println(group.add(studentFive));
        System.out.println(group.add(studentSix));
        System.out.println(group.add(studentSeven));
        System.out.println(group.add(studentEight));
        System.out.println(group.add(studentNine));
//		System.out.println(group.add(studentTen));

        try {

//			System.out.println(group.add(studentNine));
            System.out.println(group.add(studentTen));
            System.out.println(group.add(studentEleven));

            if	(group.getGroup()[group.getGroup().length - 1] != null) {
                throw new GroupOverTenException();
            } else {
                throw new SameStudentException();
            }

        } catch (GroupOverTenException e){
            System.out.println(e.toString());
        } catch (SameStudentException e) {
            System.out.println(e.toString());
        }

        System.out.println(group.toString());
        System.out.println(group.del(studentOne));
        System.out.println(group.toString());
        System.out.println(group.search(studentTwo));
    }


}

