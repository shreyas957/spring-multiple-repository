package org.example.testing.student;

import jakarta.persistence.*;

@Entity
@Table(
        name = "student"
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String subject;

    public Student(String name, String surname, int age, String subject) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
    }

    public Student(Long id, String name, String surname, int age, String subject) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
    }

    public Student() {

    }
    // Below are the getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
