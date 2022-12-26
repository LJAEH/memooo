package edu.kh.memo;

public class Polymorphism {
	
/*
  다형성 
  
  다양한 형태의 성질을 지님
  상속 + 컴퓨터 연산규칙(같은 자료형끼리만 연산 가능) + 얕은 복사
  
  상속을 이용한 기술로 부모 클래스 타입 참조변수 하나로
  상속 관계에 있는 여러타입의 자식 객체를 참조할 수 있는 기술
  
  업캐스팅
  부모타입의 참조형 변수가 모든 자식 타입 객체의 주소를 참조할 수 있음
  
  ex)
  
  car c = new sonata();
  // 부모타입 : car 부모참조형변수 c 자식타입 : sonata
   * 
   * 

  설계는 Abstract 랑 Interface
  
  추상 클래스 는 상속 + 다형성의 기술임
  
  추상화란 ? : 공통점을 추출하고 불필요한 부분 제거
  
  
  추상클래스 특징 *********
  
1. 미완성 클래스(abstract 키워드 사용)
	자체적으로 객체 생성 불가 → 반드시 상속하여 객체 생성
2. abstract 메소드가 포함된 클래스는 반드시 abstract 클래스
    abstract 메소드가 없어도 abstract 클래스 선언 가능
3. 클래스 내에 일반 변수, 메소드 포함 가능 
4. 객체 생성은 안되지만 참조형 변수 타입으로는 사용 가능

정리)
= 상속 
  - (자식클래스의) 공통된 부분을 추출하여 부모클래스를 만드는것
  -> 공통된 필드, 메서드를 가진 클래를스를 만들고, 작성된코드를 자식들이 물려받아 사용
  => *** 코드길이가 감소, 코드 중복제거, 재사용성 증가, 지식에 대한 일관된 규칙 제공
  
  
  * [일반 클래스] 상속
    부모클래스도 객체로 만들 수 있어야 하는 경우
  * [추상 클래스] 상속
    *연관된 클래스의 공통점*을 묶되, 부모클래스는 객체로 만들 수 없는 경우
    + 일부 미완성클래서(abstract 메소드 0개 이상 포함)
    ex) animal 클래스 => 동물 객체는 어떤 동물인가? eat(), breath()는
    어떻게 수행되는가 => 알수없음
    하지만, 동물은 공통된 기능명은 알고있음
    
    [인터페이스] 상속 : 접점
    *연관성이 낮거나 없는 클래스*에게 공통된 기능을 제공할때 사용'
    ex 키보드,마우스,스캐너,카메라,기울기센서(공통점 : 입력장치)
    우연히도 입력이라는 기능을 가지고 있음 => 각각의 용도는 다르지만 입력이라는
    공통된 기능명이 있음 
    입력이라는 접점,,,,
    
    + 모든 **필드가 묵시적(암묵적)**
    public static final 
    => ex) public static final double PI = 3.141592;
    (public static final)double PI = 3.14195
    + 모든 메서드가 묵시적으로 public abstract(추상메서드) 
    => 같은 이름을 제공할 뿐이지 상세한 기능 제공은 하지않는다.
    ex) (public abstract) void input()
    // input이라는 이름을 자식에게 제공할 뿐 , 상세한 기능은 자식이 알아서
     * 오버라이딩 해야하고 그런데서 추상메서드 이므로 오버라이딩 강제화 해야함
     */
  

	
	*/