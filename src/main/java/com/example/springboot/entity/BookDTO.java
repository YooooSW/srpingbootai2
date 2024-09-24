package com.example.springboot.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
// @Entity Data -> DTO 변환
public class BookDTO {
    private Long id;
    private String title;
    private int price;
    private String author;
    private int page;
    private List<ReviewDTO> reviews;
}
