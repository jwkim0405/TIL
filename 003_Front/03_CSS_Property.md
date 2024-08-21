# CSS 속성

`b 태그와 strong 태그 차이 알기`

## 크기 단위
* 내용 길이 값: px, cm, mm, in, em, rem
  * `em`, `rem`: 상대적 단위(사용 권장)
  * `r`em: r-> root
  * 내가 현재 있는 요소의 부모 혹은 루트에 의해 크기가 정해짐
* 백분율(%): 상위 block에 대한 백분율의 단위, 상위 block 크기가 바뀌면 자신의 크기도 자동으로 변경
* auto(width): 100%, 자신의 상위 block이 허용하는 width 크기만큼 채운다.
* auto(height): 0%, 높이를 결정하는 요인은 block box 속의 내용물의 크기
  * left, right를 auto로 지정하면 가운데 정렬이 됨.

<br><br>

## 색상 단위
* 색상 키워드: 대소문자 구분 X
  * ex) red, blue
* RGB 색상: 16진수 표기법 혹은 함수형 표기법으로 특정 색 표현
  * red, green, blue 삼원색의 조합
  * 
* HSL 색상: 색상, 채도, 명도를 통해 특정 색 표현
  * hue (색조) :
    * 0도: red
    * 120도: green
    * 240도: blue
    * 360도: red
  * saturation (채도)
    * 0% 회색의 음영
    * 100% 순수한 색(음영 X)
  * lightness (밝기)
    * 0% 검은색
    * 100% 흰색
* `a`lpha: 투명도(0 ~ 1.0으로 표현함)
  * 0에 가까울수록 투명도가 있고
  * 1에 가까울수록 투명도 X, 원색 보전
* 색상 사용
  * vsc
  * google color picker

<br><br>


## CSS font
* 글자의 style

### font
* font-family: 글꼴 지정
* font-size: 글자 크기 지정
* font-style: 글자 스타일 지정
  * style과 weight 잘 구별하세요! 굵기는 weight로 사용.
  * 기울기를 주고 싶을 때 style !
  * 기본값: normal
  * italic
  * oblique
    * 일반 폰트를 기울여준 것
    * -90~0, 0~90 각도를 조절할 수 있음
* font-variant: 소문자를 작은 대문자(small-caps)로 변형
* font-weight: 글자 굵기 지정
  * 굵기 100 ~ 900
  * 일반 400
  * 굵게 700
* font: font에 관한 속성을 한 번에 지정하는 단축형(short hand) 속성

### 폰트 불러오기
* html 폰트 `link`로 import 글꼴 파일 불러오기
* CSS -> font-family: 글꼴 지정

<br><br>

## CSS text
* 글자의 정렬, 글자의 속성

### text
* text-align: 정렬 방식 지정
  * left, right, center, justify(크기에 딱 맞게 글자 사이 정렬)
  * 
* text-decoration: text 장식 지정
  * none
  * underline
  * overline
  * line-through : 취소선
  * ~~blink~~ IE 
* text-indent: text-block 안 첫 라인의 들여쓰기 지정
  * px, cm, mm, em, rem
  * 음수도 가능
* text-transform
  * text 대/소문자화
  * capitalize: 앞글자만 바꿔줌
  * uppercase
  * lowercase
  * none
* white-space: 요소(element) 안의 공백 지정
  * normal
  * `pre`
  * `pre-line`
  * nowrap: 흘러넘침!
  * `pre-wrap`: 아래로 내려감!
* vertical-align: 수직 정렬 지정
  * left, right, center, justify
* letter-spacing: 문자 간의 space 간격을 줄이거나 늘림
  * 김 정 우 => 각각의 문자 간 간격
* word-spacing: 단어 간의 간격 지정
  * space bar 기준 => 한 단어 간 간격
* line-height: 줄 간격 지정
  * 위 아래!
* color: text 색상 지정
  * 글자 색상!

<br><br>

## CSS background

### background

`html: css 관련된 head => href`<br>
`html: 브라우저 보여진다 -> src`<br>
`css: 모두 다 url`<br>
url('경로')



* background-color
* background-image
  * div main a p span 등 모든 태그 지정 가능
  * url로 넣어줌
* background-attachment
  * 배경 이미지를 고정하거나 scroll 여부를 지정
* background-repeat
  * 배경 그림의 반복 여부를 지정
* background-position
  * 배경 그림의 위치를 지정  
* background
  * 배경 관련 속성을 한 번에 지정
  * font 속성과 달리 속성 값 순서에 구애받지 않음
* background-size
  * 배경 이미지 크기 조절
* background-clip
  * 배경 적용 범위 조절

<br><br>

## CSS box model

### box model
* 모든 HTML 요소는 box 형태로 되어 있음
* 네모의 세상 - '멈무미' 
* 종류
  * `margin`
  * `border`
  * `padding`
  * `box-sizing`

### margin
* margin 속성은 box의 마진 영역의 너비를 지정
* 값 1개 -> 모든 면 적용
* 값 2개 -> {top, bottom}, {right, left}
* 값 3개 -> {top}, {right, left}, {bottom}
* 값 4개 -> top, right, bottom, left 순으로 적용
* margin: 0 auto를 통해 가운데 정렬이 되도록 설정 가능
* 마진 상쇄(사라짐) 현상이 일어날 수 있음

### border
* border-style: 선의 모양
* border-width: 선의 굵기
* border-color: 선의 색상
* 위의 세 속성을 줄여서 `border`에 한 줄로 사용 가능 
* border-radius: 선의 모서리를 둥글게 만드는 속성
* box-shadow: 그림자 효과

### padding
* padding 속성은 box의 패딩 영역의 너비를 지정
* 값 1개 -> 모든 면 적용
* 값 2개 -> {top, bottom}, {right, left}
* 값 3개 -> {top}, {right, left}, {bottom}
* 값 4개 -> top, right, bottom, left 순으로 적용

### box-sizing
* 기본적으로 모든 요소의 box-sizing은 content-box padding을 제외한 순수 contents 영역만을 box로 지정
* border까지의 너비를 크기로 보기 원할 때
  * box-sizing: border-box

<br><br>

## CSS display

### display: block
* 줄바꿈이 일어나는 요소
* 화면 크기 전체의 가로 폭을 차지
* 블록 레벨 요소 안에 인라인 레벨 요소가 들어갈 수 있음
* inspector를 통해 여백 확인!
* 대표적인 블록 레벨 요소
  * `div`
  * `ul`, `ol`, `li`
  * `p`
  * `hr`: 수평선
  * `br`: 개행
  * `form`: form 태그는 블록 요소이지만, form tag 안에 input, button 등의 요소는 inline 요소
  * ...

### display:inline
* 줄바꿈이 일어나지 않는 행의 일부 요소
* content 너비만큼 가로 폭을 차지
* width, height, margin-top, margin-bottom을 지정할 수 없음
* 상하 여백은 line-height로 지정
* 대표적인 인라인 레벨 요소
  * `span`
  * `a`
  * `input`, `label`
  * `b`, `em`, `i`, `strong`

```css
span {
    display: block;
}
```


### display: inline-block
* block과 inline 레벨 요소의 특징을 모두 갖고 있음
* inline처럼 한 줄에 표시 가능
* block처럼 width, height, margin 속성 지정 가능

### *** `display: none`
* 해당 요소를 화면에 표시하지 않음(공간x, 화면x)
* display: none과 visibility: hidden을 구분하기
  * `visibility: hidden;` 은 해당 요소(공간 o 화면 x)

<br><br>


## CSS position
### position
* static: (기본) 일반적인 내용물의 흐름, 상단, 좌측에서의 거리를 지정할 수 없음
* relative: HTML 문서에서의 일반적인 내용물의 흐름을 말하지만, top, left 거리를 지정
* absolute: 자신의 상위 box 속에서의 top, left, right, bottom 등의 절대적인 위치를 지정
* fixed: 스크롤이 일어나도 항상 화면상의 지정된 위치에 있음
  * footer: 보통 사이트에 관련된 정보들을 모아놓음.   
<br><br>

## CSS float
### float
* float 속성은 박스를 어느 위치에 배치할 것인지를 결정하기 위해 사용
  * 요즘 잘 안 씀
  * none
  * left
  * right

### clear
* float 속성이 가지고 있는 값을 초기화하기 위해 사용

<br><br><br><br>

# Flexbox

* Flexible Box module은 인터페이스 내의 아이템 간 공간 배분과 강력한 정렬 기능을 제공하기 위한 1차원 레이아웃 모델로 설계
* Layout을 위한 것!


### 주요 개념
* `Main Axis`(주축), `Cross Axis`(교차축)
* 시작선(start), 끝선(end)
* Container와 item

## Flex Container

* display 속성을 이용하여 container를 생성
* `display: flex;` -> block 성격의 container
* `display: inline-flex;` -> inline 성격의 container

### Flex Container 속성
* `flex-direction`: container 안의 item들의 나열되는 방향
  * row(start->end)
  * column(start: 위, end: 아래)
  * row-reverse(end<-start)
  * column-reverse(아래->위)

* `flex-wrap`: container 안의 item들의 크기가 container의 크기보다 클 때 <ins>줄 넘김</ins>
  * nowrap
  * wrap -> 가장 많이 씀
  * wrap-reverse
  
* `flex-flow`: 방향과 줄 넘김을 동시에 설정(direction, wrap을 동시에!)
  * row nowrap
  * column nowrap
  * row wrap

* `justify-content`: 메인 축의 정렬을 제어
  * flex-start : left로 생각(start방향에서 쭉쭉 모아주기)
  * flex-end : right로 생각(끝방향으로 끌어당겨놓기)
  * center
  * space-evenly: 요소들 제외하고 다 똑같이 여백이 주어짐
  * space-between: 끝에 딱 붙어 있고 일정한 간격(여백 margin)
  * space-around: 요소의 양 끝 여백이 똑같음


*  `align-items`: 교차 축의 정렬을 제어
    * flex-start
    * flex-end
    * center
    * baseline
    * stretch : 다 뻗쳐버러

*  `align-content`: wrap 속성에 의해서 여러 줄이 발생한 경우의 교차 축 정렬
   *  1 1 1 1 1
   *  1
   *  위와 같이 wrap에 의해서 내려온 경우 왼쪽이 아닌, 가운데로 만들어준다!
*  

