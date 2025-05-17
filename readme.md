### Setup of Basic Gradle using CLI
```agsl
gradle init --use defaults --type java application 
```
The above command will setup a basic Gradle Project :

### In project a jar is executable , you need to setup the property in build.gradle to identify what is the main class to execute .
```asgl 
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}
```
```agsl
./gradlew build
```
The above command can build your project.
```agsl
./gradlew jar
```
the above command creates a jar  : 

```agsl
java -jar build/libs/filername.jar
```
The above command will execute your project code 