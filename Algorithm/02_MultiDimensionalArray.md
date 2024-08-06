# Array


### 오늘의 발견
* `오늘의 대발견`은 총 `4`개입니다.
* `오늘의 소발견`은 총 `1`개입니다.

<br>

<details>
<summary>Contents</summary>

1. 2차원 배열
2. 2차원 배열 활용
3. 다차원 배열
4. 연습문제
   
</details>


## 2차원 배열

### 개념
* 배열: 동일한 자료형의 data를 여러 개 담을 수 있는 자료구조
* 2차원 배열의 선언
  * '1차원 배열'들을 담을 수 있는 배열
* JVM 메모리 구조
  * 배열 -> 참조형 자료 !
  * 객체는 `힙 영역`에 저장되어 관리
  * 배열도 객체이기 때문에 힙 영역에 할당되어 관리(`배열도 객체였어?`)
* 가로, 세로 : (i, j), (p, q), (row, col), (w, h), (r, c)
```java
int[][] twoDimArr = new int[2][4];  // 2행 4열의 2차원 배열 선언

// int[][] twoDimArr = new int[필수][비어도 OK];
int[][] twoDimArr = new int[2][];   // 열은 비어도 됨!
int[][] twoDimArr = new int[][4];   // (X)행은 비우면 안됨. 1차원 배열이 몇 개 있는지는 설정해줘야 함!
```


```
1행: 3열
2행: 2열

열의 개수가 행마다 다르게 지정할 수 있음 !!
JVM 메모리 구조는 2차원 배열의 각 행이 1차원 배열을 참조만 하는 것이기 때문!

// 초기화 방법
-> 1차원 배열의 크기가 다 다르면 한 번에 초기화할 수는 없다.

```
### 2차원 배열의 접근

* 배열 순회
  * n x m 배열의 n * m 개의 모든 원소를 빠짐 없이 조사하는 방법

#### 행 우선 순회
  * (1행 순회 ~ 2행 순회 ~ 3행 순회 ~ ...)

```java
// pseudocode

int i; // 행의 좌표
int j; // 열의 좌표

for i from 0 to n-1
    for j from 0 to n-1
        Array[i][j] // 필요한 연산 수행
```
#### 열 우선 순회
```java
// pseudocode

int i; // 행의 좌표
int j; // 열의 좌표

for i from 0 to n-1
    for j from 0 to n-1
        Array[j][i] // 필요한 연산 수행
```


#### 지그재그 순회
`오늘의 대발견 1`
```java
// pseudocode

int i; // 행의 좌표
int j; // 열의 좌표

for i from 0 to n-1
    for j from 0 to n-1
        Array[i][j+(m-1-2*j)*(i%2)] // 필요한 연산 수행
```

`오늘의 대발견 2`
```java
int r, c;   // 여러 변수 한 번에 선언 가능!
int r, c = 2;   // 여러 변수를 한 번에 초기화할 때에는 같은 값으로 가능!!한 줄 알았지만 안됩니다 ,,

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The local variable r may not have been initialized

	at Practice.main(Practice.java:7)
```

`오늘의 대발견 3`
```java
// 다차원 배열을 출력할 때에는
System.out.println(Arrays.deepToString(arr));
```

#### 델타를 이용한 2차원 탐색
`오늘의 대발견 4 - \Delta`

  
|     | 상 | 하 | 좌 | 우|
|---|---|---|---|---|
|  $\Delta r$    | -1 | +1 | 0 | 0 |
|  $\Delta c$    | 0 | 0 | -1 | +1 |



## 2차원 배열 활용

#### 전치행렬
```java


```

#### 90도 시계방향 회전
```java
int num = 0;
int[][] arr = new int[3][3];

for (int i = 0; i < 3; i++)
    for (int j = 0; j < 3; j++)
        arr[i][j] = ++num;

for (int i = 0; i < 3; i++) { 
    for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

int[][] nextArr = new int[3][3];

// 90도 회전 배열
for (int i = 0; i < 3; i++)
    for (int j = 0; j < 3; j++)
        nextArr[i][j] = arr[2-j][i];

System.out.println();		

for (int i = 0; i < 3; i++) { 
    for (int j = 0; j < 3; j++) {
        System.out.print(nextArr[i][j] + " ");
    }
    System.out.println();
}
```



`오늘의 소발견`
```java
// Math.random()은 0~1사이의 실수를 반환
// Math.random() * 100을 하면 0 ~ 100 사이의 실수를 반환
// (int)로 형 변환하여 정수로 변환 가능!
board[i][j] = (int) (Math.random() * 100);	
```