# 정우 - Interceptor 실습

### #1
#### 실습 내용
* 성공
 - [x] pom.xml, application.properties 설정
 - [x] src/main/resources/static/index.html 생성
 - [x] Filter 생성
 - [x] User dto 생성
 - [x] controller 생성 (main, user)
 - [X] AInterceptor, BInterceptor, CInterceptor 생성하여 pre, post, after 출력 순서 비교
 - [x] .jsp 파일 생성 (loginForm, hello, regist)


 ================================================== 
 * 라이브 코드 보면서 진행
 - [x] LoginInterceptor 생성
 - [x] webConfig 생성 
 - [x] 확인 test

#### 리뷰
1. UserController에서 parameter-> @ModelAttribute의 역할에 대해 다시 이해
    * @RequestParam("id") String id로 잘못 입력 -> ModelAttribute로 수정
2. WebConfig와 LoginInterceptor 코드 작성 방법 이해
3. Interceptor에서 exclude("")의 역할을 이해함.

### # 2
* 성공
 - [x] pom.xml, application.properties 설정
 - [x] src/main/resources/static/index.html 생성
 - [x] Filter 생성
 - [x] User dto 생성
 - [x] controller 생성 (main, user)
 - [X] AInterceptor, BInterceptor, CInterceptor 생성하여 pre, post, after 출력 순서 비교
 - [x] .jsp 파일 생성 (loginForm, hello, regist)
 - [x] webConfig 생성
 - [x] 확인 test
 
 ================================================== 
* 혁규의 도움을 받으며 진행
- [x] LoginInterceptor 생성


#### 리뷰
1. LoginInterceptor에서 `request.getSession().getId().equals(null)` 이라고 작성
* `request.getSession.getAttribute("userId") == null`로 수정

