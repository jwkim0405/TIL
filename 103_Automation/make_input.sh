#!/bin/bash
# /today 디렉토리로 이동하여 리포지토리 최신화
cd C:/SSAFY/GIT/today || { echo "Error: 'today' 디렉토리로 이동할 수 없습니다."; exit 1; }
git pull origin || { echo "Error: 리포지토리를 최신화할 수 없습니다."; exit 1; }
cd - || { echo "Error: 이전 디렉토리로 돌아갈 수 없습니다."; exit 1; }

# 날짜 설정
current_date=$(date +"%m%d") # 오늘 날짜를 mmdd 형식으로 얻기
current_day=$(date +"%a") # 오늘의 요일을 얻기 (e.g., Mon, Tue, ...)

# input.txt 파일이 존재하는지 확인
if [[ ! -f "input.txt" ]]; then
  echo "Error: input.txt 파일을 찾을 수 없습니다."
  exit 1
fi

# day String list
day_list=(
    'day01_0729월'
    'day02_0730화'
    'day03_0731수'
    'day04_0801목'
    'day05_0805월'
    'day06_0806화'
    'day07_0807수'
    'day08_0808목'
    'day09_0809금'
    'day10_0813화'
    'day11_0814수'
    'day12_0816금'
    'day13_0826월'
    'day14_0827화'
    'day15_0828수'
    'day16_0829목'
    'day17_0830금'
    'day18_0902월'
    'day19_0903화'
    'day20_0904수'
    'day21_0905목'
    'day22_0906금'
    'day23_0909월'
    'day24_0910화'
    'day25_0911수'
    'day26_0912목'
    'day27_0912금'
)

# 오늘 날짜에 해당하는 day String 찾기
new_first_line=""
for day_string in "${day_list[@]}"; do
    if [[ $day_string =~ day[0-9]+_${current_date}(.*) ]]; then
        new_first_line=$day_string
        break
    fi
done

# 해당 날짜에 맞는 day String을 찾지 못했을 경우 에러 처리
if [[ -z $new_first_line ]]; then
    echo "Error: 오늘 날짜에 해당하는 day String을 찾을 수 없습니다."
    exit 1
fi

# 변수 설정
readme_file="C:/SSAFY/GIT/today/README.md"
output_file="input.txt"

# README.md 파일이 존재하는지 확인
if [[ ! -f "$readme_file" ]]; then
  echo "Error: $readme_file 파일을 찾을 수 없습니다."
  exit 1
fi

# "SWEA_nnnn_*" 형식의 문장을 찾고, 개수를 센다
count=0
matches=()

# 파일을 읽어와서 라인별로 처리
while IFS= read -r line; do
  # 정규식에 매칭되는 모든 부분을 찾기 위해 grep과 반복 사용
  while [[ $line =~ SWEA_[0-9]{4}_[^[:space:]]+ ]]; do
    match="${BASH_REMATCH[0]}"
    # 공백과 하이픈 제거
    cleaned_line=$(echo "$match" | sed 's/[ -]//g')
    matches+=("$cleaned_line")
    ((count++))
    # 다음 부분을 찾기 위해 라인에서 매칭된 부분 제거
    line="${line#*$match}"
  done
done < "$readme_file"

# 결과를 output_file에 작성
{
  echo "$new_first_line" # 새로운 첫 번째 줄을 추가
  echo "$count" # 찾은 문장의 개수를 출력
  for match in "${matches[@]}"; do
    echo "$match" # 각 문장을 출력
  done
} > "$output_file"

if [[ $count -gt 0 ]]; then
  echo "새로운 첫 번째 줄: $new_first_line"
  echo "찾은 문장의 개수: $count"
  echo "각 문장은 $output_file 파일에 저장되었습니다."
else
  echo "조건에 맞는 문장을 찾을 수 없습니다."
fi
