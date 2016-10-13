# list-converter

In this project showed how to convert a list of objects of one type into list of object of another type. Input arrives as json, then using custom util it transforms into object of Target class.

Classes description:

* Source.java - object that will come from outside
* Target.java - object that server will produce
* Controller.java - test controler that listens on "/convert" url
* SourceToTargetConverter.java - util which produce Target from Source object
* DemoApplication.java - main Spring Boot class which runs the app

test input:

```
[
  {"firstName":"yevhen","lastName":"shumakovych", "age": 20},
  {"firstName":"ivan","lastName":"skovoroda", "age": 22},
  {"firstName":"vasiliy","lastName":"pupkin", "age": 19}
]
```
test output:

```
[
  {"fullName": "yevhen shumakovych","age": 20},
  {"fullName": "ivan skovoroda","age": 22},
  {"fullName": "vasiliy pupkin","age": 19}
]
```
To run project you need:


1. Download zip or clone via git.
2. Set run configuration to run it as Spring Boot project and choose DemoApplication as main class.
3. Run the project.
4. To test it out you need to have Postman or other Rest Client. 
5. Choose POST method, in address url type "localhost:8080/convert".
6. Go to Body tab and choose "raw", then on the right side it become "Text" dropdown menu, select JSON/application there.
7. Insert test input into text field below and click "Send" button.
8. See the output.
