# OpenCFSD Java Assembly.
## development Branch.

---
## Branches.
 - main.
 - DEVELOPMENT.

---
## Using.
### Ubuntu LINUX.
version: Ubuntu 24.04.4 LTS

### IntelliJ IDEA
version: 2026.1.3.

---
### Dependencies.
#### The Java Development Kit (JDK).
````
sudo apt install openjdk-8-jdk
````
#### Java Runtime Eenvironment (JRE).
````
sudo apt install openjdk-8-jre
````
#### GCC toolchain.
```` 
sudo apt install build-essential gdb
````
#### snapd.
```` 
sudo apt install snapd
````
#### IntelliJ-idea.
````` 
sudo snap install intellij-idea --channel=2026.1/stable --classic
`````

#### Java Native Access Library.
##### edit pom.xml.
````
 <dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna</artifactId>
	    <version>5.13.0</version> <!-- Use the latest version -->
	</dependency>
	<dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna-platform</artifactId>
	    <version>5.13.0</version> <!-- Use the latest version -->
	</dependency>
````

---
## Implements.
 - ### CLIBWriteQue dll(s).
 - ### CLBILaunchQue dll(s).
 - ### OpenEpiCentre dll.

---
## How To Guildes.
### Stack Flow - From Client Input Scanner To Server And Back To Client.
 - [GitHub ReadMe - How To Guide.]()
   
### Wrapper Imports / Exports and Native IO.
 - [Wrapper Imports and Native IO.](https://github.com/OpenAvril/Concurrent-Full-Stack-Development/blob/main/readme/Wrapper_Imports.md)
