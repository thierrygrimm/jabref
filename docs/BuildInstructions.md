Diese Datei soll für neue Benutzer dokumentieren, wie sie folgende Tasks mit Gradle durchführen.

Erstellen der API Dokumentation

~~~bash
./gradlew javadoc
~~~

Eine Übersicht über alle von JabRef benutzten Bibliotheken erhalten

~~~bash
./gradlew dependencies
~~~

Testen ob der Code der Unit-Tests den Stilvorgaben entspricht

~~~bash
./gradlew checkstyleTest
~~~

Erstellen eines Zip Files, welches nach dem Entpacken eine lauffähige Version von JabRef enthält.

~~~bash
./gradlew jlinkZip
~~~


Beschreibung Task ```generateSource```:
Generates all necessary (Java) source files.


