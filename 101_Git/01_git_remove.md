# 파일 및 폴더 삭제 (Git에서 제거하기)

## .gitignore
- `.gitignore` 파일: 특정 파일이나 폴더를 원격 저장소에 업로드하지 않도록 설정하는 파일  
- `.gitignore`에 설정한 항목은 이후에 추가 및 변경된 경우에만 적용, 이미 원격 저장소에 올라간 파일에는 영향 X
- [gitignore.io](gitignore.io) 사이트에서 코드를 받아올 수 있음.
  - `java`, `windows`, `macOS`, `eclipse`, `intellij` 등 추가
  - `.classpath`을 삭제하려면 직접 파일에 적어주기
  - `.project`은 주석 제거해서 사용하기!

<br>


## 이미 체크인 된 파일 제거하기
원격 저장소에 이미 푸시된 파일을 `.gitignore`에 추가해도, 해당 파일은 자동으로 삭제되지 X  

#### 1. 명령어 rm
* 원격 저장소와 로컬 저장소에서 모두 삭제할 때
```sh
git rm <fileName>            # 원격 저장소와 로컬 저장소에서 모두 삭제
```
#### 2. 명령어 rm --cached 
* 원격 저장소에서만 삭제할 때

```sh
git rm --cached <fileName>   # 원격 저장소에서만 삭제, 로컬 저장소에서는 유지
git rm --cached -r <directoryName> # 폴더 하위의 모든 파일을 삭제
```


