Normalement, avec ce dossier, on peut directement importer le projet dans Eclipse.

- Dans la barre de menu : File > Import > General > Existing Projects into Workspace

- Selon que le projet soit un dossier ou une archive, la m�thode d'importation n'est pas exactement la m�me. Les deux versions sont fournies, prenez ce que vous pr�f�rez.



METHODE DOSSIER

- Dans le menu qui s'ouvre, cliquer sur Browse � droite du champ "Select root directory" puis s�lectionner le r�pertoire o� se trouve tous les fichiers (Ici c'est "Aero-TASAPIHA").


METHODE ARCHIVE

- Dans le menu qui s'ouvre, cliquer sur Browse � droite du champ "Select archive file" puis choisir l'archive correspondante (Ici c'est "Aero-TASAPIHA.zip").




- En principe, le nom du Dossier et son chemin devraient apparaitre dans le champ blanc de "Projects:", y'a plus qu'� cocher le dossier en question et cliquer sur Finish en bas.



SI JAMAIS DES PROBLEMES PERSISTENT

- Depuis le Package Explorer (Gauche de l'interface), clic droit sur le nom du projet > "Build Path" > "Add Libraries..."

- S�lectionner la "JRE System Library", valider puis laisser la s�lection sur "Workspace default JRE" dans la fen�tre suivante et valider de nouveau.




Fini ! On peut compiler etc, tout fonctionne normalement.