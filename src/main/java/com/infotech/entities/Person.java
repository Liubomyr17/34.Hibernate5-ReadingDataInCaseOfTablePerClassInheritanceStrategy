package com.infotech.entities;

import javax.persistence.*;


    @Entity
    @Table(name="person_table")
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    public class Person {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name="id")
        private int id;

        @Column(name="name",length=100)
        private String name;

        @Column(name="gender",length=10)
        private String gender;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }


