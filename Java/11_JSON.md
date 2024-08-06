# Java 관통

## JSON
* JavaScript Object Notation
* 자바스크립트를 토대로 개발된 데이터 포맷
* 자바스크립트 객체를 문자열로 나타낸 것(이진 데이터가 아닌 텍스트 데이터)
* 여러 프로그래밍 언어에서 사용할 수 있는 독립형 데이터 형식
* 웹 클라이언트와 웹 서버 간 데이터 교환에 사용
* 웹 브라우저 비동기 처리에 사용되는 AJAX의 데이터 교환 형식으로 널리 알려짐
  * AJAX: Asynchronous Javascript And XML

* 자바스크립트의 객체
  * ES6(ECMA2015)부터 클래스가 도입되었으나,
  * 자바스크립트에서는 일반적으로 객체 리터럴을 이용해서 객체를 생성
  * 중괄호 {} 안에 key-value 쌍을 나열하여 객체를 정의
  * value에 메서드(함수)가 올 수 있음(자바스크립트에서 함수는 일급 객체)
```javascript
const person = {
    name = 'Alice',
    age: 30,
    greet: function() {
        console.log('Hello');
    }
}
```

## GSON
* GSON은 JAVA 객체를 JSON 표현으로 변환할 수 있는 Java 라이브러리
* 구글에서 개발
* toJson() 메서드: Java 객체를 JSON 문자열로 변환
* fromJson() 메서드

## ChatGPT를 프로젝트에서 활용하는 방법
* 코드 리뷰 및 최적화
* 설계 조언 및 피드백