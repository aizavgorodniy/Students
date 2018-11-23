package net.ukr.azav;

public class Human implements Comparable{
    private String name;
    private String surname;
    private int age;
    private String sex;

    public Human(String name, String surname, int age, String sex) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.name = sex;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", age=" + age + " sex=" + sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() == this.getClass()) {
            Human human = (Human) obj;
            if (human.name  == this.name && human.surname == this.surname && human.age == this.age && human.sex == this.sex) {
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
