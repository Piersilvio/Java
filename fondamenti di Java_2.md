# Fondamenti di Java - Parte 2

In questa sezione ci limiteremo ad applicare i concetti teorici della OOP attraverso Java.

## **Cos'è Java**
Java è un linguaggio OOP indipendente dalla piattaforma di esecuzione. E' un linguaggio descritto da gerarchie e dipendenze fra classi. Il codice compilato, detto anche _bytecode_può essere eseguito su qualunque JVM per diverse piattaforme.  

### **Package**
Java permette di organizzare le classi progettate in cartelle separate. Ogni cartella è detta package e anch'esse hanno delle gerarchie. Il percorso completo del package in cui si trova la classe specificata è detto _namespace_
```
package com.mondo.casa;     //definisco la classe che scrivo dal suo package
import com.esterno.Macchina; //prelevo da un package la classe Macchina

// codice //
```


### **Hello World**
```
package com.helloWorld.HelloWorld;
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
```
1. Ogni classe deve avere al suo interno un metodo statico _main_ che funge da entry point di richiamo delle altre classi dei package.

2. _String[] args_ sono gli argomenti che passiamo al metodo _main_ quando viene invocato il programma.

3. Ogni classe deve avere il seguente schema ``` visibilità class nomeClasse```.

4. Il metodo ``` System.out.println("Hello World!"); ``` è una classe della libreria "core" di Java, il suo attributo è _out_ ed è di tipo _PrintStream_ e infine il metodo _println_ è un metodo della classe _PrintStream_ che stampa a video un "qualcosa" mandando a capo.  


### **Variabili**
Hanno un tipo e un nome. Hanno il compito di identificare un valore del tipo specificato e servono a descrivere lo stato di un oggetto. Le tipologie:  
1. Variabili ```no-static```: ogni istanza di una classe conserva il suo stato attraverso le variabili.

2. variabili ```static```: la variabile è la stessa per tutte le istanze della classe.

3. variabili globali: utilizzate dai metodi e accessibili solo al loro interno.

4. parametri: sono delle variabili che vengono passate all'invocazione dei metodi e si differenziano in parametri formali (definiti nel metodo stesso) e effettivi (definiti a runtime durante la chiamata del metodo).
  
In generale, sono _case-sensitive_ e per convenzione devono partire con una lettere minuscola. Inoltre le variabili ```static``` devono essere scritte in maiuscolo.  
```
[static] tipo nome [= val];
```

### **Il tipo String**
Ogni sequenza di caratteri fra doppi apici è un istanza dell'oggetto String. Gli oggetti String sono immutabili e non cambiano valore mai. E' un oggetto definito da Java e non è un tipo primitivo: il suo valore di default è ```NULL```. Per concatenare delle stringhe fra loro si utilizza il +.  


### **I literals**
I "letterali" sono scritture di valore di un tipo specificato e sono definiti per ogni tipo in Java:
1. per oggetti: ```NULL``` utilizzato per i riferimenti ad oggetti appena inizializzati.

2. per booleani: ```True|False```

3. per interi: le costanti intere sono stringhe di cifre in base otto, dieci e sedici. L'inizio di tale costante serve per dichiarare la base del numero. Il resto della costante è in base dieci:
``` 
0 //base 8
0x, 0X //base 16
``` 
4. per i virgola-mobile: le costanti in virgola mobile sono espressi come numeri decimali, con un "." opzionale, eventualmente seguiti da un esponente. La costante può essere seguita da f o F per indicare se una costante è in _single-prec._ oppure d o D se è in _double-prec._ In generale, tali costanti sono di tipo ```Double``` a meno che non venga specificata f o F.

5. per caratteri e stringhe: sono costanti che possono contenere qualsiasi carattere Unicode a 16 bit e racchiudo con singoli apici un carattere e con doppi apici una stringa.  


### **L'oggetto Array**
E' un oggetto che contiene un numero finito di oggetti (o tipi)dello stesso tipo. La lunghezza dell'array è definita al momento della sua inizializzazione. Ogni oggetto di tipo array è detto elemento e permette l'accesso diretto a tale elemento:
```
int[] a;                //dichiarazione
int[] a = new int[MAX]; //inizializzazione (vuoto!)
int[] = {10, 34, 15};   //inizializzazione in modo esplicito
int[][] a;              //dichiarazione di una matrice
```

Metodo | Scopo
---- | ----
```arraycopy(object src, int srcPos, object dest, int destPos, int lenght);``` | copiare gli elementi da una certa posizione da un array X e incollarli in un array Y, specificando il numero di elementi da copiare
```copyOfRange(type[] original, int from, int to);``` | restituisce un nuovo array contenente gli elementi presida un array passato in input specificando un range
```fill();``` | riempimento di un array
```equals();``` |  confronta due array e restituisce true se identici
```binarySearch();``` | ricerca di un elemento in un array per mezzo della ricerca binaria. O(log(n))
```sort();``` | ordina una array in modo crescente.


### **Operatori e espressioni**
Eseguono uno o più argomenti delle varie operazioni e restituiscono un valore. Sono gli stessi nei diversi linguaggi:
``` 
var = [cond] ? [true] : [false]; //operatore ternario
```
Un espressione invece è un insieme di variabili, operatori e chiamate a metodi e restituisce un risultato che dipendo appunto dai tipi che compongono l'espressione.

### **Istance of**
E' un operatore che consente di stabilire se un certo oggetto appartiene ad una classe e restituisce true se vero:
```
String s = "cià";
boolean t = s instanceof String;
```

### **Gli statements Java**
Riportiamo i costrutti sintattici più utilizzati:
```
/* if-then-else */
if(block)
{
    //somethin1
}else
{
    //something2
}

/* --------------------------- */

/* switch */
switch(var)
{
    case val1:
        //something1
        break;
    ...
    case valN:
        //somethingN
        break;
    default:
        //optional
        break;
}

/* --------------------------- */

/* while, do-while e for */
while(cond)
{
    //someting
}

do
{
    //something
}while(cond);

for(int index; cond; index++)
{
    //something
}

/* --------------------------- */

/* foreach (consente di iterare oggetti) */
for(int var : object)
{
    //something
}
```  


### **L'oggetto Numbers**
Il linguaggio mette a disposizione delle classi che rappresentano i tipi primitivi numerici come ```Byte, short, integer``` ecc. Il compilatore converte in modo automatico i tipi primitivi e le classi attraverso la tecnica _boxing/unboxing_. L'utilizzo di questa classe è molto consigliata in quanto:
1. l'argomento di un metodo deve essere un oggetto e non un tipo primitivo
2. Utilizzare le costanti ```static``` nella clase
3. per conversioni fra tipi (ad esempio da String in numeri o fra i numeri).  


metodo | scopo
------ | -----
```type typeValue()``` | Convertire il valore in un tipo primitivo
```int compareTo(type anotherType)``` | Converte il tipo Number con l'argomento. Restituisce >0 se più grande, = 0 se sono uguali e <0 se più piccolo
```boolean equals(Object obj)``` | per confrontare il tipo Number con il parametro  

Metodi per la conversione: 


metodo | scopo
------ | ----
```static integer decode(String s)``` | converte la stringa in integer
```static int parseInt(String s)``` | converte una stringa in int
```static int parseInt(String s, int radix)``` | converte una stringa in int, (radix=sistema di numerazione 10, 2, 8, 16)
```String toString()``` | restituisce la stringa che rappresenta questo numero
```static String toString(int i)``` | : restituisce la stringa che rappresenta il numero i
```static Integer valueOf(int i)``` |  restituisce l’Integer che rappresenta il valore primitivo i
```static Integer valueOf(String s)``` | simile a parseInt ma restituisce un Integer

Poiché ogni numero può essere convertito in String si possono utilizzare per la stampa dei numeri direttamente il metodo ```System.out.println(String s);``` oppure il metodo ```System.out.format(String s, Object... args)``` che specifica come gli oggetti devono essere stampati.  


### **L'oggetto math**
La classe Math fornisce strumenti più avanzati per le operazioni matematiche come ad esempio costanti matematiche, funzioni elementari e operazioni di base:   
metodo | scopo
------ | -----
```Math.E(), Math.PI()``` | costante di nepero e pigreco
```Math.abs()``` | restituisce il valore assoluto
```double ceil(double d)``` | restituisce l’intero più grande che è più piccolo o uguale a d
```double floor(double d)``` | restituisce l’intero più grande che è più piccolo o uguale a d
```double rint(double d)``` | restituisce l’intero più vicino a d
```double exp(double d)``` | restituisce e^d
```double log(double d)``` | restituisce ln(d)
```double pow(double base, double exponent)``` | restituisce base^exponent
```double sqrt(double d)``` | restituisce radice quadrata di d
```double Math.random()``` | restituisce un numero nell'intervallo [0, 1). Inoltre si può moltiplicare per uno scalare per avere un certo range random di numeri e viene utilizzata solo importando ```java.util.Random```  


### **L'oggetto Character**
metodo | scopo
------ | -----
```boolean isLetter(char ch)``` | determina se il carattere è una lettera o una cifra
```boolean isWhitespace(char ch``` | determina se il carattere è un white space (spazio, accapo, tabulazione)
```boolean isUpperCase(char ch)``` | determina se il caratter è in maiuscolo
```boolean isLowerCase(char ch) ``` | determina se il carattere è minuscolo
```char toUpperCase(char ch)``` | determina la maiuscola del carattere
```char toLowerCase(char ch)``` | determina la minuscola del carattere
```toString(char ch)``` | restituisce una stringa che rappresenta un singolo carattere  


### **L'oggetto String**
La classe String rappresenta una stringa di caratteri: un istanza è immutabile, cioè il suo valore non può essere modificato dopo la sua creazione. Per farsi che questo accada, si utilizzi la classe ```StringBuilder o StringBuffer```.  
metodo | scopo
------ | -----
```charAt(int i)``` | restituisce il carattere all'iesima posizione
```length()``` | restituisce la lunghezza della stringa
```contains(CharSequence s)``` | restituisce true se contiene la sottostringa s
```indexOf(String s)``` | restituisce l’indice dal quale inizia la sottostringa s, -1 se non esiste la sottostringa
```indexOf(String s, int i)``` | inizia la ricerca della sottostringa a partire dall’i-esimo carattere
```replace(CharSequence s1, CharSequence s2)``` | sostituisce la sequenza s1 con s2
```replaceAll(String regex, String r)``` | sostituisce tutte le sequenze che corrispondono alla regex con r
```matches(String regex)``` | restituisce true se la stringa corrisponde alla regex
```split(String regex)``` | restituisce un array di String dividendo dove avviene il matching con la regex
```equals(Object o)``` | confronta due stringhe
```substring(int b)``` | genera una sottostringa a partire da b
```trim()``` | elimina gli spazi all'inizio e alla fine della stringa  


### **Le classi**
```
class MyClass
{
    /*
        Stato della classe (attributi)
    */

    /*
        Inizializzazione di un oggetto di questa classe (costruttori)
    */

    /*
        Operazioni della classe (metodi)
    */
}
```
```
[visibilità] class [nome] extends [superclasse] implements [interfaccia1]...
{
    //body della classe
}
```
1. la visibilità sono le stesse modalità con cui la classe è visibile alle altre classi.
2. la superclass è la classe da cui eredità.
3. interface se implementa o meno delle interfacce.  

Variabile all'interno di una classe: 
1. Attributi: varibili visibili in tutta la classe.
2. Attributi locali: visibili solo nel metodo in cui sono utilizzate.
3. Perimetro: passate quando si chiama un metodo.  


### **Gli attributi**
Dichiarazione degli attributi:
```
public class Bicycle
{
    private int gear = 1;
    private int speed;
}
```


### **I metodi**
Dichiarazione di metodi:
```
[visibilità] [tipo] nome(parametri, ... )
{
    //body della classe
}
``` 
In generale, i nomi dei metodi devono essere espressi come un verbo e minuscolo. Inoltre, ogni metodo può avere 0 o n-parametri e possono essere di ogni tipo (compreso oggetto). I parametri devono avere nomi differenti dagli attributi della classe, eccetto il caso in cui è possibile assegnare ad un parametro lo stesso nome dell'attributo con il riferimento ```this```.  


### **Overloading dei metodi**
Una classe può avere più metodi con lo stesso nome purché abbiano una lista differente di parametri e i metodi con lo stesso nome devono restituire lo stesso tipo di valore.    


### **I costruttori
Sono dei metodi che servono ad inizializzare gli oggetti di una classe. Hanno lo stesso nome della classe e non restituiscono alcun valore.
```
public Bycycle(int startSpeed, int startGear)
{
    gear = startGaer;
    speed = startSpeed;
}

//per creare un oggetto di tipo Bicycle devo chiamare il suo costruttore
Bicycle miaBici = new Bicycle(0, 3);
```  
Una classe, inoltre, può avere più di un costruttore: non è possibile dichiarare due costruttori che hanno lo stesso tipo e numero di parametri.
```
public Bicycle()
{
    gear = 1;
    speed = 0;
}
```
Una classe può non avere costruttori: in questo caso l'oggetto creato eredita il costruttore senza parametri della sua superclasse e se la superclasse non ha un costruttore senza parametri, allora eredita quello di object. Anche i costruttori sono dotati di una visibilità.  


### **Gli oggetti**
Gli oggeti vengono creati utilizzando l'istruzione ```new``` e invocando un costruttore della classe a cui deve appartenere l'oggetto. E' possibile accedere agli attributi e a i metodi dell'oggetto attraverso la notazione "oggetto.metodo()".  


### **Riferimento This**
Permette di accedere ai costruttori utilizzando lo stesso nome degli attributi della classe.
```
public class Bicycle 
{
    private int gear;
    private int speed;

    public Bicycle(int startSpeed, int startGear) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public Bicycle() 
    {
        this(3, 0);
    }

}
```


