### Seed project based on akka-http scala giter8 template


```
>sbt docker:publishLocal
>docker run --rm -p8080:8080 hello-world:0.1-SNAPSHOT

```

http://0.0.0.0:8080/users should return an empty users list

Check project/target/docker/stage/Dockerfile