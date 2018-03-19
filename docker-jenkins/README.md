### To run jenkins as docker container


```
$ docker run -p 8080:8080 -p 50000:50000 jenkins
```

### To attach a volume to maintain the jenkins config and jobs

```
$ docker run -p 8080:8080 -p 50000:50000 -v /your/home:/var/jenkins_home jenkins
```

### To use docker host into jenkins container, bind mount docker volume to the jenkins container

```
$ docker run -d -v /var/run/docker.sock:/var/run/docker.sock  -v $(which docker):/usr/bin/docker -p 8080:8080 jenkins
```

### To use docker with maven installed

```
$ git clone  https://github.com/BarathArivazhagan/docker-workshop.git
$ cd docker-workshop/docker-jenkins
$ docker build -t jenkins-maven . 
$ docker run -d -v /var/run/docker.sock:/var/run/docker.sock  -v $(which docker):/usr/bin/docker -p 8080:8080 jenkins 
```
