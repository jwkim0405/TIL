# JDBC (Java DataBase Connectivity)

## JDBC

### 개요

* Java와 DBMS(ex. MySQL)을 연결해보자!
* Java 진영에서, 내가 설계도(도면)를 만들어놓을거야! 
  * 가져와 (MySQL이든 Oracle이든)
  * 통로 뚫어
  * 데이터 주고 받아 (SQL <-> DATA)
  * 통로 폐쇄해 

## JDBC란?

* Java 프로그램에서 DB에 일관된 방식으로 접근할 수 있도록 API를 제공하는 클래스의 집합
* 데이터베이스에서 자료를 쿼리하거나 업데이트하는 방법을 제공
* Java에서는 JDBC를 이용하여 SQL을 DBMS와 주고받음.
* DBMS의 종류와 관계 없이 사용 가능. (약간의 설정만 조금 수정하면 가능)