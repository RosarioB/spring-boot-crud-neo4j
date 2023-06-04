# spring-boot-rest-api-crud-neo4j
Spring Boot REST APIs with CRUD for Neo4j

The brach with the working APIs is:

- ***basic_crud_w***: it contains basic transactional REST APIs with CRUD for Neo4j

It is necessary to explain how the post method works on the movies nodes. 

For example if you call the post method at http://localhost:8080/api/movies without expressing the ids for nodes and relationships, like this:

```
{
   "title":"Godfather",
   "description":"Gangster",
   "actorsAndRoles":[
       {
           "roles":["Michael Corleone"],
           "person":{
               "name":"Al Pacino",
               "born":"25-04-1940"
           }
       }
   ]
}
```

Spring data Neo4j will create a new node Movie, a new node Person and a new relationship ACTED_IN, like this:

![image](https://github.com/RosarioB/spring-boot-crud-rest-api-neo4j/assets/81154242/77188630-85e2-4bbd-8103-4a4548c4a34f)

Notice that in this case Neo4j will assign a new id to the nodes and the relationship.

Instead if you specify the ids of existing nodes and relationships, like this:

```
{
   "id":2,
   "title":"Gladiator",
   "description":"Historical",
   "actorsAndRoles":[
       {
           "id":1,
           "roles":["Maximus"],
           "person":{
               "id":3,
               "name":"Russel Crowe",
               "born":"27-01-1963"
           }
       }
   ]
}
```

Spring data Neo4j will "override" the properties of each node and relationships with the specified ids. 

So it will not create new nodes or relationship (if they already exist) but it will modify the nodes and the relationships with the ids specified in the request.


