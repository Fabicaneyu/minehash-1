#!/bin/bash
function central(){
           copia_bin
           validacao_java
           jar
}

function copia_bin(){
           bin_jar=$(ls /usr/local/bin/  |  grep   minehashh.jar)
           grep_script=$(ls /usr/local/bin  |  grep script_instalacao)
           if [ $bin_jar  -z  ]  2> /dev/null
           then
           sudo cp minehashh.jar    /usr/local/bin  2> /dev/null
           elif    [  $bin_script  -z  ]   2> /dev/null
           then
sudo java -jar /usr/local/bin/minehashh.jar

fi
}

function validacao_java(){

which java | grep –q  java  2> /dev/null

if [  $? -eq  0  ]   
	then echo “Instalando minehash”
else
	sudo apt-get install openjdk-8-jdk
fi
}


function jar(){
java -jar minehashh.jar    2>/dev/null
               if [  $?  -ne  0  ]
	then 
	sudo java -jar / usr/local/bin/minehashh.jar
 fi
} 
central 
