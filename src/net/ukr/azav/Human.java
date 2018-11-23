package net.ukr.azav;

public class Human implements Comparable{
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public Human() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", age=" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Human human = (Human) obj;
            if (human.name  == this.name && human.surname == this.surname && human.age == this.age) {
                return true;

            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        Human anotherhuman = (Human) o;

        return this.surname.compareToIgnoreCase(anotherhuman.getSurname());

    }


}
