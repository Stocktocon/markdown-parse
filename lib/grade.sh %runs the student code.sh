grade.sh %runs the student code

git clone $1 
git clone git@github.com/  /mdp-tests

cp mdp-tests/GradeTests.java markdown-parse/

cd markdown-parse

javac -cp ........ GradeTests.java MDP.java
java -cp ........ junit Runner GradeTests 