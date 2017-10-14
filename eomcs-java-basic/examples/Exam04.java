//: ## .java 소스 파일을 분리하기
//: - 자바 소스 파일을 별도의 폴더로 분리해 관리하는 방법을 알아보자.
//: - 이렇게 하는 이유는 무엇인가? 


public class Exam04 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

//: ### 프로젝트 폴더의 기본 구조
//: - 실무에서 자바 프로젝트 폴더의 기본 구조는 Maven 빌드 도구에서 사용하는 프로젝트 구조를 따른다.
//: - 프로젝트 폴더 구조
//:   $프로젝트_폴더
//:     /src
//:         /main
//:             /java           <= 자바 소스 파일을 두는 폴더
//:             /resources      <= 자바 애플리케이션에서 사용할 설정 파일을 두는 폴더
//:             /webapp         <= 웹 애플리케이션에서 사용할 웹 자원을 두는 폴더
//:         /test
//:             /java           <= 자바 테스트 관련 파일을 두는 폴더
//:             /resources      <= 자바 테스트에서 사용할 설정 파일을 두는 폴더
//:
//: [Maven 프로젝트 생성]
//: - Gradle 빌드 도구를 이용하여 Maven 프로젝트 기본 폴더 구조를 자동으로 생성할 수 있다.
//: - 사용법
//:     => $프로젝트폴더> gradle init --type java-application
//:     => 위 명령을 실행하면 폴더 뿐만아니라 Gradle 기본 설정 파일이 함께 생성된다.
//:
//: [javac 컴파일러 사용법]
//: > javac [소스파일이_있는_폴더경로/소스파일명]
//:     => $프로젝트폴더> javac -d bin -encoding UTF-8 src/main/java/Exam04.java
//:     => 개발이 완료되면 .class 파일만 추출하여 .jar 파일에 묶어 배포한다.
//:        이를 위해 .class 파일을 보다 쉽게 추출할 수 있도록 별도의 폴더에 분리하는데,
//:        소스 파일 또한 관리하기 쉽도록 별도의 폴더에 저장하는 것이 일반적이다.
//:
