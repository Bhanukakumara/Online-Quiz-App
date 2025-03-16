package edu.bks.service.impl;

import edu.bks.dto.Exam;
import edu.bks.entity.ExamEntity;
import edu.bks.repository.ExamRepository;
import edu.bks.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    final ExamRepository repository;
    final ModelMapper modelMapper;
    @Override
    public void createExam(Exam exam) {
        repository.save(modelMapper.map(exam, ExamEntity.class));
    }

    @Override
    public Exam getExamByCourseId(Integer id) {
        return modelMapper.map(repository.getByCourseId(id), Exam.class);
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer id) {

    }
}
