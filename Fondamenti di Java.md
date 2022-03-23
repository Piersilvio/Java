# Fondamenti di Java 

Vedremo nella prima parte di questo documento il paradigma ad oggetti dal punto di vista teorico introducendole in notazioni UML. Per ogni paragrafo a partire dagli oggetti, verranno messe all'interno di una cartella di questa repository la notazione UML corrispondente numerandole secondo l'ordine di questo file.

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
Esiste una distinzione fra un metodo e l'operazione:  
L'operazione è un servizio che può essere richiesto alla classe o alla sua istanza mentre un metodo è l'implementazione del servizio richiesto dall'operazione. La definizione di default come segue:  
```
visibilià nome [(lista par.)][:tipo di valore di ritorno] [{proprietà}]
```
1. le tipologie di visibilità sono le stesse degli attributi.
2. nella lista di parametri devono essere specificate nel modo seguente. Per direzione intendiamo come il parametro deve essere passato:
    * _in_: parametro in input non modificabile
    * _out_: parametro in output modificabile
    * _inout_: parametro in input modificabile
```
[direzione] par1:typ1 [= val], ..., [direzione] parN:typN [= val]
```
3. se si tratta di un metodo che restituisce un "qualcosa", allora bisogna specificarne il tipo di questo "qualcosa".
4. le proprietà possono essere di tipo:  
    * _isQuery_: l'esecuzione del metodo è priva di side effecting.
    * _leaf_: l'operazione non gode di estensione di ereditarietà (_@Overriding_).
    * _sequential_: i "chiamanti" del metodo devono coordinarsi in modo sequenziale per utilizzarlo.
    * _guarded_: un solo "chiamante" alla volta e la coordinazione viene gestita dalla classe stessa del metodo.
    * _concurrent_: per i "chiamanti" multipli.  


### **Classi Attive**
le proprietà _sequential_, _guarded_ e _concurrent_ sono per classi attive in cui gli oggetti sono "attivi". Un oggetto è ritenuto attivo se esso ha un thread e può far partire un thread concorrente. Una classe attiva è simile ad una classe con la sola eccezione che le sue istanze rappresentano gli elementi il cui comportamento è concorrente con il resto delle istanze create.  


### **Classi Template**
Una classe "parametrizzata definisce una famiglia di classi parametriche cui il tipo è specificato solo in fase di inizializzazione dell'oggetto della classe. Non è possibile usare direttamente una classe Template: è necessario prima specificare il tipo, ossia l'operatore di istanziazione (un esempio è la classe _ArrayList_). L'istanziazione può esssere fatta in due modi:  
1. in modo esplicito, esplicitando la classe col suo tipo.
2. in modo implicito, rappresentando il suo tipo attraverso una dipendenza steriotipata <<_bind_>>

