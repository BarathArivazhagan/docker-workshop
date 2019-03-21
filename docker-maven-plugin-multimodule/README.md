# Docker maven plugin multimodule

This project demonstrates on using docker maven plugin with maven goals


### How to build the project

- Clone the repository

```
$ git clone https://github.com/BarathArivazhagan/docker-workshop.git
$ cd docker-workshop/docker-maven-plugin-multimodule
```

- Run maven install goal

```
$ mvn clean install -DskipTests
```

- Verify the docker images built

```
$ docker images | grep service 

service-b  latest  d8bb472231d3    3 minutes ago       119MB
service-a  latest  ebb7f1f05ba6    3 minutes ago       119MB
```
