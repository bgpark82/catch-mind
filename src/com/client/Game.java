package com.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {

	int cannum = 27;

	
	File quizs;
	FileReader rdtx;
	FileWriter wrtx;
	StringTokenizer k;
	String[] words = new String[cannum];
	String line = new String();
	
	public Game() {


		quizs = new File("quiz.txt");
		if (quizs.exists()) {
			System.out.println("퀴즈 파일 존재");
		} else {
			try {
				quizs.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			rdtx = new FileReader(quizs);
			wrtx = new FileWriter(quizs,true);

			if (rdtx.read() == -1) {
				line = "물랑루즈 늑대와함께춤을 신과함께 아수라 마녀 "
						+ "인랑 악마를보았다 짱구는못말려 세일러문 건담 너의이름은 "
						+ "인터스텔라 어바웃타임 포레스트검프 레옹 레미제라블 미녀와야수 "
						+ "그래비티 다크나이트 라라랜드 인셉션 위대한개츠비 쇼생크탈출 "
						+ "타이타닉 겨울왕국 명량 에일리언";
				
				wrtx.write(line);
				words = line.split(" ");
				System.out.println("입력되어 들어간 단어들 : "+ Arrays.toString(words));
				wrtx.close();

			} else {
				FileReader fr = new FileReader(quizs);
				BufferedReader qzl = new BufferedReader(new FileReader(quizs));

				words = qzl.readLine().split(" ");
				
				System.out.println("이미 있는 단어들 : "+ Arrays.toString(words));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ExtractQuiz() throws IOException {
		return this.words[(int) ((Math.random() * (cannum-1)))];

	}

}
