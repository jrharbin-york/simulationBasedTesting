CLASSPATH=`cat classpath`
/usr/lib/jvm/java-11-openjdk-amd64/bin/java --illegal-access=permit -Dfile.encoding=UTF-8 -classpath $2/target/classes/:$CLASSPATH $1
