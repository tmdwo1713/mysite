package com.example.simpleBoard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.simpleBoard.answer.Answer;
import com.example.simpleBoard.answer.AnswerRepository;
import com.example.simpleBoard.question.Question;
import com.example.simpleBoard.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void contextLoads() {
		/*
		 * Question q1 = new Question(); q1.setSubject("궁금합니다.");
		 * q1.setContent("질문 내용입니다."); q1.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q1);
		 * 
		 * Question q2 = new Question(); q2.setSubject("git공부가 필요.");
		 * q2.setContent("git 내용입니다."); q2.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q2);
		 */

		/*
		 * List<Question> all = this.questionRepository.findAll(); assertEquals(4,
		 * all.size());
		 * 
		 * Question q = all.get(0); assertEquals("궁금합니다.", q.getSubject());
		 */

		/*
		 * Optional<Question> op = this.questionRepository.findById(1);
		 * if(op.isPresent()) { Question q = op.get(); assertEquals("질문 내용입니다.",
		 * q.getContent()); }
		 */

		/*
		 * this.questionRepository.deleteById(1); this.questionRepository.deleteById(2);
		 * Question q = this.questionRepository.findBySubjectAndContent("git공부가 필요.",
		 * "git 내용입니다."); assertEquals(4, q.getId());
		 */

		/*
		 * List<Question> qlist = this.questionRepository.findBySubjectLike("%필요%");
		 * Question q = qlist.get(0); System.out.println(q.getSubject());
		 */

		
		 Optional<Question> q = this.questionRepository.findById(4);
		 assertTrue(q.isPresent()); 
		 Question question = q.get();
//		 question.setSubject("수정된 내용"); this.questionRepository.save(question);
		 

//		Answer a1 = new Answer();
//		a1.setContent("궁금합니다.");
//		a1.setCreateDate(LocalDate.now());
//		a1.setQuestion(question);
//		this.answerRepository.save(a1);
//		
//		for(int i=0;i<50;i++) {
//		Question q1 = new Question(); q1.setSubject("궁금합니다.["+i+"]");
//		q1.setContent("질문 내용입니다.["+i+"]"); q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		}
		
		
		
		List<Answer> qlist = this.answerRepository.findByQuestion(question);
		System.out.println("Id 4의 답글 갯수는"+qlist.size()+"입니다.");
		
		
	}
	
	

}
