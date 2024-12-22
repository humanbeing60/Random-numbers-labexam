FROM  openjdk:latest

WORKDIR /app

COPY . /app

RUN javac RandomNumber.java

CMD [ "java", "RandomNumber" ]



