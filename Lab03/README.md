


**Exercice 1**

Pour executer jacoco, j'ai fait  la commande: ./bin/jacoco



Après des ajouts dans les tests, soit:

1- Ajout de tests pour vérification de la méthode toString(), alors on a écris une date et on a vérifié si c'est le bon output qui va sortir en String.

2- Ajout de tests pour setMonth(), mais on n'atteint pas le coverage maximale puisque on peut pas avoir plus que 12 et moins que 1 en même lieu.

3- LeapYear(), on choisit annee divisible par 400.

4- isThirtyDayMonth() manquait le mois de seotembre qui est 30 jours.

5- J'ai a aussi ajouté des tests dans la méthode equals() pour tester si ce n'est pas la même date, ou pas même mois ou pas même année.

6- J'ai verifie avec des mauvaises entrées setDay() que la réponse est fausse si on entre un jour plus que 30, plus que 29 en février et plus que 30 pour les mois moins que 31.

7- EndOfMonth(), on a ajouté des tests, mais pas full covergae puisque en février il n'y a pas plus que 28 jours dans les années non leap alors il fallait que ca soit le premier mars mais ce test n'a pas passé, ce qui cause que il y a missed branch dans les résultats finaux.

**Exercice 2**

Pour la réfactoration du code, j'ai modifié la méthode setDate(), en reduisant les exemptions, soit en jumellant deux exceptions enesmeble. Puisque on ne peut pas avoir un mois moins que 1 jour et plus que 31 jours. De la même manière, j'ai jumelé les leap year ensemble soit on ne peut pas avoir plus que 28 ou 29 jours pour le mois de fevrier.

 
Après la réfraction du code et l'ajout des tests, j'obtient un très meilleur pourcentage, soit on est allé de 79 coverage jusqua 98 coverage.


