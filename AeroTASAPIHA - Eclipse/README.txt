Normalement, avec ce dossier, on peut directement importer le projet dans Eclipse.

- Dans la barre de menu : File > Import > General > Existing Projects into Workspace

- Selon que le projet soit un dossier ou une archive, la méthode d'importation n'est pas exactement la même. Les deux versions sont fournies, prenez ce que vous préférez.



METHODE DOSSIER

- Dans le menu qui s'ouvre, cliquer sur Browse à droite du champ "Select root directory" puis sélectionner le répertoire où se trouve tous les fichiers (Ici c'est "Aero-TASAPIHA").


METHODE ARCHIVE

- Dans le menu qui s'ouvre, cliquer sur Browse à droite du champ "Select archive file" puis choisir l'archive correspondante (Ici c'est "Aero-TASAPIHA.zip").




- En principe, le nom du Dossier et son chemin devraient apparaitre dans le champ blanc de "Projects:", y'a plus qu'à cocher le dossier en question et cliquer sur Finish en bas.



SI JAMAIS DES PROBLEMES PERSISTENT

- Depuis le Package Explorer (Gauche de l'interface), clic droit sur le nom du projet > "Build Path" > "Add Libraries..."

- Sélectionner la "JRE System Library", valider puis laisser la sélection sur "Workspace default JRE" dans la fenêtre suivante et valider de nouveau.




Fini ! On peut compiler etc, tout fonctionne normalement.