# Fondamenti di Java - Parte 1

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


### **Molteplicità di classe**
indica il numero massimo di istanza che può avere la classe stessa.  


### **Responsabilità di classe**
All'interno del modello UML, è necessario stabilire delle responsabilità (generalmente, è la specifica algebrica) da assegnare ad ogni classe ed è possibile farlo in due modi:  
1. specificando dopo la raccolta di attributi e operazioni la sua responsabilità.
2. utilizzando un commento.


### **Identificazioni**
Al fine di rendere il sistema riutilizzabile, l'individuazione delle classi deve essere condotto in modo preciso. E' necessario seguire, dunque, una metodologia ben definita:  
1. Identificare gli elementi che gli utenti usano per descrivere il problema.
2. Per ogni astrazione individuata è necessario identificare un insieme di responsabilità.
3. Fornire ad ogni classe gli attributi e le operazioni di cui ha bisogno per eseguire tali responsabilità.  

L'identificazione, quindi, dipende dalla realtà che si sta affrontando e sia dalla necessità di individuare il giusto bilanciamento dei compiti da assegnare, al fine di rendere il software riutilizzabile. Esisto quindi tre diverse identificazioni per ogni classe:  
1. Classi _entità_
2. classi di _controllo_
3. Classi di _confine_    

Queste tre categorie permettono il giusto partizionamento del sistema in tre componenti diverse, ossia _dominio_ (contiene oggetti e classi della realtà), _controllo_ (contiene le classi e oggetti che incapsulano i dati attraverso la vista) e _vista_ (che contiene gli oggetti e classi con cui interfacciare l'utente col software).  


### **Relazione "Istance-of"**
E' un modo per identificare un oggetto attraverso la sua classe. E' possibile farlo con un rettangolo richiamando l'eventuale package, la sua classe e seguita dai due punti col nome dell'oggetto, oppure con un rettangolo apparte che identifica l'oggetto collegandolo con una freccia trattegiata alla sua classe mediante lo steriotipo "Istance-of".  


### **Ereditarietà**
Nella progettazione OOP una relazione fondamentale è quella dell'ereditarietà. Una classe è considerata come un repertorio di conoscenza a partire dal quale è possibile definire altre classi più specifiche che che completano la conoscenza della loro classe madre. Una _sottoclasse_, quindi, è una specializzazione della descrizione di una classe madre, detta anche _superclasse_ dalla quale essa mutua (almeno una parte) gli attributi e le operazioni. Abbiamo tre tipi di ereditarietà:  
1. _Per estensione_:  
    La sottoclasse introduce delle proprietà non presenti nello stato della superclasse e non applicabili alle istanze della superclasse. La visibilità di attributi e operazioni ereditate dalla superclasse non consentono l'@Override (la modifica).  

2. _Per variazione funzionale_:  
    Consente la ridefinizione di alcune operazioni ereditate dalla superclasse per l'insieme di oggetti descritti nella sottoclasse. Detto anche @Overriding, la ridefinizione riguarda solo l'implementazione del metodo e non l'operazione di per sé.   
    E' possibile osservare che la ridefinizione non è incrementale, ossia che i cambiamenti al metodo della superclasse ereditato devono anche essere riportate in modo manuale al metodo della sottoclase che usa @Override, e che l'operazione di @Override viene fortemente sconsigliata: è sempre meglio ereditare i metodi im modo completo senza "sovrascrittura.  
    Per risolvere questo problema, si possono adottare delgi accorgimenti nella realizzazione dei metodi per i quali si riconosce già in fase di progetto un possibile cambiamento. Dunque, il metodo della sottoclasse deve prendere al suo interno l'invocazione del metodo della superclasse e nel caso la risposta risulta positiva, aggiungere ulteriori controlli.  
    ```
    super.op(...); //per richiamare il metodo della superclasse da una sottoclasse
    ```  
    Il metodo di @Override è valido a metodi generici, esclusi i metodi di accesso (costruttori e distruttori).  
    
3. _Per restrizione_:   
    Le istanze della sottoclasse soddisfano i vincoli che non sono necessariamente soddisfatti da istanze della superclasse. Tale tipo non consente la modifica della visibilità degli attributi e i metodi ereditati dalla superclasse.  


### **Principio di sostituibilità**
Data una dichiarazione di una variabile o di un parametro il cui tipo è dichiarato come x, una qualunque istanza di una classe discendente può essere usato come valore effettivo senza violare la semantica del suo tipo e del suo uso. In altre parole, l'istanza di un discendente può essere sostituito all'istanza di un suo ascendente. Tale principio è detto _polimorfismo di inclusione_. Una conseguenza del principio di sostituibilità è che una sottoclasse non può rimuovere o rinunciare a proprietà o metodi della superclasse, altrimenti una istanza della sottoclasse non sarà sostituibile in una situazione in cui si dichiara l'uso di oggetti della superclasse.  
In effetti, preservando la visibilità degli attributi e dei metodi ereditati (come accade nelle tre forme viste precedentemente) si garantisce che gli oggetti della sottoclassse offrano quantomeno gli stessi servizi delle istanze della superclasse (anche se viene svolto @Override).   
In definitiva i tre metodi visti prima sono compatibili con il principio di sostituibilità.  


### **Generalizzazioni**
Le tre tipologie di ereditarietà preceenti possono essere messe in atto attraverso relazioni di generaizzazioni: questo perchè ogni istanza di una classe derivata da una classe base va considerata come istanza della classe base.  

### **Ereditarietà per implementazione**
La sottoclasse utilizza l'implementazione della superclasse (tra cui definizioni di attributi e metodi) per implementare l'astrazione associata e comporta, tra l'altro la modifica della visibilità delle caratteristiche ereditate. Questa tipologia non è compatibile con il polimorfismo di inclusione: pertanto se una classe Y eredita l'implementazione della classe X, non si può riutilizzare su istanze di Y di tutto il codice in cui si dichiarano e utilizzano dati di classe X, in quanto non vale il principio di sostituibilità.  

