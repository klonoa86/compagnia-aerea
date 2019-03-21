## :ledger: Come iniziare

Quest'applicazione è stata sviluppata grazie all'utilizzo del framework
ORM Hibernate,strutturando il DB in mySQL e implementando il codice con
Eclipse.

## :eyes: Esempi e aiuto

Attraverso l'analisi dei requisiti si apprende la richiesta di gestire una
compagnia aerea,gestendo quindi voli e pronotazioni ed i clienti che le
effettuano.
Gli aerei ed i voli saranno gestiti dalla compagnia mediante codice mentre
per l'utente è stato sviluppato un menù di scelta;
esso permetterà  di eseguire diverse operazioni quali:

    0. Visualizza voli
  	1. crea una prenotazione - CLIENTE ESISTENTE
    2. crea una prenotazione - NUOVO CLIENTE
  	3. modifica prenotazione
		4. prenotazioni effettuate
    5. cancella prenotazione
  	6. esci

Ad ogni scelta quindi corrispondono dei metodi di "CRUD" implementati
in un'interfaccia che ha lo stesso nome del pattern che sfrutta ovvero DAO.
Utilizzando il software di controllo GIT all'interno della repository del team
di sviluppo,possiamo tenere traccia di ogni modifica  che viene committata.



## :construction: Segnalazioni JUnit

Per dare robustezza all'applicazione in fase di sviluppo vengono
effettuati dei test per tutti i metodi di CRUD,utilizzando il framework "JUnit"
cercando quindi di limitare possibili bug, assicurandoci che  il risultato
(actual) corrispondesse a quello previsto.


## :construction: Segnalazioni Log4J

Per tenere sotto controllo il comportamento del programma
utilizziamo il framework "Log4J",settando i vari log in diversi punti di ogni
metodo che ne necessita l'utilizzo, semplificando la ricerca di un
possibile errore. Il Log4J prevede una configurazione preventiva,
che ci permette di avere differenti messaggi in base a come viene impostato
nel "file.properties".
