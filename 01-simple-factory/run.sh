#!/bin/bash
fileName=$(basename `pwd`).jar
if [ -d "build" ]; then
    rm build -rf
fi
mkdir build
javac -sourcepath src -d build src/Main.java &&
jar cvfm ${fileName} MANIFEST.MF -C build . &&
echo -e "\n--------------------------------\n build success \n release ${fileName}\n--------------------------------\n"
rm build -rf &&
java -jar ${fileName} ${*}