package com.project.demo.logic.entity.math;

import jakarta.persistence.*;

@Entity
@Table(name = "math")
public class Math {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answers_1", nullable = false)
    private String answers_1;

    @Column(name = "answers_2", nullable = false)
    private String answers_2;
    @Column(name = "answers_3", nullable = false)
    private String answers_3;
    @Column(name = "answers_4", nullable = false)
    private String answers_4;
    @Column(name = "answers_Final", nullable = false)
    private String answers_Final;



    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers_1() {
        return answers_1;
    }

    public void setAnswers_1(String answers_1) {
        this.answers_1 = answers_1;
    }

    public String getAnswers_2() {
        return answers_2;
    }

    public void setAnswers_2(String answers_2) {
        this.answers_2 = answers_2;
    }

    public String getAnswers_3() {
        return answers_3;
    }

    public void setAnswers_3(String answers_3) {
        this.answers_3 = answers_3;
    }

    public String getAnswers_4() {
        return answers_4;
    }

    public void setAnswers_4(String answers_4) {
        this.answers_4 = answers_4;
    }

    public String getAnswers_Final() {
        return answers_Final;
    }

    public void setAnswers_Final(String answers_Final) {
        this.answers_Final = answers_Final;
    }
}
