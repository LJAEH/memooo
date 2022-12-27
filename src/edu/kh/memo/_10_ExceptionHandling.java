package edu.kh.memo;

public class _10_ExceptionHandling {

/*
프로그램 오류
 프로그램 수행시 발생한 에러
 

오류의 종류
1. 컴파일 에러 : 개발자의 실수인 경우 소스코드상 문법 에러 소스코드 수정으로 해결
2. 런타임 에러 : 주로 if문으로 에러 처리
3. 시스템 에러 : 컴퓨터 오작동 소스코드 수정으로 해결 불가

Unchecked Exception = 확인 굳이 안해도 되는 예외 : 선택적 예외처리
 => Runtime Exception => ...

Checked Exception = 확인을 꼭 해야만하는 예이 : 예외처리 필수



try~catch문을 이용하여 예외 처리
- try : Exception 발생할 가능성이 있는 코드를 안에 기술
       => 수행 중 예외 발생시, 예외객체가 던져짐(throw)
- catch : try 구문에서 Exception 발생 시 해당하는 Exception에 대한 처리 기술
		  여러 개의 Exception 처리가 가능하나 Exception간의 상속 관계 고려해야 함
	   => 예외를 잡아 처리했기 때문에 프로그램이 종료되지 않음
- finally : Exception 발생 여부와 관계없이 꼭 처리해야 하는 로직 기술
중간에 return문을 만나도 finally구문은 실행되지만
System.exit();를 만나면 무조건 프로그램 종료
주로 java.io나 java.sql 패키지의 메소드 처리 시 이용



















*/	
}
