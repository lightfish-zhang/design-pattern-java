#!/bin/bash
cd `dirname $0`
fileName=$(basename `pwd`).jar
if [ -d "build" ]; then
    rm build -rf
fi
mkdir build
javac -sourcepath src -d build -classpath ../../dependent/hibernate3.jar src/*.java &&
jar cvfm ${fileName} MANIFEST.MF -C build . &&
echo -e "\n--------------------------------\n build success \n release ${fileName}\n--------------------------------\n" &&
rm build -rf &&
java -jar ${fileName} ${*}