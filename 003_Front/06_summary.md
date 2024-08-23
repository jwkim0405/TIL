# HTML

* 태그
  * block
  * inline
* 속성
* 수업에서 강조한 내용들있음

<br><br>

# CSS
* 속성들의 특징들을 많이 알고 있어야 함
* 선택자를 어떻게 가져오는 것인지
* 결합자 어떻게?
* workshop -> 뭐가 선택이 될 것이다 알아야 함
* link -> href
* font: link, css에 import

<br><br>

# JS
* 배열에 들어가는 메서드
* var의 특징
* let과 const의 특징
* scope가 어디까지 가는 것인가, 재선언 재할당이 어디까지 되는 것인가
* undefined, null의 차이점
* 배열의 크기가 정의되어 있지 않고 arr[] arr[0] = 1 arr[2] "윤준 arr[1] -> undefined
  * arr 길이는 3, undefined라는 값이 들어가있는 것임
* DOM, EVENT 어떤 메서드로 접근하는 것인지 공부

<br><br>

# Summary

1. semantic tag인 것 / 아닌 것
   * div, span은 semantic  tag 가 아님
   * header footer h1은 semantic

2. position: default값이 `static`
3. `<a href =""><a>` 속성 값들은 열린 태그에 넣어야 함
  * css가져올 때 `link tag 안에 href`!
  * script -> src를 쓰기
4. js 문자열과 숫자 : +를 제외하고 숫자 연산이 됨(`+` 연산자는 무조건 문자로 반환이 됨)
  * 문자 - 숫자 : "백"-2 (error)
5. js에는 선언식과 표현식이 있음 -> function 함수이름
```js
// 표현식
function seven

// 선언식
seven = function(){}
```
6. var let const -> 스코프의 차이
* var -> 함수 스코프 / `hoisting` -> 위에서 가져와서 출력해보면 undefined
  * 재선언 가능, 재할당 가능
* let -> 블록 스코프
  * 재선언 불가, 재할당 가능
* const -> 블록 스코프
  * 재선언 불가, 재할당 불가

7. 화살표 함수가 시험에 나오면 무시하자
8. js 반복문 -> for in, for of, for each
   * for `sth` in: 안에 들어가면 객체는 (key) 배열은 (index)가 튀어나옴
   * for `sth` of: 안에 들어가면 객체는 x 배열은 요소가 튀어나옴
   * `(복습하자!!)` 객체 forEach(function(a){ })

9. input tag

   * <input value ="초기값" placeholder="미리보기">
   * `<input value ="초기값" placeholder="미리보기">`
   * disabled, inputTag 속성들 보기

10. js는 배열의 크기를 지정할 필요 없음. 동적 할당이 가능
  ```js
  arr = [ ]
  arr[0] = "진호"
  arr[99] = "엘사킴"
  arr[44] = "우리 금쪽이 윤준이!"

  arr.length -> 100
  arr[1]: undefined
  arr 진호 ... undefined, ...
  ```

  ```js
  arr = [ ]
  ```


  ```js
  function ssafy() {

  }

  arr = [1, true, ssafy(12), "싸피"]
  arr.pop() // 마지막 원소 삭제
  arr.push() // 마지막에 추가
  arr.unshift() // 맨 앞에 추가
  arr.shift() // 맨 앞 삭제

  ```

11. 
  ```css
    display:flex;
    flex-direction: row;
    flex-wrap: wrap;
    flex-flow: row wrap 
    
-------main axis----------
            |
            |
        cross axis
            |
            |

    justify-content: start end center space-between space-around space-evenly
        start:        1 2 3 =====================
        end:          ======================1 2 3
        center:       ===========1 2 3===========
        space-between:1============2============3
        space-around: ====1========2========3====
        space-evenly: ======1======2======3======

  align-items: start end center baseline(이것 뭐에요?) stretch(꽉 채우는 것) 


  ```

12. 비교 연산자 ==
    * 일치 연산자 ===(타입과 값이 모두 같아야 함)


13. css 박스

* margin: 가장 바깥 테두리(border 밖)
* border: 그 안쪽 
* padding: 그 안쪽(border 안)
* box-sizing: 젤 안쪽

<br>

14. 
* 값 `시계방향`으로 들어감(달팽이!)
  * 1개: 상하좌우 다
  * 2개: 위아래 / 좌우
  * 3개: 상 /  좌우 / 하
  * 4개: 상 우 하 좌

* box-sizing을 border까지 차지하고 싶어. => `border-box`로 지정하기!

15. 선택자 우선순위
  * A: `*`
  * B: `!important`
  * C: `태그`
  * D: `.`
  * E: `#`

약한-> 강한: A < C < D < E < B


16. 
    * display:none => 공간 X 화면 X
    * visibility: hidden => 공간 O, 화면 X

17. flex 공부하기
  * flex-grow: 부모 크기에 비례해서 크기 늘리기/줄이기 
  * flex-flow: 방향과 흘러넘침 표현

18. background, font, text

* div tag에 배경화면을 바꾼다고 하면 background-image, 배경색을 바꾼다고 하면background-color

19. null, undefined, 0(있긴 있는데 값이 0인 것), NaN(숫자가 아닌 것, 있긴 한데 사용할 수 없는 형태) 차이
20. form tag 안에 다양한 input값들이 있는데, 이것들은 어떻게 묶어줌? `fieldset` 으로 묶어줌
21. input tag가 있고 textarea tag가 있을 때, tag 사이에 값이 들어가는 공간 : input-label, textarea-legend
22. window 함수 중에서 Ctrl+C 못하게 함
23. 알림을 주고 싶을 때 => alert
  * 확인과 취소를 받고 싶어 => confirm(yes or no로 받음)
