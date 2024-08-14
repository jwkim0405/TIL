# LinkedList

## Contents
* 연결리스트
* Singly Linked List
* Doubly Linked List
* 연결 스택 & 연결 큐

<br>

## 특성
* 자료의 <ins>논리적인 순서</ins>와 <ins>메모리 상의 물리적인 순서</ins>가 일치하지 않고, 개별적으로 위치하고 있는 원소의 주소를 연결하여 하나의 전체적인 자료구조를 이룬다.
  * 논리적: 사람이 이해하는 구조
  * 물리적: 실제 컴퓨터 메모리 상에 저장되는 구조
* 링크를 통해 원소에 접근하므로, 순차 리스트와 같이 물리적인 순서를 맞추기 위한 작업이 필요하지 않다.
* 자료구조의 크기를 동적으로 조정할 수 있어, 메모리의 효율적인 사용이 가능하다.

<br>

## Node & Head

### 노드
* 연결 리스트에서 하나의 원소에 필요한 데이터를 갖고 있는 자료 단위
* 구성 요소
  * 데이터 필드
    * 원소의 값을 저장하는 자료구조
    * 저장할 원소의 종류나 크기에 따라 구조를 정의하여 사용함
  * 링크 필드
    * 다음 노드의 주소를 저장하는 자료구조
* 연결리스트는 노드의 집합으로 구성된다.

```java
// 클래스를 만들어 data field와 link field를 정의한다.
class Node {
    data
    link
}
```
### 헤드
* 리스트의 <ins>시작 위치</ins>에 해당하는 노드
* 링크 필드만 있으면 됨.(사실 구현 방식에 따라 달라짐.)

<br>

## 단순 연결 리스트(Singly Linked List)

### 연결 구조
* 노드가 하나의 링크 필드에 의해 다음 노드와 연결되는 구조를 가진다.
* 헤드가 가장 앞의 노드를 가리키고, 링크 필드가 연속적으로 다음 노드를 가리킨다.
* 최종적으로 NULL을 가리키는 노드가 리스트의 마지막 노드이다.

#### 구현 방법
1. head: 첫번째 데이터를 가지는 Node<br><br>
<img src = "https://media.geeksforgeeks.org/wp-content/uploads/20240219155344/Singly-Linked-List.webp" width = 500>

1. head: 빈 데이터를 가진 더미 노드 (상대적 구현 쉬움, 메모리 사용량 up) <br><br>
<img src = "https://media.geeksforgeeks.org/wp-content/uploads/singly-linkedlist.png" width = 500>

```java
if (head == null)
    head = newNode;
else
    head 연결
```

#### 'A', 'C', 'D'를 원소로 갖고 있는 리스트의 두 번째에 'B' 노드를 삽입할 때
1. 메모리를 할당하여 새로운 노드 new 생성
2. 새로운 노드 new의 데이터 필드에 'B' 저장



## 이중 연결 리스트(Doubly Linked List)

### 특성
* 양쪽 방향으로 순회할 수 있도록 노드를 연결한 리스트
* 두 개의 링크 필드와 한 개의 데이터 필드로 구성
* Head는 따로 만들자 <br> <br>
<img src  = "https://media.geeksforgeeks.org/wp-content/uploads/20240809123741/Insertion-at-the-End-in-Doubly-Linked-List-copy.webp" width = 500>



## 연결 스택

|배열 구현|연결리스트 구현|
|---|---|
|크기 고정|동적 크기 조절 가능|

## 배열을 이용한 우선순위 큐
* 리스트를 이용하여 우선순위
  * 연결 리스트를 이용하여 자료 저장
  * 리스트의 가장 앞쪽에 최고 우선순위가 위치하게 됨
  
  * 원소를 삽입하는 과정에서 리스트 내 노드의 원소들과 비교하여 적절한 위치에 노드를 삽입하는 구조
* 배열 대비 장점
  * 삽입/삭제 연산 이후 원소의 재배치가 필요 없음
  
  * 메모리의 효율적인 사용이 가능함


|       |  배열  |연결리스트|
| :---: | :---: | :---:  |
|삽입/삭제| O(N) |  O(1) | 
|  조회  | O(1) | O(N)  |