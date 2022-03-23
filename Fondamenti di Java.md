# Fondamenti di Java 

Vedremo nella prima parte di questo documento il paradigma ad oggetti dal punto di vista teorico introducendo alcune notazioni UML:

### **Paradigma ad oggetti**
La progettazione OOP nasce come soluzione alla programmazione imperativa, data da un difetto naturale:
Le variabili globali sono potenzialmente accessibili da ogni parte di programmi. La ragione è che nessun modulo che accede ad essa può essere sviluppato o compreso in modo indipendente da altri moduli che possono accedervi alla stessa medesima variabile.  
La soluzione a questo problema è quella di utilizzare il principio di _information hiding_ permettendo di incapsulare in un modulo ogni variabile globale insieme ad un gruppo di operazioni autorizzate ad accedervi, in modo che gli altri moduli possano accedervi in modo indiretto mediante le operazioni. Ed è qui che nasce il paradigma ad oggetto.     
    
  
### **Gli oggetti**

Sono entità astratte che incapsulano uno stato e un comportamento:  
1. Lo stato è identificato da una certa area di memoria in cui sono memorizzate le sue caratteristiche.
2. Il comportamento è l'inisieme delle operazioni che possono operare sullo stato dell'oggetto.  
  
Ogni oggetto, a sua volta, è composto da una sua identita, ossia il PID.  
  
### **Le classi**
Una classe è una descrizione di una famiglia di oggetti (Dette anche _istanze_) che condividono lo stesso stato (_attributi_) e comportamento (_operazioni_). Un oggetto è difficile che esista se non esiste la sua classe di appartenenza. In generale, le classi sono composto da due componenti principali:
1. _Componente statica_:  
    Le classi sono composte di attributi con valori già pre-impostati ed esse si suddividono in attributi di istanza (associati ad ogni istanza creata e hanno un tempo di vita pari alla sua istanza) e attributi di classe (attributi condivisibili da ogni istanza della classe e il loro tempo di vita è pari a quello della classe).
2. _Componente dinamica_:  
    Le classi sono costituite da operazioni comuni (composte dai metodi) che ogni istanza è dotata. Ogni attributo, quindi, vengono manipolati dei metodi delle operazioni alle loro invocazioni. Esistono diverse tipologie di metodi:  
    * _metodi costruttori_: servono per istanziare e inizializzare l'oggetto.
    * _metodi di trasformazione_: servono per modificare lo stato dell'oggetto.
    * _metodi di accesso_: Servono per accedere allo stato dell'oggetto. Questa tipologia deriva dal principio di incapsulamento (es. getter e setter).
    * _metodi distruttori_: Servono per eliminare l'oggetto durante l'esecuzione (in Java esiste il distruttore automatico, ossia il garbage collector).  

Per quanto riguarda i _metodi di acceso_, essi si differenziano in _metodi di istanza_ (che operano solo sul singolo attributo specificando l'istanza) e in _metodi di classe_ (che operano solo sul singolo attributo specificando il nome della classe).

In UML, oggetti e classi saranno rappresentati con rettangoli con la sola differenza che un oggetto deve avere la prima lettera minuscola e la classe la lettera maiuscola.  

### **Gli Attributi**
Gli attributi rappresentano lo stato di una classe di oggetti. La definizione di default come segue:  
```
visibilità nome : type [molteplicità] [= val][{proprietà}]
```
1. la visibilità di un attributo può essere di tipo:  
    * _public(+)_: utilizzabile da ogni istanza della classe (o anche da classi esterne alla loro invocazione).
    * _protected(#)_: visibile solo ai membri del package e alle classi ereditate (vedremo in seguito).
    * _private(-)_: utilizzabile solo alle istanze della classe stessa.
    * _package(~)_: visibile e utilizzabile a tutte le classi di cui fanno parte lo stesso package.  

2. il "tipo" deve essere definito come primitivo oppure a sua volta come tipo di oggetto.
3. le molteplicità di un attributo indica il numero di valori che è possibile associare a tale elemento
4. il "valore" può essere impostato in modo diretto oppure no (servono per le associazioni fra classi).
5. le proprietà assumono a loro volta diverse caratteristiche (se non specificfate sarà di tipo _changeble_):  
    * _Changeble_: Attributo modificabile.
    * _addOnly_: L'attributo può assumere o rimosso un valore e non è modificabile (per associazioni > 1).
    * _frozen_: Attributo non modificabile.  

### **I Metodi**
continuare...

