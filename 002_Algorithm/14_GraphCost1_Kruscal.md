# 그래프 비용(Graph)

## Contents
* 서로소 집합
* 최소 비용 신장 트리
* 크루스칼 알고리즘


## 서로소 집합(Disjoint sets)

### 상호 배타 집합
  * 중복 포함된 원소가 없는 집합 -> 교집합이 없음
  * 각 집합은 대표자를 통해 구분


### 상호 배타 집합 표현
* 연결 리스트
* 트리



### 상호 배타 집합 연산
* `Make-Set(x)`: 집합 생성
* `Find-Set(x)`: x 속한 대표를 반환
* `Union(x, y)`: x와 y의 집합을 union
  * ${x, y}$ 와 ${a, b}$ 집합에서, `Union(x, a)`를 하면, ${x, y, a, b}$ 집합 생성됨


### 상호 배타 집합 표현 - 연결 리스트
* 같은 집합의 원소들은 하나의 연결리스트로 관리
* 연결리스트의 맨 앞의 원소를 집합의 대표자로 결정
* 각 원소는 집합의 대표원소를 가리키는 `링크`를 갖는다.

### 상호 배타 집합 표현 - 트리
* 하나의 집합을 하나의 트리로 표현한다.
* 자식 노드가 부모 노드를 가리키며 루트 노드가 대표자가 된다.

### 연산의 효율을 높이는 방법
* Rank를 이용한 Union
  * 각 노드는 자신을 루트로 하는 subtree의 높이를 랭크(rank)라는 이름으로 저장
  * 두 집합을 Union할 때 rank가 낮은 집합을 높은 집합에 붙인다.
* Path Compression
  * Find-Set을 행하는 과정에서 만나는 모든 노드들이 직접 대표를 가리키도록 수정한다.


## 최소 신장 트리(MST)
### 신장 트리
* 그래프의 모든 정점과 간선의 부분 집합으로 구성되는 트리

### 최소 신장 트리
* 신장 트리 중에서 사용된 간선들의 가중치 합이 최소인 트리
* 무방향 가중치 그래프
* N개의 정점을 가지는 그래프에 대해 반드시 (N-1)개의 간선을 사용
* 사이클을 포함 X


### 왜 사용하는가?
* 도로망, 통신망, 유통망 등등 여러 분야에서 비용을 최소로 해야 이익을 볼 수 있다.
* 대표 알고리즘: 크루스칼, 프림


## KRUSKAL Algorithm
1. 최초, 모든 간선을 가중치에 따라 오름차순으로 정렬
1. 가중치가 가장 낮은 간선부터 선택하면서 트리를 증가시킴
    * 사이클이 존재하면 다음으로 가중치가 낮은 간선 선택
    * 사이클 검사 -> Union Find 연산을 통해 알 수 있다!
    * 대표자가 같아! 그럼 사이클이 있다는 것
1. N-1개의 간선이 선택될 때까지 2 반복

