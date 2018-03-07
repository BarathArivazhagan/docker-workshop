# docker network web db

#### To create a docker network and connect the containers to the created network and establish the communication between the containers 


```

$ docker network create web-db-network


$ docker network ls


$ docker run --name mysql-service -p 3306:3306 --network web-db-network  -e MYSQL_ROOT_PASSWORD=root  -d mysql


$ docker run --name spring-db -p 8080:8080 -d  --network web-db-network -e SPRING_DATASOURCE_URL=jdbc:mysql://mysql-service:3306/jpadb  spring-db


$ docker network inspect  web-db-network

[
    {
        "Name": "web-db-network",
        "Id": "20efbcaed1e8de1d1b08692280f72d7d189b3f8e526f548717d66a597fb7c88a",
        "Created": "2018-03-07T14:46:15.225398715Z",
        "Scope": "local",
        "Driver": "bridge",
        "EnableIPv6": false,
        "IPAM": {
            "Driver": "default",
            "Options": {},
            "Config": [
                {
                    "Subnet": "172.18.0.0/16",
                    "Gateway": "172.18.0.1"
                }
            ]
        },
        "Internal": false,
        "Attachable": false,
        "Ingress": false,
        "ConfigFrom": {
            "Network": ""
        },
        "ConfigOnly": false,
        "Containers": {
            "13b46cbf8d7d586b54946a5cd1d81b2c1b256bbaf7be3ec1a09403479b05f279": {
                "Name": "spring-db",
                "EndpointID": "668cfff1945d1d8a8874d73014f7529ddb6059ff1cbee37c9ca9ed6ab7b8e12c",
                "MacAddress": "02:42:ac:12:00:03",
                "IPv4Address": "172.18.0.3/16",
                "IPv6Address": ""
            },
            "1dfd2f8899dcb2207d26d42d3f51a6f390e017cab0fcb67a79fd0ef3440654a0": {
                "Name": "mysql-service",
                "EndpointID": "7e7e9050d37d7253caa8407cbd38a7a16ffa26e5b75880c98eb77396bd3649d8",
                "MacAddress": "02:42:ac:12:00:02",
                "IPv4Address": "172.18.0.2/16",
                "IPv6Address": ""
            }
        },
        "Options": {},
        "Labels": {}
    }
]


```
