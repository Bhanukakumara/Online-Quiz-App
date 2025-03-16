package edu.bks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private Integer id;
    private String name;
    private String description;
    private Integer courseId;
    private String timeLimit;
    private Integer passingScope;
    private Integer questionCount;
}
