# Stack

## 계산기
- 문자열로 된 계산식이 주어질 때, 스택을 이용하여 이 계싼식의 값을 계산할 수 있다.
- 문자열 수식 계산의 일반적 방법
  - step1. 중위 표기법의 수식을 후위 표기법으로 변경한다. (스택 이용)
  - step2. 후위 표기법의 수식을 스택을 이용하여 계산한다.
    ```
    * 중위 표기법
        - 연산자를 피연산자의 가운데 표기하는 방법
        ex. A+B
    * 후위 표기법
        - 연산자를 피연산자 뒤에 표기하는 방법
        ex. AB+
    ```

### step1. 중위표기식의 후위표기식 변환 방법 1
- 수식의 각 연산자에 대해서 우선순위에 따라 괄호를 사용하여 다시 표현한다.
- 각 연산자를 그에 대응하는 오른쪽 괄호의 뒤로 이동시킨다.
- 괄호를 제거한다.

```
ex. A*B-C/D

1단계: ((A*B) - (C/D))
2단계: ((A B)* (C D) /)-
3단계: A B * C D / -

```

### step1. 중위 표기법에서 후위표기법으로의 변환 알고리즘(스택 이용) 2

1. 입력받은 중위 표기식에서 토큰을 읽는다. ex. 연산자, 피연산자
2. 토큰이 피연산자이면 토큰을 출력한다.
3. 토큰이 연산자(괄호 포함)일 때, 이 토큰이 스택의 top에 저장되어 있는 연산자보다 우선순위보다 높으면 스택에 push하고, 그렇지 않다면 스택의 top의 연산자의 우선순위가 토큰의 우선순위보다 작을 때까지 스택에서 pop한 후 토큰의 연산자를 push한다. 만약 top에 연산자가 없으면 push한다.

#### 간단 절차
1. 피연산자가 나오면? -> 출력
2. 연산자가 나오면?
   * 스택이 비어있으면 push
   * 스택에 들어있으면 <ins>우선순위 낮은</ins> 게 나올 때까지 pop, 이후 push
3. `(` push
4. `)` : `(` 나올 때까지 pop

### step2. 후위 표기법의 수식을 스택을 이용하여 계산
1. 피연산자를 만나면 스택에 push한다.
2. 연산자를 만나면 필요한만큼의 피연산자를 스택에서 pop하여 연산하고, 연산결과를 다시 스택에 push한다.
3. 수식이 끝나면, 마지막으로 스택을 pop하여 출력한다.


## 재귀호출

- 다시 재, 돌아갈 귀
- 자기 자신을 호출하여 순환 수행되는 것
- 함수 호출은 메모리 구조에서 스택을 사용한다. (이름만 같은 다른 메서드)
  - 간단한 문제에 대해서는 반복문에 비해 메모리 및 속도에서 성능저하가 발생한다.
- 일반적으로 기본 부분(Base case), 재귀 부분(Recursive case)으로 구성된다.
  - Base case: 재귀 호출에서 빠져나가기 위한 조건
  - Recursive case: 자신을 호출하는 부분(Base case로 유도한다.)
- 재귀적 프로그램을 작성하는 것은 반복 구조에 비해 간결하고 이해하기 쉽다.
- `스택 오버플로우`: JVM메모리 구조의 스택 영역의 메모리 한계를 벗어나는 것을 의미

- 함수에서 실행해야 하는 작업의 특성에 따라 일반적인 호출 방식보다 재귀 호출방식을 사용하여 함수를 만들면 프로그램의 크기를 줄이고 간단하게 작성 가능

### Memoization
- 피보나치 수를 구하는 함수를 재귀함수로 구현한 알고리즘은 문제점이 있다.
- `엄청난 중복 호출이 존재한다`는 것
- 피보나치 수를 구하는 알고리즘에서 `$fibo(n)$`의 값을 계산하자마자 저장하면(memoize), 실행시간을 O(n)으로 줄일 수 있다.

