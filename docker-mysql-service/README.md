### docker-mysql-service

Instructions to start mysql service as docker container with volume

```
$ docker volume create mysql_data
```

```
$ docker volume inspect mysql_data
```


```
$ docker run --name mysql -v mysql_data:/var/lib/mysql -p 3306:3306  -e MYSQL_ROOT_PASSWORD=password  -d mysql:latest
```


```
$ cd /var/lib/docker/volumes/mysql_data/_data
```
