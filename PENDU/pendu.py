# coding: utf8
import os
import random
import fonctions
from donnees import *

# motMystere=""
# chance = 8
# motmot = []
# score = dict()
# fiche = dict()

#importe le contenu du fichier score ou le crée s'il n'existe pas
if os.path.isfile("score")!=True:
	fonctions.scores_w(fiche)
else:
	fiche=fonctions.scores_r()

print (fiche)



#appele de la fonction mot pour tirer un mot au hasard
motMystere =fonctions.mot()

print (motMystere.upper())





print("Bonjour, voici le jeu du pendu\n\n")
print("Trouver le mot mystère en 8 coups Max\n\n")

nom = input ("quel est votre nom ? \n")

if nom in fiche:
	print("vous etes connu")
else:
	fiche[nom]= 0
	


print (fiche)



for lettre in motMystere:
 	motmot.append(lettre)
print (motmot)
while partie:
	while chance!=0 and motmot!=motCachee:
		choix = input ("choisissez une lettre ?")
		for index,elt in enumerate(motmot):
			if elt==choix:
				motCachee[index]=elt
			
		print ("".join(motCachee).upper())	
		chance-=1
		print ("Il vous reste {} coups".format(chance))
	print("vous avez trouvé le motMystere")
	ancien=fiche.get(nom)
	fiche[nom]=chance+ancien
	score.update(fiche)
	fonctions.scores_w(score)
	partie=False
 

os.system("pause")



