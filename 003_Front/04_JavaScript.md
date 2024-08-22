# JavaScript

## 자바스크립트란?
* 프로토타입 기반 객체 생성을 지원하는 동적 스크립트 언어
* 근본이 없는 언어
* 자바와 기본 구문이 비슷하다. (C언어의 기본 구문을 바탕)
* 브랜든 아이크 개발(1995)
* Mocha -> LiveScript -> JavaScript
  * Script 언어가 Java의 인기를 업어 가려고

## 브라우저 엔진
* java를 실행하기 위해 jdk8, jdk17을 쓰는 것처럼
* 브라우저가 작동하는데 필요한 기반 기술을 모두 포함하는 엔진
* 단순 markup이 아니라 자바스크립트나 통신 모듈을 실행하기 위해서 필요
* 웹 브라우저마다 사용하는 엔진이 조금씩 다름
  * Chrome: Blink


## JS 관리
* ECMA에서 관리
* HTML-> WHATWG(왓웻지)에서 관리
* CSS -> mdn

```
[UN IT 강국]
=> 북유럽이 의외로 IT 강국 !

1. 에스토니아
2. 스웨덴
3. 스페인
...
9. 한국
```

## HTML 자바스크립트 사용
* `<script>` `</script>` 태그를 사용
* 문서 내의 위치에 제약이 없다.
* head body 다 가능하지만, body 태그 젤 밑에다가 넣어주는 것을 약간의 관행처럼 사용해주기!
```html
<html>
<head>
    <meta charset="UTF-8">
    <title>JavaScript</title>
    <!-- ~~ -->
</head>
<body>
    <script>console.log('body');</script>
</body>

</html>
```


## 외부스크립트 참조하기
* .js 확장자를 가진 파일을 생성
* html 문서에서 `<script src = "outer.js"></script>`
* css -> `<link href="">`
* js -> `<script src="">`



## 주석(Comment)
* `//` 한 줄 주석
* `/* */` 여러 줄 주석

## 표기법

|표기법 |WHEN?| 
|:-:|:----:|
|Pascal Case|class 쓸 때|
|camelCase|css|
|kebab-case| |
|SNAKE_CASE| |


## 변수(Variable)
* 자바스크립트의 변수 타입은 가리키는 값에 대한 타입을 나타냄
* `var`, `let`, `const` 키워드를 이용해서 변수를 선언
* `undefined`는 변수에 아무 값도 없어서 타입을 알 수 없는 경우를 말함
* 동적 타입: 대입되는 값에 따라서 용도가 변경되는 방식
* 문자, $, _로 시작, 대소문자 구분, 예약어 사용X

|   |스코프| 재선언 |재할당| 
|:-:|:----:|:----:|:----:|
|var|함수 |   O   | O  |
|let|블록 |   X   | O  |
|const|블록 |  X  | X  |

### var
* 재선언 가능, 재할당 가능
* ES6 이전에 변수 선언 시 사용
* `호이스팅(Hoisting)` 특성이 있음
  * Java에서의 static => 바로바로 접근해서 값을 가져올 수 있으니 편리. 클래스 영역에 올라가있는 것
  * static과 비슷함. 밑에서 선언해도 위에서 출력을 하거나 어떤 명령을 하면 실행이 됨
  * 함수 스코프
    ```js
    console.log(name)

    var name = "dixon"
    console.log(name)
    ```

### let
* 재선언 불가, 재할당 가능
* 블록 스코프
```js
let age = 2
console.log(age)

age = 6 // O
let age = 7 // X 불가능!!
```

### const
* 재선언 불가, 재할당 불가
* 블록 스코프
* 대문자 SNAKE_CASE 사용
* 선언 시 값을 할당해야 함
* 상수로 사용

```js
const MY_HOBBY = "golf"
console.log(MY_HOBBY)

MY_HOBBY = "tennis" // X 불가능!!
```

### undefined

* 변수에 값이 대입되지 않은 상태

```js
var name
console.log(name) // undefined가 출력됨
```


## 기본문법
### 데이터타입
* 기본 데이터 타입
  * String, Number, Boolean, null, undefined
* 객체 타입
  * Object - function, array 등
* *es6 추가된 타입
  * Symbol(변경 불가능한 기본타입)

```js
var num1 = 10;
var num2 = 10.2;
var msg = "jeongwoo";
var bool = true;
var nullVal = null;
var unVal;
var obj = {};
var obj2 = new Object();
```

### typeof - 변수의 자료형 검사
* typeof 데이터
  * camelCase로 적는 것 아님(주의!!)
* typeof (데이터)
* typeof의 결과는 문자열 반환

<br>

* null의 데이터 타입은 object
  * (설계 실수)
  * null 아님
* function은 기능을 가진 객체
* *es6 추가된 타입
  * Symbol(변경 불가능한 기본 타입)

```js
console.log(typeof(null)) // object
console.log(typeof(true)) // boolean
```

### 동적 데이터 타입
* 다양한 값의 대입이 가능

```js
var value = 10;
console.log(value, typeof(value)); // 10 'number'

value = "hello";
console.log(value, typeof(value)); // hello string
```

### 숫자형
* 정수와 실수로 나누어 구분하지 않음(부동소수점 형식)
* 일반적인 숫자 외 특수 숫자 포함(Infinity, NaN ...)
* e를 활용하여 거듭제곱 표현 가능

### 문자열(String)
* ""로 감싼다.
* ''로 감싼다.

* Template Literal(ES6) -> ``(backtick)으로 감싼다.
  * 여러 줄 입력이 가능 - 공백, 줄 넘김 유지
  * 문자열 내 $(변수명)을 이용하여 변수와 문자열을 결합
```js
let msg0 = "자바스크립트 문자열"
msg1 = '자바스크립트 문자열'
msg2 = `자바스크립트 문자열`

let name = "junho"
msg3 = `나의 이름은 "${name}"입니다.`

msg4 = `나의
이름은
"${name}"입니다.`
```

### 문자열(String) 연산
* 문자열과 숫자 타입의 + 연산
  * 문자열
* 문자열과 숫자 타입의 + 연산 이외
  * 숫자

```js
console.log(1+"20") // 120
console.log("1"+"20") // 120
console.log("1"+20) // 120
console.log(100-"8") // 92
console.log(100*"8") // 800
```

### 자바스크립트 false
* 아래의 5가지 값은 false로 인식
  * `null`
  * `undefiend`
  * `0`
  * `''(빈문자열)`
  * `NaN`
* 나머지 값은 true로 인식
* 0 =="0" : true
* 0 == [ ] : true
* "0" == [ ] : false


### 일치 연산자
* 값과 타입이 일치하는지 체크
* `===`, `!==`

```js
let i = 100
let j = "100"

console.log("i==j", i==j) // true
console.log("i===j", i===j) // false
```


### 배열
* 배열의 생성: [ ] 또는 Array() 활용
* 배열의 크기는 동적으로 변경된다.
* 크기가 지정되어 있지 않은 경우에도 데이터의 입력 가능
* 배열은 여러가지의 데이터 타입을 하나의 배열에 입력할 수 있음

```js
var arr1 = [] // new Array()
arr1[0] = 10
arr1[2] = 30
console.log(arr1[0], arr1[1], arr1[2]) // 10 null 30
console.log(arr1[1].length) // 3
arr[3] = "문자열"
arr1[4] = {}
arr1[5] = [1,2,3]
arr1[6] = true
```

* 함수를 이용하여 데이터 추가 가능
```js
arr2 = [1, "two", "three", 4, 5]
arr2.pop()
arr2.push("맨 뒤 추가")
arr2.unshift("맨 앞 추가")
arr2.shift("맨 앞 삭제")
arr2.splice(i, n) // i 위치에서부터 n개 삭제
arr2.slice(i, j) // i ~ j 에 대한 얕은 복사
arr2.join() // 배열 원소 전체를 하나의 문자열로
arr2.reverse()
arr2.concat(newArr)
```

### 반복문

* while
* for
* for ... in
  * Object -> Key || Array -> index를 순회하는 반복문
    ```js
    // Object
    const foods = {k: "kebab", t: "taco", p:"pizza", y:"yogurt"}
    for (const key in foods) {
        console.log(`${key}: ${foods[key]}`);
    }
    ```    
    ```js
    // Array(코드 수정)
    const foods = {k: "kebab", t: "taco", p:"pizza", y:"yogurt"}
    for (const key in foods) {
        console.log(`${key}: ${foods[key]}`);
    }
    ```
* for ... of 
    ```js
    const foods = ["kebab", "taco", "pizza", "yogurt"]


    ```
* forEach
  * Array의 메서드(method)로 요소들에 접근하는 반복문의 형태
  * forEach 에서 매개변수로 지정한 값이 배열 안에 있는 각 요소들을 담을 변수로 취급
  ```js
    foods.forEach(function(food)) {
        console.log(food)
    }
    foods.forEach((food)=>console.log(food)) // 화살표 함수 형식
  ```


## 객체(Object)
* 객체는 문자열로 이름을 붙인 값들의 집합체

### 객체 만들기
* 객체 리터럴 이용 : { }
* Object 생성자 이용: new Object()
* 배열 : [ ] || new Array();
* 생성자 함수 이용

### 객체(Object) 프로퍼티(Property)
* 생성자 함수를 사용해서 Property 추가 가능 & this 키워드 사용 가능

```js
let member1 = {id:"valentina" ,email:"a@b.com"}
function Member(id, email) {this.id = id; this.email = email;}
let member2 = new Member("eevee", "jw@a.com")
console.log(member2)
```

* `.`(dot) 또는 [ ]을 이용하여 프로퍼티 조회 및 변경을 처리

```js
let student = {name = "kjw", age=35}
console.log(student[age]) // ERROR
console.log(student["age"]) // 35
```

* 객체 프로퍼티 - 추가/수정/삭제
* 삭제는 `delete` member.id
```js
let student = {name = "kjw", age=35}
member.id = "kim"
console.log(student) // {name = "kjw", age=35, id="kim"}
delete student.name
console.log(student) // {age=35, id="kim"}
```
* 객체 변수에는 주소가 저장되어 공유 가능
* 함수 안에서의 this는 함수를 호출한 객체


## 함수(Function)
* 자바스크립트에서 함수는 객체 타입으로 값처럼 사용이 가능
* 함수를 변수에 대입하거나 매개변수로 넘길 수 있음
* 배열의 요소에 넣거나 객체의 프로퍼티로 설정이 가능
* 매개변수의 개수가 일치하지 않아도 호출이 가능
* <strong><ins>JavaScript의 함수는 `일급 객체`(First-class citizen)에 해당</ins></strong>
  * 변수에 할당 가능
  * 함수의 매개변수로 전달 가능
  * 함수의 반환 값으로 사용 가능
* `function` 키워드 사용
* 함수의 블럭은 중괄호 `{}` 사용

### 함수 만들기
* 함수 선언식
  * 일반적인 프로그래밍 언어의 함수 정의 방식
  * 함수의 이름과 함께 정의하는 방식
  * 함수의 이름
  * 매개 변수
  * 내용
  * 호이스팅 됨!
    ```js
    function 함수명() {함수 내용}
    ```
    ```js
    function greeting(name) {
        return `Welcome,${name}`
    }

    console.log(greeting("Haley"))
    ```
* 함수 표현식
  * 익명함수로 정의가능
  * 매개변수
  * 내용
    ```js
    let 함수명 = function() {함수 내용}
    ```
    ```js
    let greeting = function(name) {
        return `Welcome, ${name}`
    }
    ```


### 선언식 vs 표현식
* 선언식 함수는 호이스팅의 영향을 받아 함수 선언 이전에 호출이 가능
* 표현식 함수는 선언 이전에 호출이 불가능

```js
funcD() // 호출 가능

function funcD() {
    console.log("선언식")
}
```
```js
funcE() // 호출 블가능

let funcE = function {
    console.log("표현식")
}
```

### 함수의 리턴
* 함수의 실행 결과로 함수를 반환할 수 있음
* 함수가 특별한 값을 리턴하지 않은 경우 undefined가 반환됨

```js
// 작성 중
function func() {
    return function (num1, num2) {
        return num1 + num2
    }
}

function func2() {
    return function(num3, num4)
}
```

### 함수의 호출
* 정의된 함수를 호출 시 함수 값으로 넘길 수 있음

```js
function func(callFn) {
    callFn('Hello SSAFY')
}

function fn(msg) {
    console.log(msg)
}

func(fn) // Hello SSAFY
```

### 함수 매개변수
* 함수는 호출 시 매개변수의 영향을 받지 않음
* `arguments`라는 함수 내부의 프로퍼티를 이용하여 매개변수의 처리가 가능
* 기본 인자(default arguments)를 사용할 수 있음
* 자바스크립트의 함수는 <ins>오버로딩</ins>의 개념을 지원하지 않음
