# Array

**ToDo**

* 오늘의 목표: __집중한답시고 인상 쓰지 않기!__

1. ~~카운팅 정렬 구현~~
2. SWEA_1210_ladder1
3. ~~SWEA_1954_달팽이숫자~~
4. ~~SWEA_1209_Sum~~
5. ~~SWEA_2001_파리퇴치~~
6. ~~오늘 과제 push하기~~
7. (내일 하기) 8월 스터디 신청
8. (내일 하기) 설문조사
9. ~~깃헙 복원~~
10. ~~알바 깃헙에 구글시트 링크 추가~~
11. (내일 하기) 참외밭

## Contents

* 검색(Search)
* 선택 정렬(Selection sort)
* 카운팅 정렬



### 학습한 정렬
* `Arrays.sort()` -> quick sort
* `Collections.sort()` -> merge sort
* Comparable, Comparator


## 검색 (Search)
* 저장되어 있는 자료 중에서 원하는 항목을 찾는 작업
* 목적하는 탐색 키를 가진 항목을 찾는 것

### 검색의 종류
* 순차 검색
* 이진 검색
* 인덱싱

### 순차 검색
* 일렬로 되어 있는 자료를 순서대로 검색하는 방법
  * 가장 간단하고 직관적인 검색 방법
  * 배열이나 연결 리스트 등 **순차구조로 구현된 자료구조**에서 원하는 항목을 찾을 때 유용함
  * 알고리즘이 단순하여 구현이 쉽지만, 검색 대상의 수가 많은 경우에는 수행시간이 급격히 증가하여 비효율적임 (반복문 사용)

#### 정렬되어 있지 않은 경우

* 검색 과정
  * 첫 번쨰 원소부터 순서대로 검색 대상과 키 값이 같은 원소가 있는지 비교하며 찾는다.
  * 키 값이 동일한 원소를 찾으면 그 원소의 인덱스 반환
  * 자료구조의 마지막에 이를 때까지 검색 대상을 찾지 못하면 검색 실패


```java
// 정방향 순회
//  key = 2
// index:  0   1   2   3  `4`   5   6
// value:  4   9   11  23  2   19  7

int[] arr = {4, 9, 11, 23, 2, 19};
int key = 2;

for (int i = 0; i < arr.ength; i++)
    if (arr[i] == key)
        return i;   // index값을 반환
```

#### 정렬되어 있는 경우

* 검색 과정
  * 자료가 오름차순으로 정렬된 상태에서 검색을 실시한다고 가정하자.
  * 자료를 순차적으로 검색하면서 키 값을 비교하여, 원소의 키 값이 검색 대상의 키 값보다 크면 찾는 원소가 없다는 것이므로 더 이상 검색하지 않고 검색 종료

```java
// a : 1차원 배열, n : 배열 크기, key : 찾고 싶은 값
sequentialSearch2(int[] a, int n, int key)
    // 정렬된 배열에 대해
    i <- 0
    while (a[i] < key)
        i <- i+1;   // a[i]가 key값보다 작으면 계속 index를 올려줌.
                    // 그런데 작지 않다는 결과가 나오면 for문 탈출하여 key 값과 비교
                    // key값이 여러 개 들어 있다면 가장 key값들 중 가장 낮은 index가 출력됨 
    
    if (a[i] == key) return i;  // 반복문 밖에 i가 선언되어 있으므로 바로 쓸 수 있음!
    else return -1;
```

## 이진검색
* 자료의 가운데에 있는 항목의 키 값과 비교하여 다음 검색의 위치를 결정하고 검색을 계속 진행하는 방법
  * 목적 키를 찾을 때까지 이진 검색을 순환적으로 반복 수행함으로써 검색 범위를 반으로 줄여가면서 보다 빠르게 검색을 수행함
* 이진 검색을 하기 위해서는 자료가 정렬된 상태여야 한다.

* $2^n$ 개 -> $n$번만에 탐색 가능

#### 구현

```java
binarySearch(int[] a, int key) 
    left <- 0;
    right <- length(a) - 1;
    while(left <= right) {
        mid = (left + right) / 2;   
        if (a[mid] == key) return true;             //  검색 성공
        else if (a[mid] > key) right = mid - 1;     // 왼쪽
        else left = mid + 1;                        // 오른쪽
    }
    return false;   // 검색 실패
```
#### 재귀 함수 이용

```java
// 나중에
```

## 선택 정렬(Selection Sort)

### 셀렉션 알고리즘(Selection Algorithm)
* 저장되어 있는 자료로부터 $k$번째로 큰 혹은 작은 원소를 찾는 방법을 셀렉션 알고리즘이라 한다.
  * 최소값, 최대값 혹은 중간 값을 찾는 알고리즘을 의미하기도 한다.
  
#### 선택 과정
* 셀렉션은 아래와 같은 과정을 통해 이루어진다.
  * 정렬 알고리즘을 이용하여 자료 정렬하기
  * 원하는 순서에 있는 원소 가져오기

### 선택 정렬 - 개념
* 주어진 자료들 중 가장 작은 값의 원소부터 차례대로 선택하여 위치를 교환하는 방식
  * 셀렉션 알고리즘을 전체 자료에 적용한 것
* 정렬 과정
  * 주어진 리스트 중에서 최소값을 찾는다.
  * 그 값을 리스트의 맨 앞에 위치한 값과 교환한다.
  * 맨 처음 위치를 제외한 나머지 리스트를 대상으로 위의 과정을 반복한다.

* 시간 복잡도
  * $O(n^2)$


## 카운팅 정렬 (Counting Sort)
* 항목들의 순서를 결정하기 위해 집합에 각 항목이 몇 개씩 있는지 세는 작업을 하여, 선형 시간에 정렬하는 효율적인 알고리즘
  * 각 원소의 cnt 배열, 누적합 배열 => 역방향 순회하면서 배열 값 재할당

* **제한사항**
  * 정수나 정수로 표현할 수 있는 자료에 대해서만 적용 가능
  * 각 항목의 발생 횟수를 기록하기 위해, 정수 항목으로 인덱스되는 카운트들의 배열을 사용하기 때문
  * 카운트들을 위한 충분한 공간을 할당하려면 집합 내의 가장 큰 정수를 알아야 한다

* **시간 복잡도**
  * $O(n+k)$ : $n$은 배열의 길이, $k$는 정수의 최대값
* **안정 정렬**
* 



