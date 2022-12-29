package edu.kh.memo;

public class _11_collection {
/*
컬렉션 이란 "자료 구조"의 모음

ex) List, Set, Map


배열의 문제점 & 컬렉션의 장점
*** 이 둘의 차이점을 알자
배열의 문제점
1. 한번 크기를 지정하면 변경할 수 없다.
2. 배열에 기록된 데이터에 대한 중간 위치의 추가, 삭제가 불편하다.
3. 한 타입의 데이터만 저장 가능하다.

컬렉션의 장점
1. 저장하는 크기의 제약이 없다.
2. 추가,삭제,정렬 등의 기능 처리가 간단하게 해결된다.
3. 여러 타입의 데이터가 저장 가능하다.
   => wrapper class (기본 자료형을 객체형태로 업그레이드 시켜줌)
   ex) Boolean, Character, Byte, Short, Integer, Long, Float, Double

"10" 문자형에서 Int 자료형으로 읽어옴(parse)
Integer.parseInt("10")
"13.45" 
Double.parseDouble("13.45")

배열은 크기를 지정해야하고, 한번 지정된 크기를 변경 불가하지만 
컬렉션은 크기에 제약이 없다.

배열은 중간에 값을 추가,삭제할때 개발자가 직접 코드로 로직을 짜야한다.
컬렉션은 이미 자료구조적인 알고리즘이 내장되어있다. 
메소드 호출만으로 데이터를 효율적,구조적 관리 가능하다.

배열은 한가지 타입의 여러개 데이터를 보관 할 수 있다면,
컬렉션은 별도의 제네릭 설정을 하지 않을 경우 여러타입의 여러 데이터를
보관 가능하다.

Java Collection : 자바의 자료구조 모음(List,Set,Map)
	    List,Set의 중복코드 뽑아서 만든 인터페이스 = Collection


****list 계열 주요 메소드 ppt 8page****
add , set, get, isEmpty, size, remove
set 14p


set 과 map, list를 java collection 으로 묶어서 분류함

HashSet
 



Map
키와 값으로 구성되어 있으며 둘다 객체
키는 Set방식 값은 List 방식

Key:Value (Key = Value)

Map에 담겨있는 요소들에 순차적으로 접근하기 위한 방법 2가지

1.keySet() 이용하기
 : keySet()으로 Map의 Key를 Set에 담은 후 Set에 있는 Interator 를 통해 접근
2.entrySet() 이용하기
 : entrySet()으로 Map의 키와 값을 Set에 담은 후 Set에 있는 Interator 를 통해 접근


List Interface

ArrayList : 상대적으로 빠르고 요소에 대해 순차적으로 접근할 수 있다.
Vector : ArrayList의 이전 버전이며 모든 메서드가 동기화 되어 있다.
LinkedList : 순서가 변경되는 경우 노드 링크만 변경하면 되므로 삽입, 삭제가 빈번 할 때 빠르다.

Set Interface

HashSet : 빠른 접근 속도를 가지고 있으나 순서를 예측할 수 없다.
LinkedHashSet : 요소가 추가된 순서대로 접근할 수 있다.
TreeSet : 요소들의 정렬 방법을 직접 지정할 수 있다.

Map Interface

HashMap : 중복을 허용하지 않고 순서를 보장하지 않으며 null 값을 허용한다.
Hashtable : HashMap 보다는 느리지만 동기화를 지원하며 null 값을 허용하지 않는다.
TreeMap : 정렬된 순서대로 Key와 Value를 저장하므로 빠른 검색이 가능하지만 요소를 추가할 때 정렬로 인해 오래걸린다.
LinkedHashMap : HashMap과 기본적으로 동일하지만 입력한 순서대로 접근이 가능하다.




*/
}
