## Exercice 1 

Je run cette commande **bin/run** et puis je visite **http://localhost:8080**

![image](Assets/JarFileRun.png)

<div align="center">
  
| Cas de Test | Résultats Escomptés | Résultats Actuels | Verdict (Succès, Échec, Non-concluant) |
|:----------:|:-------------:|:------:|:------:| 
1| Accepté | Accepté <br> ![image](Assets/TC1.png) <br> ![image](Assets/TC1.1.png)  |Succès |
2| Accepté | Accepté <br> ![image](Assets/TC2.png) <br> ![image](Assets/TC2.1.png)  |Succès |
3| Accepté | Accepté <br> ![image](Assets/TC3.png) <br> ![image](Assets/TC3.1.png)  |Succès |
4| Accepté | Accepté <br> ![image](Assets/TC4.png) <br> ![image](Assets/TC4.1.png)  |Succès |
5| Err1 | Err1 <br> ![image](Assets/TC5.png) |Succès |
6| Err2 | Err2 <br> ![image](Assets/TC6.png) |Succès |
7| Err3 | Err3 <br> ![image](Assets/TC7.png)|Succès |
8| Err4 et Err3 | Err4 et Err3 <br> ![image](Assets/TC8.png)|Succès |  
9| Err5 | Err5 <br> ![image](Assets/TC9.png)|Succès |   
  
</div>

## JUnit Parameterized Test
Resultat après execution du test avec la commande **bin/test** :
![image](Assets/Ex2Test.png)

## Exercice 2
Resultat après execution du test avec la commande **bin/test** :
![image](Assets/Ex2.1Test.png)

**Capture de parameterized test pour des cas OK et qui retournent une date :**
![image](Assets/TestOK.png)

**Capture de parameterized test pour des cas d'exception et qui retournent une erreur :**
![image](Assets/TestException.png)

**Capture d'un code de test sans exception :**


![image](Assets/CodeTestOK.png)

**Capture d'un code de test avec exception :**
![image](Assets/CodeTestException.png)

