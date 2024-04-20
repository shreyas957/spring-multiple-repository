package org.example.testing.teacher;

import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
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

    public Teacher(String name, String surname, int age, String subject) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
    }

    public Teacher(Long id, String name, String surname, int age, String subject) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subject = subject;
    }

    public Teacher() {

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
