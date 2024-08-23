# Tree Application

## Contents

* 수식 트리
* 힙

## 수식 트리
* 수식을 표현하는 이진 트리
* 수식 이진 트리(Expression Binary Tree)라고 부르기도 함.
* 연산자는 루트 노드이거나 가지 노드
* 피연산자는 모두 leaf node

<img src = "https://roboprenr.com/media/images/Infix_2CfNfZV.jpg" width = 500>

<br><br>


## 힙
* 삽입, 삭제 시 완전이진트리 유지!
* 힙 구현 위해 swap!

<img src = "https://velog.velcdn.com/images/yeonjin1357/post/6176dbf5-c935-43b4-91f6-8a66dfe62cb3/image.png" width = 500>



### 힙-삽입
* 내용 추가

### 힙-삭제
* 힙에서는 `루트 노드`의 원소만을 삭제할 수 있다.
* 루투 노드의 원소를 삭제하여 반환한다.
* 힙의 종류에 따라 최대값 또는 최소값을 구할 수 있다.
* 마지막 노드를 root로 올림 -> root의 자식들을 비교 -> root와 변경


### 힙의 활용
#### 1. 우선순위 큐
* 우선순위 큐를 구현하는 가장 효율적인 방법이 힙을 사용하는 것
  * 노드 하나의 추가/삭제의 시간 복잡도가 $O(logN)$이고 최대값/최소값을 O(1)에 구할 수 있다.
  * 완전 정렬보다 관리 비용이 적다.
* 배열