CLASSPATH = lib/*:.

test:MarkdownParse.class MarkdownParseTest.java
	javac -cp $(CLASSPATH) MarkdownParseTest.java
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest	

MarkdownParse.class:MarkdownParse.java
	javac -cp $(CLASSPATH) MarkdownParse.java

lab-report:MarkdownParse.class MarkdownParseLabTest.java
	javac -cp $(CLASSPATH) MarkdownParseLabTest.java
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseLabTest	

make:
	javac -cp $(CLASSPATH) MarkdownParse.java
	java -cp $(CLASSPATH) MarkdownParse test-files/

TryCommonMark.class:TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java

commonmark: TryCommonMark.class

