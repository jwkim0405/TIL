# Queue

## Contents
* 큐
* 선형큐 (<->원형큐)
* 큐의 활용


## 01. Queue

### 큐의 특성
* 스택과 마찬가지로 삽입과 삭제의 위치가 제한적인 자료구조
  * 큐의 <ins>뒤에서는 삽입만</ins> 하고, 큐의 <ins>앞에서는 삭제만</ins> 이루어지는 구조
* 선입선출구조(FIFO: First In First Out)
  * 큐에 삽입한 순서대로 원소가 저장되어, 가장 먼저 삽입(First In)된 원소는 가장 먼저 삭제(First Out)된다.
  * ex. 식당 웨이팅 줄, 프린터기
* 큐의 선입선출 구조
  * 머리(`front`) = head : 마지막으로 삭제된 원소
  * 꼬리(`rear`) = tail : 저장된 원소 중 마지막 원소
* 큐의 기본 연산
  * 삽입: `enQueue`
  * 삭제: `deQueue`
  
<br>

### Queue의 주요 연산
* enQueue(item): 큐의 뒤쪽(rear 다음)에 원소를 삽입하는 연산
* deQueue(): 큐의 앞쪽(front)에서 원소를 삭제하고 반환하는 연산
* createQueue(): 공백 상태의 큐를 생성하는 연산 - 생성자의 역할
* isEmpty(): 큐가 공백상태인지를 확인하는 연산
* isFull(): 큐가 포화상태인지를 확인하는 연산
* Qpeek(): 큐의 앞쪽(front)에서 원소를 삭제없이 반환하는 연산

<br>

### Queue의 연산 과정
* rear는 <ins>마지막 데이터의 인덱스</ins>을 가리킨다.(삽입할 때 변경)
* front는 <ins>제일 앞의 데이터 한 칸 앞</ins>을 가리킨다. (삭제할 때 변경)

1. 공백 큐 생성: createQueue();
   * front = rear = -1
2. 원소 A 삽입: enQueue(A);
   * front = -1, rear = 0; 
3. 원소 B 삽입: enQueue(B);
   * front = -1, rear = 1;
4. 원소 반환/삭제: deQueue();
   * front = 0, rear = 1;
5. 원소 C 삽입: enQueue(C);
   * front = 0, rear = 2;
6. 원소 반환/삭제: deQueue();
   * front = 1, rear = 2; 
7. 원소 반환/삭제: deQueue();
   * front = 2, rear = 2;

<br>


## 02. 선형큐
### 선형큐의 개념
* 선형큐
  * 1차원 배열을 이용한 큐
  * 큐의 크기 = 배열의 크기
  * front: 마지막으로 삭제된 인덱스
  * rear: 저장된 마지막 원소의 인덱스 
* 상태 표현
  * 초기 상태: front = rear = -1
  * 공백 상태: front = rear
  * 포화 상태: rear = n-1 (n: 배열의 크기, n-1: 배열의 마지막)

<br>


### 선형 큐 이용시의 문제점
#### 잘못된 포화상태 인식
* 선형 큐를 이용하여 원소의 삽입과 삭제를 계속할 경우, 배열의 앞부분에 활용할 수 있는 공간이 있음에도 불구하고, rear = n-1인 상태 즉, 포화상태로 인식하여 더 이상의 삽입을 수행하지 않게 됨.

#### 해결방법1
* 매 연산이 이루어질 때마다 저장된 원소들을 배열의 앞부분으로 모두 이동시킴
* 원소 이동에 많은 시간이 소요되어 큐의 효율성이 급격히 떨어짐
* 배열 대신 연결 리스트를 사용하면 됨.

#### 해결방법2
* 1차원 배열을 사용하되, 논리적으로는 배열의 처음과 끝이 연결되어 원형 형태의 큐를 이룬다고 가정하고 사용
* 원형 큐의 논리적 구조
* 인덱스 % 배열의 크기!




<br>

## 03. 큐의 활용

### 버퍼(Buffer)
* 버퍼
  * 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역
  * 버퍼링: 버퍼를 활용하는 방식 또는 버퍼를 채우는 동작을 의미한다.
* 버퍼의 자료 구조
  * 버퍼는 일반적으로 입출력 및 네트워크와 관련된 기능에서 이용된다.
  * 순서대로 입력/출력/전달되어야 하므로 FIFO 바익의 자료구조인 큐가 활용된다.
* 키보드 버퍼의 수행 순서
  * 사용자 키보드 입력 -> 키보드 입력 버퍼 -> 키보드 입력 버퍼에 Enter 키 입력이 들어오면 -> 프로그램 실행 영역