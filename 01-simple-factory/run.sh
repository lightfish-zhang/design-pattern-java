if [ ! -d "build" ]; then
  mkdir build
fi
javac -sourcepath src -d build src/Main.java &&
java -classpath build Main $*