# CSS

* CSS Diner, Flexbox Froggy 반복하면서 개념 잘 익히기!


## 질문

* `.gitignore에서 *.py와 .py는 같은 의미인가요????????????????????????????????`
* `button의 기본형은 submit?!`

## `새로운 정보`
* .small:last-child -> last-child의 속성과 small class의 속성을 모두 가지고 있는 것들을 의미함. / small class들 중에서 last-child를 의미하는 것이 아님 주의!
* flex-direction: column이 되는 경우 justify-content는 위아래, align-items는 좌우를 의미한다. /원래 row일때와 역할이 서로 반대!
* align-content는 줄 간격을 의미한다!


## Contents
* CSS 개념
* CSS 선택자
  * 전체, 유형, 아이디, 클래스, 특성
* CSS 결합자
  * 자손, 자식, 일반 형제, 인접 형제

<br>

## CSS 개념
* Cascading Style Sheets
* HTML 문서를 화면에 표시하는 방식을 정의한 언어
* 웹 문서의 내용과 관계없이 디자인만 바꿀 수 있음
* 다양한 기기에 맞게 `반응형`으로 바뀌는 문서를 만들 수 있음
* `Can I use`: 웹 브라우저별 CSS3 지원

### 기본 구조
```css
/* 선택자(Selector) */
.box { 
    /* 선언부(Declaration) */
    /* 속성(Property) : 값(Value) */
    background-color: red;
    width: 10rem;
    height: 2rem;
    border: black 1rem dotted;
}
```

* 깨알 팁: HTML에서의 속성 Attribute, CSS에서의 속성 Property

### 주석
* 주석의 내용은 style 탭에 표시되지 않음
  * 'source'나 'element' 탭에서는 확인 가능
  * `HTML은 어땠더라??!`


### CSS 적용 방법

#### 1. External Style sheet - 외부 스타일 시트
* 외부에 작성된 css 파일을 불러와서 스타일을 적용시키는 방식
* `<head>` 안에 `<link>`를 사용하여 외부 스타일 시트 적용
* href 속성에 css 파일의 경로 작성 (rel 속성값은 `stylesheet`)
* 상대경로 쓰기 !

```html
<head>
    <link rel = "stylesheet" href="style.css">
</head>
```

* CSS 코드 쓸 때 선언부 이후에 한 칸 띄워주는 것 관행 => 1 space bar
* 그 다음 줄 4 space bar
  * html 2
  * css 4
  * js 2

#### 2. Internal Style Sheet - 내부 스타일 시트
* 길지 않을 내용을 때 사용하는 편
* `<head>` 안에 `<style>` 사용
  * ~~`<body>`~~ 태그 안에 넣는 것 아닙니다!!!
  * CSS 파일에 작성하는 내용과 동일하게 작성
* 외부 스타일 시트보다 우선 적용




#### 3. Inline Style
* 요소의 태그에서 `style 속성`을 사용하여 속성값으로 스타일을 적용시키는 방식
* 디버깅에 최악!
* 웬만하면 좀 쓰지 말기!!!
```html
<body style ="background-color:yellow">
    <h2>김정우</h2>
</body>
```


### CSS 적용 우선순위
1. Inline Style
1. Internal Style Sheet
1. External Style Sheet




<br>

## CSS 선택자
* HTML 문서에서 CSS 규칙을 적용할 요소를 정의


* 기본 선택자
  * 전체 선택자(General Selector) `*`
  * 유형 선택자 `요소(태그명)`
  * 아이디 선택자 `#` => 중복 불가능!!
  * 클래스 선택자 `.` => 중복 가능 !!
  * 특성 선택자 `[attribute]`

* 그룹 선택자
  * 선택자 목록 `,`

```html
<h1 id = "mom">
<!-- 같은 class명을 여러 번 사용할 수 있음 -->
<h2 class = "baby"> 안녕 김정우 </h2>
<h2 class = "baby"> 안녕 조홍균 </h2>

<p name = "hg"> magic </p>
```

```css
/* hash tag: id명이 mom인 것들  */
# mom 
p.smart[name="hg"]
```







<br>

## CSS 결합자

* 결합자
  * 자손 결합자 `공백`
  * 자식 결합자 `>` => ㄴ자 표시
  * 일반 형제 결합자 `~`
  * 인접 형제 결합자 `+`
* 의사 클래스 / 요소
  * 링크, 동적 의사 클래스 (Pseudo Class)
  * 구조적/기타 의사 클래스, 의사 엘리먼트, 속성 선택자
  
* 우선순위, 상속
  * 같은 요소에 두 개 이상의 CSS 규칙이 적용된 경우
  * 마지막 규칙, 구체적인 규칙, !importatnt가 우선 적용
  * 순서(아래로 갈수록 힘이 강해짐)
  1. `*`
  2. `.`
  3. `#`
  4. `인라인`
  5. `!` 

  ```css
  .my-name {
    color : magenta !important;
  }
  ```
* 상속
  * 부모 요소에 적용된 스타일이 자식 요소에게 상속이 될 수도 있고, 안 될 수도 있음
  * 상속되는 속성
    * 요소의 상속되는 속성에 값이 저장되지 않은 경우, 요소는 부모 요소의 해당 속성의 계산 값을 얻음
    * 대표적인 예시는 color 속성
  * 상속되지 않는 속성
    * 요소의 상속되지 않는 속성에 어떤 값이 지정되지 않는 경우, 요소는 그 속성의 초기값을 얻음
    * 대표적인 예는 border, padding, margin, width 속성


### 자식 결합자
* Child Combinator
* 첫 번째 요소의 바로 아래 자식인 노드를 선택
* `>` 를 사용
* 사용법

```css
selector1 > selector2 { style properties }
```


### 일반 형제 결합자(Subsequent Sibling Combinator)
* 첫 번째 요소를 뒤따르면서 같은 부모를 공유하는 두 번째 부모를 모두 선택

### 인접 형제 결합자(Adjacent Sibling Combinator)
