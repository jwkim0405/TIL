import subprocess
import shlex

# 열고 싶은 URL 리스트
urls = [
    "https://edu.ssafy.com/edu/main/index.do",
    "https://github.com/ssafy12-seoul07",
    "https://meeting.ssafy.com/s12p01a7/channels/town-square",
    "https://github.com/jwkim0405",
    "https://github.com/jwkim0405/AlgorithmStudy",
    "https://swexpertacademy.com/main/main.do"
]

# Chrome 브라우저의 경로 설정 (Windows의 경우)
chrome_path = "C:/Program Files/Google/Chrome/Application/chrome.exe"

# Chrome 명령어 생성
cmd = [chrome_path]
cmd.extend(urls)  # URL 리스트를 명령어에 추가

# Chrome을 새로운 창으로 열기
try:
    subprocess.run(cmd, check=True)
    print("Chrome 브라우저가 성공적으로 열렸습니다.")
except subprocess.CalledProcessError as e:
    print(f"Chrome 브라우저 열기 실패: {e}")
