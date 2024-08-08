import os
import subprocess

# 스크립트가 위치한 디렉토리를 기준으로 base_directory 설정
base_directory = os.path.dirname(os.path.abspath(__file__))
repositories = ["AlgorithmStudy", "javaworkspace", "SSAFY_APS", "TIL", "today"]

def pull_repositories():
    for repo in repositories:
        repo_path = os.path.join(base_directory, repo)
        
        # 레포지토리 경로로 이동
        if os.path.exists(repo_path):
            print(f"Pulling updates for {repo}...")
            try:
                # 'git pull origin master' 명령어 실행
                result = subprocess.run(
                    ["git", "-C", repo_path, "pull", "origin", "master"],
                    check=True,
                    stdout=subprocess.PIPE,
                    stderr=subprocess.PIPE,
                    text=True
                )
                
                # 명령어의 출력 내용 확인
                output = result.stdout.strip()
                if "Already up to date." in output:
                    print(f"👾{repo}은 최신 버전입니다.\n")
                else:
                    print(f"🏆{repo} pull 성공!\n")
                    print(output)  # 실제 업데이트 내용 출력
            except subprocess.CalledProcessError as e:
                # 실패했음을 출력
                print(f"🍷{repo} pull 실패😭\nError: {e.stderr}\n")
        else:
            print(f"🏹{repo} 경로 이상🙄: {repo_path}\n")

if __name__ == "__main__":
    pull_repositories()
