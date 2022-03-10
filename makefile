CLASSPATH = lib/*:.

test:MarkdownParse.class MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest	

MarkdownParse.class:MarkdownParse.java
	javac MarkdownParse.java

lab-report:MarkdownParse.class MarkdownParseLabTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseLabTest.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseLabTest	

make:
	javac MarkdownParse.java
	java MarkdownParse test-files/

TryCommonMark.class:TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java

commonmark: TryCommonMark.class
	
