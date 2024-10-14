# Spring DI

## Contents
* Spring Framework
* 의존관계 역전
* 의존성 주입
* Spring Container Build
* Spring DI
  * XML
  * Annotation
  * Java Config


## Framework
### 정의
* 사전적 의미: 건물의 뼈대, (결정을 위한) 틀
* SW에서의 의미: SW 특정 문제를 해결하기 위해서 상호 협력하는 클래스와 인터페이스의 집합

### 사용하는 이유
* 웹 어플리케이션을 개발하기 위해서는 많은 기본 기능을 설계, 작성해야 한다. (요청처리, 세션관리 리소스 관리, 멀티 쓰레드 등)
*  공통으로 사용되는 기본 기능들을 일관되게 사용할 수 있으면, 개발자는 웹 어플리케이션 기능 자체 개발에만 신경을 쓰면 되기 때문에 생산성이 높아진다.
*  개발자 입장에서는 완성된 구조에 맡은 기능을 개발하여 넣어주면 되기 때문에 개발 시간을 단축할 수 있다.

### Spring Framework의 등장
* 자바에서는 EJB(Enterprise JavaBeans)를 이용하여 엔터프라이즈 급 어플리케이션 제작
  * 경량 컨테이너 사용
  * 의존성 주입
  * AOP
  * POJO 등의 개념 등장

### Spring Framework의 특징
* POJO(Plain Old Java Object) 방식의 프레임워크
* 의존성 주입(Dependency Injection)을 통한 객체관계 구성
* 관점지향 프로그래밍(AOP, Aspect Oriented Programming)
* 제어 역전(IoC, Inversion of Control)
* 높은 확장성과 다양한 라이브러리


### 왜 Spring Framework를 사용해야 하는가?
#### Spring is ...
* everywhere
* flexible
* Fast
* productive
* secure
* supportive

## 의존관계 역전
### 프로그래머와 컴퓨터(Desktop)
* Class A 객체가 어떤 일을 처리하기 위해서 Class B의 객체의 도움을 받아야만 일을 처리할 수 있다면
* 'Class A'는 'Class B'에 의존한다 라고 표현
* Programming => 객체 생성 의존성 && 타입 의존성
```java
public class Test {
	public static void main(String[] args) {
		
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있다.
		Programmer p = new Programmer();
		
		p.coding();
	}
}
```
*  프로그래머는 컴퓨터만 쓸 줄 알면 됨 => Loose Coupling, 느슨한 결합

## 의존성 주입
* 설정자(Setter) 이용
* 메서드 이용

## Spring Container Build

### Spring IoC Container
* Container
  * 스프링에서 핵심적인 역할을 하는 객체를 Bean이라고 하며,
  * Container는 Bean의 인스턴스화 조립, 관리의 역할, 사용 소멸에 대한 처리를 담당한다.
    * BeanFactory
    * ApplicationContext
    * WebApplicationContext

### 스프링 설정 정보 (Spring configuration metadata)

* 설정 정보 => XML, Annotation, Java Config 방식