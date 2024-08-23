# DOM

<br>

## DOM이란?
* 문서 객체 모델(`Document Object Model`)
* XML, HTML 문서의 각 항목을 계층으로 표현하여 생성, 변형, 삭제할 수 있도록 돕는 인터페이스
* 상단의 document 노드를 통해 접근

<br>

## DOM의 주요 객체
* `window`
* `document`

<img src="https://velog.velcdn.com/images%2Fjuhan%2Fpost%2Fdc80e7cd-458c-4a01-b97c-f9a471157458%2Fimage.png" width = 400>

<br>

## window
* DOM을 표현하는 창

### window 제공 메서드

* `alert`
* `confirm`
* `prompt`
* `open`
* `parseInt`
* `parseFloat`
* `setTimeout` , `clearTimeout`
* `setInterval` , `clearInterval`


```js
window.alert("Hello SSAFY")
alert("Hello SSAFY")

confirm("Good days")
```
<br>

## document

* document는 window의 속성
* 브라우저에 렌더링된 웹 페이지
* 우리가 보고 있는 웹페이지의 최상단
* `document` 키워드로 접근

```js
window.document.title

document.title
document.title("싸피월드")
```

<br><br><br>

## DOM 조작
* Document가 제공하는 기능을 사용해서 웹 문서를 조작
* DOM 조작 순서

    1. 접근(Select)
    2. 조작(Manipulation)
        * 생성
        * 추가
        * 수정
        * 삭제

### DOM 문서 접근

#### `getElementById("string")`
  * id의 <ins>이름</ins>으로 첫 번째 요소를 반환
  * camelCase로 작성해야 함
    ```js
    let ele = document.getElementById("a")  // 반환값: div#a.b
                                            // 존재하지 않는 id값인 경우 null을 반환
    ```
    ```html
    <main>
        <h2> 테스트 </h2>
        <div id = "a" class = "b"> 혜민 </div>
        <div  class = "b"> 재현 </div>
    </main>
    ```

<br>

#### 🧨 `querySelector("css selector")`

* #id, .class, tag, [property]를 활용해서 첫 번째 요소를 반환
    ```html
    <main>
        <h2> 테스트 </h2>
        <div id = "a" class = "b"> 혜민 </div>
        <div  class = "b"> 재현 </div>
    </main>
    ```
* `querySelector("#id")`
  * id의 기호와 이름으로 첫 번째 요소를 반환
    ```js
    let ele = document.querySelector("#a") // div#a.b
    ```
* `querySelector(".class")` 
  * class의 기호와 이름으로 첫 번째 요소를 반환
    ```js
    let ele = document.querySelector(".b") // div#a.b
    ```

* `querySelector("[property]")`
  * 속성 이름과 값으로 첫번째 요소를 반환
    ```js
    let ele - document.querySelector("[name='c']") // > div
    ```
* `querySelector("css selector")`
  * id, class, tag, property 모두 섞고, 결합자를 활용해서도 사용 가능

* `querySelectorAll("css selector")`
  * css selector를 만족시키는 모든 요소를 NodeList(유사배열)로 반환
  * querySelector(...)와 사용방식은 동일
  * NodeList를 반환하고 배열처럼 사용 가능 - 유사 배열, ~~배열은 아님~~(반복문 사용 가능)

    ```js
    let list = document.querySelectAll("div")

    for(let i = 0; i < list.length; i++) {
        console.log(list[i])
    }   
    ```

* `querySelectorAll("#id")`
* `querySelectorAll(".class")`
* `querySelectorAll("tag")`
* `querySelectorAll("[property]")`


### DOM 문서 조작 방식
#### 문서 조작 방식 이해
* `createElement("tagName)`
  * 작성한 tagName의 HTML 요소를 생성해서 반환
    1. element 생성
        ```js
        let ele = document.createElement("img")
        ```
    2. 추가할 기존 element 접근
        ```js
        let parent = document.getElementById("ele")
        ```
    3. element 추가
          * append, appendChild 둘 다 가능
        ```js
        parent.append(ele)
        ```

* `createTextNode("text")`
  * 텍스트 노드를 생성
  * appendChild를 사용해서 노드 요소에 텍스트를 추가 
    1. text node 생성
    2. element 접근
    3. element에 node 추가 
        * `appendChild` 만 가능


* `remove` , `removeChild`
  * 요소 삭제, 노드 삭제



# Event
* (특히 중요한) 사건[일]
* 웹 페이지에서 여러 종류의 상호작용이 있을 때마다 이벤트가 발생

## Event의 종류
* Keyboard -> keyup, keydown, keypress
* Mouse -> click, mousemove, mouseup, mousedown, mouseenter, mouseleave
* Loading -> load, unload
* Form -> input, change, blur, focus, submit

## Event 객체(Object)
* 네트워크 활동이나 사용자와의 상호작용 같은 사건(Action) | 발생(Occurrence)의 발생을 알리기 위한 객체
* Event 발생
  * 마우스를 클릭하거나 키보드를 누르는 등 사용자 행동으로 발생 가능
  * 특정 메서드를 호출하여 프로그래밍적으로 표현 가능


## Event 처리 | 통신
* 주로 `addEventListener()`를 사용함
  * TYPO 주의!
* 다양한 HTML 요소에 이벤트 처리기(Event Handler)를 "붙여서" 처리함


## Event - `addEventListener()`

* "특정 이벤트에 특정 이벤트가 발생하면, 할 일을 등록하자"
  * `EventTarget.addEventListener(Type, Listener)`
    * EventTarget
    * Type
    * Listener
  

## Event - `preventDefault()`
* 현재 Event의 기본 동작을 중단 | 취소
* HTML 요소의 기본 동작을 작동하지 않게 함