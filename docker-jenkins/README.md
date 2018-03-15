### To run jenkins as docker container


```
$docker run -p 8080:8080 -p 50000:50000 jenkins
```

### To attach a volume to maintain the jenkins config and jobs

```

$ docker run -p 8080:8080 -p 50000:50000 -v /your/home:/var/jenkins_home jenkins
```
