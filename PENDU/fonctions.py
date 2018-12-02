# coding: utf8
import random
import os
import pickle

def mot():
	#on recupere tous les mots du fichier test dans maliste
	#et on en revoie 1 au hasard
	fichier=open("test.txt","r")
	contenu=fichier.read()
	maliste=contenu.split("\n")
	fichier.close
	indexMot=random.randrange(len(maliste)+1)
	return maliste[indexMot]

def scores_w(score):
	fichier=open("score","wb")
	mon_pickler = pickle.Pickler(fichier)
	mon_pickler.dump(score)
	fichier.close

def scores_r():
	fichier=open("score","rb")
	mon_depickler = pickle.Unpickler(fichier)
	mes_scores = mon_depickler.load()
	fichier.close
	return mes_scores





