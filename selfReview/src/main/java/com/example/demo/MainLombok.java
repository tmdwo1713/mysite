package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor	
public class MainLombok {
	private final String hello;
	private final int lombok;
	

	public static void main(String[] args) {
		MainLombok mainLombok = new MainLombok("테스트",10);
		
		System.out.println(mainLombok.getHello());
		System.out.println(mainLombok.getLombok());
	}
}
