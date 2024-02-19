Pour compiler: javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java

Pour run les tests: java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

tic_java est un projet crée en utilisant l'environnement de développement Intellij IDEA. Cependant, on peut visualiser nos resultats de tests sur Intellij IDEA directement
