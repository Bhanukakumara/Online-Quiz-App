package edu.bks.controller;

import edu.bks.dto.Exam;
import edu.bks.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        service.createExam(exam);
    }

    @GetMapping("/get-exam-by-course-id/{id}")
    public void getExamByCourseId(@PathVariable Integer id){
        service.getExamByCourseId(id);
    }
}
