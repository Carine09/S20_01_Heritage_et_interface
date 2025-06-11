Ecris les classes qui contiendront les données suivantes ainsi que des fonctions pour les tester.

Nom	Type de vaisseaux	Taille	Nombre de canon	Capacité en transport homme
Acclamator	Croiseur	752	 	700
Corvette corellienne CR90	Croiseur	150	 	165
X-wing	Intercepteur	12,5	2	 
Y-wing	Intercepteur	23	2	 

* Tous les Vaisseaux peuvent retourner leur caractéristiques (Nom, Type et Taille)
* Les Croiseurs peuvent charger ou décharger des troupes (représentées par un nombre d’homme)
* Les Intercepteurs peuvent tirer et recharger, ils ne peuvent tirer qu’une fois par canon après quoi ils devront recharger avant de pouvoir tirer de nouveau. Ces actions consistent simplement à écrire dans la console “Tire!” ou “Recharge”

Liste des étapes :

* Ecris 3 classes Vaisseau, Intercepteur et Croiseur en y incluant de l’héritage
* Rajoute à ces classes des attributs en fonction des données que tu devras stocker.
* Rajoute à ces classes des méthodes en fonctions des capacités de chacun de ces vaisseaux.
* Instancie deux Acclamator et un X-wing
* Ecris une fonction qui prend un Vaisseau en paramètre et qui affiche ses capacités dans la console.
* Charge l’un des Acclamator de 600 personnes, puis de 200 personnes (ce deuxième ajout ne devrait pas fonctionner car cela dépassera la capacité du vaisseau)
* Fais tirer ton X-wing 3 fois de suite (le 3ème coup ne dois pas fonctionner), recharge puis tire de nouveau.