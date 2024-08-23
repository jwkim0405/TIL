import os
import sys

class Algo:
    schedule = {
        'day01_0729월': '배열1차원',
        'day02_0730화': '정렬',
        'day03_0731수': '배열2차원',
        'day04_0801목': '문자열',
        'day05_0805월': 'Stack1',
        'day06_0806화': 'Stack2',
        'day07_0807수': 'Queue1',
        'day08_0808목': 'Queue2',
        'day09_0809금': '문제풀이1',
        'day10_0813화': 'LinkedList',
        'day11_0814수': 'Tree',
        'day12_0816금': 'Heap',
        'day13_0826월': '자료구조',
        'day14_0827화': '부분집합',
        'day15_0828수': '분할정복',
        'day16_0829목': '백트래킹',
        'day17_0830금': '문제풀이2',
        'day18_0902월': 'SW역량테스트',
        'day19_0903화': '부분집합',
        'day20_0904수': '그래프DFSBFS',
        'day21_0905목': '크루스칼',
        'day22_0906금': '프림다익스트라',
        'day23_0909월': '위상정렬',
        'day24_0910화': 'CT1',
        'day25_0911수': 'CT2',
        'day26_0912목': 'CT3',
        'day27_0912금': '패턴매칭과PJT'
    }
    
    def workspace_APS(self):
        # open workspace and go in
        os.system('mkdir SSAFY_APS')
        os.chdir('SSAFY_APS')

        for java_project, package in self.schedule.items():

            # make a project `day00_mmddd` and go in
            os.system(f'mkdir {java_project}')
            os.chdir(java_project)

            # make src/ and go in
            os.system('mkdir src')
            os.chdir('src')

            # make package/, go in and make, write code 
            self._make_package_write_code(package)

            # _go back to the project `package`
            os.chdir('..')

            # _go back to the project `day00_mmddd`
            os.chdir('..')

            # _go back to the workspace `SSAFY_APS`
            os.chdir('..')


    def package_each_day(self):
        
        sys.stdin = open ('input.txt', 'r', encoding='UTF-8')

        # input.txt  format
        '''
        첫줄에는 프로젝트 명             day01_0729월
        문제 개수 == 패키지 개수         3
        회사명_문제번호_문제이름          SWEA_2068_최대수구하기 
                                    SWEA_1984_중간평균값구하기
                                    SWEA_1206_View
        '''

        # move into `SSAFY_APS`
        os.chdir('SSAFY_APS')
        
        day = input()
        cnt = int(input())
        print(f'🗓️ 오늘은 {day}\n🗂️ {cnt}개의 미션이 있습니다.')

        # move into java_project
        os.chdir(day)

        # move into src
        os.chdir('src')

        packages = [str(input()) for _ in range(cnt)]

        for package in packages:
            self._make_package_write_code(package)
            
            # _go back to package
            os.chdir('..')


    def _make_package_write_code(self, package):
        # make package/, go in 
        os.system(f'mkdir {package}')   
        os.chdir(f'{package}')

        # make java 
        os.system('touch Solution.java')

        # write code
        f = open('Solution.java','w', encoding='utf-8')
        f.write(f'package {package};\n\n')
        f.write('public class Solution {\n\n}')
        f.close()