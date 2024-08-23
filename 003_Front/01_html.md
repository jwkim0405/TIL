# HTML

## HTML 개념
* Hyper Text Markup Language
* Hyper Text: 참조를 통해 한 문서에서 다른 문서로 즉시 접근할 수 있는 텍스트
* Markup: 태그(Tag)
  * Markup: 태그로!
  * Markdown: 기호로!
* <ins>웹페이지를 작성하기 위한 언어</ins>
* `.html` 확장자를 가짐
* 태그(Tag)는 <ins>대소문자 구분이 없음</ins>
  * 소문자로 쓰는 걸 추천!
* `Enter` `Tab`이 적용되지 않음( 안 먹힘 )
  ```html
  <h1>김 정우</h1> # 공백 포함됨
  <h1> 김정우</h1> # 공백 포함안됨
  ```
* 마크업 스타일
  * 1 indent == 2 space bar

<br><br>

## 기본 구조

* `<!DOCTYPE>`
  * HTML 문서가 따라야 할 일종의 오랜 약속이나 작성하지 않아도 잘 작동함
* `<html></html>`
  * HTML 최상위 요소로 페이지 전체의 컨텐츠를 감싸는 root 요소
  * 문서 내에서 사용할 문자코드를 lang 속성에 지정
* `<head></head>`
  * HTML 문서에 표현하고 싶은 구성 요소 외의 재료들을 담고 있는 공간
  * 페이지 이름, CSS, favicon 등을 작성
  * 브라우저 화면에 출력되지 않음

* `<meta>`
  *  문서의 작성자, 날짜 등 화면에 출력되지 않는 일반 정보들
  *  `charset = "utf-8"` : HTML 문서가 사용할 문서 형태 지정
*  `<title></title>`
*  `<body></body>`

<br><br>

## 요소와 태그

* HTML의 `요소(Element)`는 <ins>태그(Tag)와 내용</ins>으로 구성
* Opening Tag && Closing Tag
  * 각각의 시작태그(Opening Tag)는 속성을 가질 수 있음.
* Contents: Enter, Tab, space 작동 X
```HTML
<a href = "https://naver.com/"> 네이버 </a>
```


#### 요소 중첩
```html
<p> You can call me <strong>Kyu</strong>.</p>

<span>Like a <b>magic</b>.<i>-Hong Gyun-</i></span>
```
#### 닫는 태그의 생략 - 빈 요소

```html
<img src = "./assets/img/dixon.png" alt = "Dixon />
```
## 주석

* 주석의 내용은 브라우저에 출력되지 않음
* 개발자 도구에서는 주석 내용 보임!
  * CSS는 주석 내용이 아무 곳에서도 안 보임
* HTML Tag의 내용을 설명하기 위한 용도로 사용


```html
<!--HTML 주석 내용 -->
```

<br>

## 특수문자

* 사진 첨부

<br>

## Semantic Tag
* 의미론적 요소를 담은 태그
* 코드의 가독성을 높이고 유지보수를 쉽게 할 수 있음
* 다양한 형식으로 활용 가능하며 정석/정답은 없음
* 브라우저에 표시되는 정보를 태그로 표현
* 단순히 구역을 나누는 것 뿐만 아니라, <ins>구조</ins>를 나누는 데에 <ins>의미</ins>가 필요
* 요소의 의미가 확실하기 때문에 코드의 가독성 뿐만 아니라 유지보수가 용이

#### 종류
  * `<header>` : 문서의 시작
  * `<nav>` : 네비게이션
  * `<aside>` : 사이드에 위치한 공간
  * `<section>` : 문서의 일반적인 구분
  * `<article>` : 문서, 페이지, 사이트 안에서 독립적으로 구분되는 영역
  * `<footer>` : 문서의 끝
  * `<h1>` ~ `<h6>` : 제목

<br>

## Inline Text Content
* a와 span은 꼭 구분하기!
  * `<a>` : href 속성을 통해 지정된 경로를 연결하는 하이퍼링크 생성
    * hyper text 넣을 때!
  * `<span>`: 구문 콘텐츠를 위한 인라인 컨테이너
    * 글자만 넣을 때!

<br>

## Image & Multimedia
* `<audio>`
* `<img>`: 문서에 이미지 삽입
    ```html
    <img src = "잘못된 경로" alt = "딕슨">
    ```
* `<image>`
* `<iframe>`

## Table Content
* Table이 보여지는 것
  * `<table>`
    * `<thead>`
    * `<tbody>`
    * `<tfoot>`
  * `<tr>`
```html
<tr>
    <td> 1 </td>
    <td> 2 </td>
</tr>
```

|1열 | 2열|
|:-:|:-:|
|1  |2  |



## form

* 사용자로부터 데이터를 입력받아 서버에 처리하기 위한 용도로 사용
* 사용자가 작성한 <ins>데이터를 서버로 전송</ins>(submit)

|속성 | 설명|
|:-:|:--|
|method |GET: 주소 표시줄에 사용자가 입력한 내용이 표시 <br> * 보안에 취약  <br> * parameter가 url에 노출됨 <br> * query string에 담겨서 전송됨<br><br>POST: HTTP 메세지의 Body에 담아서 전송해서 내용의 길이에 제한이 없음<br> * 사용자가 입력한 내용이 표시되지 않음.|
|name |form의 이름을 지정|
|action |<form> 태그 안의 내용들을 처리해줄 서버 상의 프로그램 지정(URL)|
|target | <action> 태그에 지정한 스크립트 파일을 현재 창이 아닌 다른 위치에서 열도록 지정|




