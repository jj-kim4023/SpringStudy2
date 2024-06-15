package com.example.member.sample.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
// 별도로 name 설정하지 않을 경우 sample_entity 로 생성 됨.
// 그래서 설정하고 싶은 테이블 명을 여기에다 지정해줘야 함.
@Table(name = "sample_table")
public class SampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
