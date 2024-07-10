# 깃 필기
## 커밋/푸쉬 규칙
* 꼭! 항상! 절대! `add`, `commit`, `push`는 최상단 폴더에서 작업하기 !

## 내가 지금 사용하고 있는 컴퓨터에서 처음으로 깃 작업을 할 때 1번만 하면 되는 작업

### `git config`
* 계정 설정 및 추가
    * `git config --global user.name [나의 유저네임]`
    * `git config --global user.email [나의 깃헙 이메일]`
* 계정 확인
    * `git config --global user.name`
    * `git config --global user.email`
* 잘못 썼다면 다시 쓰면 됨

## 처음으로 git을 시작할 때 1번만 하면 되는 작업

### `git init`
* git을 시작할 때 가장 먼저 사용하는 명령어
* git으로 한 폴더를 버전 관리 하겠다는 선언.
* `git init` 후에 가장 기본 브랜치인 `(master)`가 터미널에 표시됨.

### `git remote`
* `git remote add origin [나의 깃헙의 원격저장소(github) 주소]`
    * 항상 똑같이 origin으로 해야 함(특히, 협업에서 안 해놓으면 큰일)
    * [], <> : 각자 다르게 적어야 하는 내용들

* `git remote -v` : 내가 등록한 원격저장소 레포 주소 확인
* `git remote remove origin` : 등록한 원격저장소 삭제

## Working Directory에 변동이 있을 때마다 하는 작업

### `git add`

### `git commit`

### `git push`


## 상태 확인

### working directory에서
- `git status`
    - `add` 전/후

### staging area에서 (.git)
- `git status`
    - 추적이 되고 있는지만 확인 가능
- `git log`
    - commit 이후에만 !!
    - 내림차순
    - `git log`
    - `git log --oneline`: 간결하게 한 줄로 보임!

