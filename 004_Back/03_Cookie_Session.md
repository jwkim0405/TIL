# Cookie & Session

## Contents
* Http
* Cookie
* JSP 기본객체 영역
* Session


## HTTP
### 인터넷 프로토콜
* 인터넷에서 데이터 통신을 위한 표준화된 규약이나 규칙
* TCP (Transmission Control Protocol)
* UDP (User Datagram Protocol)

### HTTP
* Hyper Text Transfer Protocol
* 웹 서버와 웹 브라우저 간의 통신에 사용
* HTML, IMAGE, VIDEO, JSON 등의 다양한 데이터 전송 가능
* 기본 포트번호: 80
  * 직접 설정할 수도 있다.
  * tomcat 기본 포트번호: 8080
* 보안 버전의 HTTPS (Hyper Text Transfer Protocol Secure)가 있음. (기본 포트번호: 443)
* 클라이언트 - 서버 구조
  * 클라이언트: 요청을 보내는 쪽
  * 서버: 요청을 받는 쪽
* 우리는 HTTP 1.1 version을 쓰고 있다!
  * HTTP 1.1 -> TCP 통신을 주로 한다
  * HTTP 3 -> QUIC -> 속도를 올리고 있음

### HTTP 특징
* 비 연결성 (Connectionless)
  * 지속적인 연결 유지로 인한 <ins>자원낭비 방지를 위한 연결 해제</ins>
  * 서버의 자원을 <ins>효율적</ins>으로 사용할 수 있음

* 무 상태 (Stateless)
  * 서버가 클라이언트의 상태를 저장하지 않음
  * 클라이언트의 상태를 알 수 없기 때문에 추가적이 데이터 전송이 필요함
  * 응답 서버를 쉽게 바꿀 수 있음
  * 브라우저 <ins>**쿠키 or 서버 세션**</ins> 등을 이용하여 상태유지

### HTTP 상태 코드
* 1XX: Informational responses (정보 응답)
* 2XX: Successful responses (**성공** 응답)
* 3XX: Redirection responses (`?????????????`)
* 4XX: Client error responses (클라이언트 잘못!!)
  * 404: Page Not Found
* 5XX: Server error responses
  * 사용자에게 500번대 에러가 노출된다면 so critical -> 내가 잘못 만들었다는 것을 보여주는 것


## Cookie
* 웹 서버가 클라이언트의 웹 브라우저에 저장하는 작은 데이터 조각
* 필요에 따라 요청(request) 시 서버로 같이 전송
* Key: Value 형태의 문자열 데이터
* 웹 브라우저(클라이언트) 별로 별도의 쿠키 생성 (브라우저가 다르다면 다른 사용자!)

### Cookie 사용 목적
* 세션 관리(사용자 아이디, 장바구니 등)를 위해 사용
* 사용자가 설정한 환경 등을 기억하여 페이지 제공
* 사용자의 행동과 패턴을 분석
* <ins>사용자의 관심에 따른 광고를 타겟팅하기 위해서 사용</ins>

### Cookie 동작 순서
* Client가 요청 생성
* WAS는 Cookie를 생성하고 HTTP Header에 Cookie를 넣어 응답
* Client(Browser)는 Cookie를 저장, 해당 서버에 요청할 때 요청과 함께 Cookie를 전송
* Cookie는 브라우저가 종료되더라도 계속 저장되기 때문에 (만료 기간 전까지) 동일 사이트 재방문하여 요청 시 필요에 따라 Cookie가 재전송됨

### Cookie 특징
* 이름(key), 값(value), 만료일(Expire date), 도메인경로(path) 등으로 구성된다.
* 클라이언트에 최대 300개의 쿠키를 저장할 수 있다.
* 하나의 도메인당 20개의 쿠키를 저장할 수 있다.
* 쿠키 하나당 4KB 제한

### Cookie 주요 메서드
* `void setComment(String comment)` : 쿠키에 대한 설명 설정
* `void setDomain(String domain)` : 쿠키의 유효한 도메인 설정
* `void setMaxAge(int expiry)` : 쿠키 유효기간 설정


## JSP 기본객체 영역`??????`
`다시 공부하세요`
* Page 영역
  * 웹 어플리케이션 영역
  * 어플리케이션이 시작되면 종료될 때까지 유지
* Request 영역
  * 하나의 웹 브라우저와 관련된 영역
  * 로그인 정보 등을 저장
* Session 영역
  * 하나의 요청을 처리할 때 사용되는 영역
  * 응답이 완료되면 사라짐
* Application 영역
  * 하나의 페이지 정보를 담고 있는 영역
  * 페이지가 바뀌면 새로운 객체가 생성됨

## Session

### session
* 사용자가 웹 서버에 접속해 있는 상태를 하나의 단위보고 세션이라고 한다.
* 각 세션은 sessionid를 이용해 구분한다.
* WAS의 메모리에 객체 형태로 저장
* 메모리가 허용하는 용량까지 제한없이 저장 가능
* <ins>쿠키는 클라이언트에 저장</ins>되기 때문에 공유 PC의 경우 보안에 취약할 수 있다. 하지만 <ins>세션은 서버에 저장</ins>되기 때문에 쿠키에 비해 보안이 좋다.
* <ins>사용자(로그인) 정보 및 장바구니</ins> 등에 사용한다.

### session 동작 순서
* 클라이언트가 페이지를 요청
* 서버는 쿠키에 session id가 있는지 확인한다.
* session id가 존재하지 않으면 session id를 생성해 쿠키에 쓴 다음 클라이언트로 반환
* 생성된 session id를 이용하여 서버 내 메모리를 생성
* 클라이언트가 다음 요청 시 쿠키에 session id(JSESSIONID)를 포함해 전달하면 서버 내에 저장된 session id와 비교하여 데이터를 조회 

