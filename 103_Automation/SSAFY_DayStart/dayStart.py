import subprocess

subprocess.run(["python", "pull_repo.py"])
subprocess.run(["python", "creates_dailynote.py"])
subprocess.run(["python", "openWeb.py"])
