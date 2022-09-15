FROM openjdk:11
VOLUME /tmp
EXPOSE 8090
ADD target/Twitter-0.0.1-SNAPSHOT.jar Twitter-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /Twitter-0.0.1-SNAPSHOT.jar" ]
