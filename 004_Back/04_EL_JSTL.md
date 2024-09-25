# EL & JSTL

## Contents
* JSP Review
* EL (Expression Language)
* JSTL (JSP Standard Tag Library)


## JSP Review
1. `<% %>`: Java 코드 Servlet 변경 후 service 메서드 안에
2. `<%! %>` : 함수, 변수 선언 -> 클래스 영역
3. `<%= %>` : 표현식
    * `;` 안 들어가요! 
    * `out.print();`
4. `<%-- %>` : 주석
    * Servlet으로 변환할 때 바뀌지 않는다.
    * Servlet으로 변환할 때부터 없어짐 -> 클라이언트에 노출 X
5. `<%@ %>` : 지시자
   1. page -> 정보
   2. include
   3. taglib (tag library) -> JSTL


## EL (Expression Language)

* EL 표현식은 JSP 내에 데이터를 다루는 데 사용되는 스크립팅 언어
* JSP 스크립트의 표현식(`<% %>`)을 대신하여 속성값을 쉽게 출력할 수 있도록 고안된 언어
* 