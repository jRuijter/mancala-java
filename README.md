Dit project is een opdracht uitgevoerd tijdens mijn opleidingstraject bij Sogyo. Verschillende branches zijn verschillende delen van de uiteindelijke opdracht. De meest uitgebreide branch (mvc-oo) is een web applicatie waarop de basis spelregels van het oude, Afrikaanse bordspel Mancala zijn geïmplementeerd. Om de servers op te starten typ je de command (indien nodig eerst "npm install" en daarna ) "npm run start" in de client/ repository. Vervolgens run je api\src\main\java\mancala\App.java en kan je beginnen met spelen! De rest van de README files zijn een beschrijving van de opdracht zoals gegeven.



Mancala
=======

Dit is de basisopzet voor jouw Mancala-implementatie. Om het project goed te openen, zul je het bestaande projectbestand (pom.xml) moeten importeren in je IDE. Dit is een file die het project beschrijft volgens de Apache Maven structuur. Voor Eclipse heb je de m2e-plugin nodig.

Mapstructuur
------------

Gebruik `src/main/java` voor de implementatie van het spel en `src/test/java` voor de unit tests van de implementatie. Heb je bestanden nodig in jouw spel of om een test op te zetten, plaats deze bestanden in de corresponderende map `resources`.

Gebruik packages om jouw code gestructureerd te houden. Dit geldt zowel voor de implementatie als de testen!

Unit testen
-----------

Voor het unit testen kun je gebruik maken van het framework JUnit. Maven kan de jar downloaden, als dat niet lukt kun je de jars [downloaden](https://github.com/junit-team/junit/wiki/Download-and-Install) en toevoegen als dependency.


.gitignore
----------

Sommige bestanden wil je niet in de repository van het project plaatsen. Dit kan bijvoorbeeld gaan om wachtwoorden. Maar ook de configuratiebestanden van jouw IDE wil je niet in het project plaatsen, omdat een collega niet dezelfde configuraties heeft, of een hele andere IDE gebruikt. Daarnaast wil je ook de gecompileerde bestanden niet in de repository hebben.

Binnen GIT kun je die bestanden dan in .gitignore zetten. Alle bestanden of Reguliere Expressie-patronen die je hier in plaatst, zullen worden genegeerd door GIT.

|Expressie|Resultaat|
|:--|:--|
|*.iml|Alle bestanden die eindigen op `.iml`|
|bin|Een bestand of map die `bin` heet|

Markdown
--------

Dit bestand is geschreven in [Markdown](http://daringfireball.net/projects/markdown/), een simpele tekst-naar-HTML conversietool. Dit bestand wordt door GitLab geïnterpreteerd en als beschrijving bij het project getoond.
