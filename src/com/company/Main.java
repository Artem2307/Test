package com.company;

import java.util.*;



public class Main {

    static class Person  {
        String name;
        String surname;
        int age;

        public Person(String name, String sername, int age) {
            this.name = name;
            this.surname = sername;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


    public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();
            personList.add(new Person("Peter", "Patterson", 21));
            personList.add(new Person("Paul", "Walker", 31));
            personList.add(new Person("Steve", "Runner", 41));
            personList.add(new Person("Arnold", "", -1));
            personList.add(new Person(" ", "Stevenson", 19));
            personList.add(new Person("Arnold", "Stevenson", 19));
            personList.add(new Person("Aaron", "Bortnicker", 18));
            Collections.sort(personList, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.age-o2.age;
                }
            });
        System.out.print(personList);
        }
    }







