# JavaPractice

## Tips for Compilation

1. Run this command in the terminal:

```
echo $CLASSPATH
```

- If it returns nothing, run the following commands in the terminal:

```
export CLASSPATH=“/opt/java/classes:./classes:.”
```
- Lets breakdow the classpath statement:
    - The program will look for the class file from left to right of the export statement. 

2. Compile the code using the following command in the root folder:

```
javac -d classes root/subfolder/filename.java
```

3. Run the code

```
java root.subfolder.filename
```

## Conventions for Java Programming

1. One class per file
2. First program line will by the package declaration:

```java
package myapp.core
```

3. Class name should be the same as the filename

## Committing to Github

1. Do not commit .class files to github.
2. Do not commit .DS_Store files to github.
3. Do not commit /node_modules to github

- In the .gitignore file, ensure that `*.class` is in it

## Initializing Variables

These are initialized variables:

```java
float result = 0f;
String soperator = "";
```

These are _not_ initialized variables:

```java
float result;
String soperator;
```
