import os
from datetime import datetime

# 기본 폴더 경로 설정
base_path = "TIL"

# 오늘 날짜에 맞는 파일명 생성
today = datetime.now().strftime("%m%d")
todo_filename = f"{today}_todo.md"
todo_filepath = os.path.join(base_path, "To-Do", todo_filename)

# To-Do 파일에 작성할 기본 내용
todo_content = f"""
# {today} Todo
<br>

## 오늘의 명언
> 

<br>

## 오늘의 목표
* 

<br>

## 오늘의 todo

### 오전
- [ ] good morning 
<br>

### 오후
- [ ] good afternoon
<br>

### 저녁
- [ ] and good night!

"""

# To-Do 폴더 및 파일 생성
os.makedirs(os.path.dirname(todo_filepath), exist_ok=True)
with open(todo_filepath, 'w', encoding='utf-8') as f:
    f.write(todo_content)

print(f"{todo_filename} 파일이 {os.path.join(base_path, 'To-Do')} 폴더에 생성되었습니다.")

# 폴더를 만들지 여부를 묻는 함수
def ask_to_create_folders():
    response = input("강의노트를 만드시겠어요? (Y/N): ").strip().upper()
    if response == 'Y':
        # TIL 내의 지정한 폴더에 지정한 이름의 파일을 만들기 위한 함수
        def create_custom_file(folder_name, file_name):
            folder_path = os.path.join(base_path, folder_name)
            os.makedirs(folder_path, exist_ok=True)
            file_path = os.path.join(folder_path, file_name)
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write("")  # 빈 파일 생성
            print(f"{file_name} 파일이 {folder_path} 폴더에 생성되었습니다.")

        # 사용자 입력을 받아 지정한 폴더에 지정한 이름의 파일을 생성
        folder_name = "002_Algorithm"
        file_name = input("파일명을 입력하세요 (예: 05_Queue.md): ")
        create_custom_file(folder_name, file_name)
    elif response == 'N':
        print("프로그램을 종료합니다.")
    else:
        print("잘못된 입력입니다. Y 또는 N을 입력하세요.")
        ask_to_create_folders()

# 프로그램 실행
ask_to_create_folders()
