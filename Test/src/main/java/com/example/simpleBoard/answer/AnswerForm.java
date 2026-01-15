package com.example.simpleBoard.answer;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
	
	@NotEmpty(message="내용은 필수입니다")
	@Size(max=99, message="100글자 미만으로 입력 가능합니다.")
	private String content;
}
