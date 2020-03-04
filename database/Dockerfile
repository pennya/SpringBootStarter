FROM java:8
EXPOSE 8080
MAINTAINER 0.0.1 rlawlgns077@naver.com
ARG JAR_FILE=build/libs/database-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} database-0.0.1.war
ENTRYPOINT ["java","-jar","/database-0.0.1.war"]

# Dockerfile 디렉터리에서 아래 명령 입력
# docker build -t spring-boot-database .
# docker run --name spring-boot-database-runner -p 5000:8080 spring-boot-database


# docker 이미지 삭제
# docker rmi [이미지id]
