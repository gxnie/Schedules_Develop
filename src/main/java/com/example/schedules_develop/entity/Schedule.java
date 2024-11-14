package com.example.schedules_develop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "longtext")
    // columnDefinition = "longtext"**는 해당 컬럼의 데이터 타입을 LONGTEXT로 지정한다는 의미
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    // Schedule이 User와 연결되어야 한다.
    private User user;

}
