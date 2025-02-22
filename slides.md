---
# You can also start simply with 'default'
theme: seriph
# random image from a curated Unsplash collection by Anthony
# like them? see https://unsplash.com/collections/94734566/slidev
background: https://cover.sli.dev
# some information about your slides (markdown enabled)
title: Les bases de Java
info: |
  ## Slidev Starter Template
  Presentation slides for developers.

  Learn more at [Sli.dev](https://sli.dev)
# apply unocss classes to the current slide
class: text-center
# https://sli.dev/features/drawing
drawings:
  persist: false
# slide transition: https://sli.dev/guide/animations.html#slide-transitions
transition: slide-left
# enable MDC Syntax: https://sli.dev/features/mdc
mdc: true
lineNumbers: true
---

# Les bases de Java

Bienvenue

<div @click="$slidev.nav.next" class="mt-12 py-1" hover:bg="white op-10">
  Page suivante <carbon:arrow-right />
</div>

<div class="abs-br m-6 text-xl">
  <button @click="$slidev.nav.openInEditor" title="Open in Editor" class="slidev-icon-btn">
    <carbon:edit />
  </button>
  <a href="https://github.com/slidevjs/slidev" target="_blank" class="slidev-icon-btn">
    <carbon:logo-github />
  </a>
</div>

<!--
The last comment block of each slide will be treated as slide notes. It will be visible and editable in Presenter Mode along with the slide. [Read more in the docs](https://sli.dev/guide/syntax.html#notes)
-->

---
layout: two-cols
layoutClass: gap-16
transition: fade-out
---

# Sommaire

- 📝 **Types**
  - Basic
  - Châine de caractère
  - Collections
- 🎨 **Notion de classe**
  - 🧑‍💻 Attribut (privé/protected/public)
  - 🧑‍💻 Accesseur
  - 🧑‍💻 Méthode (privé/protected/public)
- 📤 **Classe abstraite**
  - 🧑‍💻 Methode abstract
  - 🧑‍💻 Methode par défaut

::right::

- 🤹 **Notion d'Héritage**
  - 🧑‍💻 Classe Mère
  - 🧑‍💻 Classe Fille
- 🎥 **Interface**
  - 🧑‍💻 Methode à redéfinir
  - 🧑‍💻 Methode par défaut
- 🤹 **Notion d'implémentation**
- 🛠 **Enumération**
<br>
<br>

<!-- Apprends plus Jav [Why Slidev?](https://sli.dev/guide/why) -->

<!--
You can have `style` tag in markdown to override the style for the current page.
Learn more: https://sli.dev/features/slide-scope-style
-->

<!-- <style>
h1 {
  background-color: #2B90B6;
  background-image: linear-gradient(45deg, #4EC5D4 10%, #146b8c 20%);
  background-size: 100%;
  -webkit-background-clip: text;
  -moz-background-clip: text;
  -webkit-text-fill-color: transparent;
  -moz-text-fill-color: transparent;
}
</style> -->

---
layout: image-right
image: https://cover.sli.dev
---

# Types (Basics)
<br>

### Les types primitifs 
```java {all|5|7|7-8|10|all}

  int nombreEntier = −2147483648 à 2147483647; (32 bits)
  long nombreEntierPlusGrand= −9223372036854775808 à 9223372036854775807; (64 bits)
  float nombreFlottant= 1.401e-045 à 3.40282e+038; (32 bits)
  double nombreDecimal= 2.22507e-308 à 1.79769e+308; (64 bits)
  boolean vraiOuFaux = true | false; (1 bit)
```
<br>

### Les types sous la forme Objet

```java {all|5|7|7-8|10|all}

  Integer nombreEntier =  Integer.valueOf(1);
  Long nombreEntierPlusGrand= Long.valueOf(1);
  Float nombreFlottant= Float.valueOf(1);
  Double nombreDecimal= Double.valueOf(1);
  Boolean vraiOuFaux = Boolean.valueOf(true);
```
---
# layout: two-cols
# layoutClass: gap-16
layout: image-right
image: https://cover.sli.dev
---

# Types (Caractères)
<br>

### primitifs
<br>
```java {all|5|7|7-8|10|all}
  char monCaractere = \u0000 à \uFFFF ; (16 bits)
```

<u>NB</u>: il faut noter qu'un caractère est une valeur entière comprise entre 0 et 65535.

<!-- <br> -->

```java {all|5|7|7-8|10|all}
  int maComparaison = 'A' - 'B' ;
```

[Tableau ASCII](https://www.ascii-code.com/ASCII)

<br>

<!-- ::right::
<br>
<br>
<br> -->

### Chaîne de caractères sous sa forme Objet

```java {all|5|7|7-8|10|all}
  String maPhrase = String.valueOf("Je code.");
```

<!-- <arrow v-click="[4, 5]" x1="350" y1="310" x2="195" y2="334" color="#953" width="2" arrowSize="1" /> -->

<!-- This allow you to embed external code blocks -->
<!-- <<< @/snippets/classe.java#snippet -->

<!-- Footer -->

<!-- [Chaîne de caractères](https://www.ascii-code.com/ASCII) -->

<!-- Inline style -->
<style>
.footnotes-sep {
  @apply mt-5 opacity-10;
}
.footnotes {
  @apply text-sm opacity-75;
}
.footnote-backref {
  display: none;
}
</style>


<!-- Notes can also sync with clicks

[click] This will be highlighted after the first click

[click] Highlighted with `count = ref(0)`

[click:3] Last click (skip two clicks) -->


---
layout: two-cols
layoutClass: gap-16
---

# Types (Collections)

<br>

<h4> Les collections de type List </h4>

C'est une collection simple et ordonnée d'éléments qui autorise les doublons. La liste étant
ordonnée, un élément peut être accédé à partir de son index.<br>
Les fonctionnalités de base de ce type de collection sont définies dans l'interface <b>java.util.List</b>.

<br>

<div v-click>

```java {all|5|7|7-8|10|all}  
  List<String> maListe = new ArrayList<>();
  List<Integer> maListeRapide = new LinkedList<>();
```

<br>
</div>

<div v-click>

<ListComplexity />

</div>

::right::
<br>
<br>
<br> 

<div v-click>
<h4> Les collections de type Set </h4>

Une collection de type Set est un ensemble, qui ne permet pas l'ajout de doublons ni l'accès direct à un élément de la collection.<br>
Les fonctionnalités de base de ce type de collection sont définies dans l'interface <b>java.util.Set</b>.
</div>

<br>

<div v-click>

```java {all|5|7|7-8|10|all}  
  Set<String> monEnsemble = new HashSet<>();
  Set<Integer> monEnsemble = new LinkedHashSet<>();
  Set<Integer> monEnsembleOrdonne = new TreeSet<>();
```

<br>
</div>

<div v-click>

<ListComplexity />

</div>


<!-- ArrayList elle utilise un tableau dont la taille s'adapte automatiquement au nombre d'éléments de la collection. Cette adaptation a cependant un coût car elle nécessite l'instanciation d'un nouveau tableau et la copie des éléments dans ce nouveau tableau. -->

<!--
une ArrayList stocke ses éléments en interne dans un tableau à taille fixe alors qu'une LinkedList stocke ses
éléments dans une liste doublement chaînée

Il est possible d'ajouter le type null

une ArrayList permet un accès direct à un élément alors qu'une LinkedList doit parcourir ses éléments pour
obtenir celui désiré, ce qui est particulièrement contre performant

le coût de variation de la capacité d'une collection de type ArrayList est important car il implique une copie du
tableau de stockage interne de ses éléments

l'ajout d'un élément en début ou en fin d'une collection de type LinkedList est particulièrement performant et
son temps d'exécution est constant dans le temps (LinkedList implémente aussi l'interface Deque)


LIMITATION

Les éléments ajoutés dans une collection de type Set doivent réimplémenter leurs méthodes equals() et hashCode(). Ces
méthodes sont utilisées lors de l'ajout d'un élément pour déterminer s'il est déjà présent dans la collection.

TreeSet il est impossible d'ajouter un élément null

-->

---
layout: center
class: text-center
---

# Notion d'Héritage

<div text-center text-3xl>
Le deuxième grand principe de la programmation objet après l’encapsulation est le concept d’héritage.
Une classe B qui hérite d’une classe A hérite des attributs et des méthodes de la classe A sans avoir à les redéfinir
</div>

---
layout: two-cols
layoutClass: gap-16
---

# Notion d'Héritage

```java {all|5|7|7-8|10|all}  
public class ClassMere {

    private String nom;
  

    public ClassMere(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

```
::right::
<br>
<br>

```java {all|5|7|7-8|10|all}  
public class ClassFille extends ClassMere {
    private String ecole;

    public ClassFille(String nom,String ecole) {
        super(nom);
        this.ecole = ecole;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

}

```

---
layout: center
class: text-center
---

# Notion d'Héritage

<div > 
Cette annotation est un marqueur utilisé par le compilateur pour vérifier la réécriture de méthodes héritées.
s'utilise pour annoter une méthode qui est une réécriture d'une méthode héritée. Le compilateur lève une erreur si aucune méthode héritée ne correspond.
</div>


---
layout: center
class: text-center
---

# Interface
<div>
Une interface est un ensemble de constantes et de déclarations de méthodes correspondant un peu à une classe abstraite. C'est une sorte de standard auquel une classe peut répondre. Tous les objets qui se conforment à cette interface (qui implémentent cette interface) possèdent les méthodes et les constantes déclarées dans celle-ci. Plusieurs interfaces peuvent être implémentées dans une même classe.
</div>
::right::

<<< @/snippets/classe.java#snippet

<<< @/snippets/classe.java#snippet





---
layout: image-right
image: https://cover.sli.dev
class: text-center
---

# Notion d'implémentation

```java {all|5|7|7-8|10|all} 
interface AfficheType {
    void afficherType();
}

class Personne implements AfficheType {
  public void afficherType() {
    System.out.println(" Je suis une personne ");
  }

}

class Voiture implements AfficheType {
  public void afficherType() {
    System.out.println(" Je suis une voiture ");
  }
}

```

---
layout: image-right
image: https://cover.sli.dev
class: text-center
---

# Enumération
<div>
Un enum (énumération) est utilisé pour définir un ensemble fixe de valeurs nommées.
</div>
```java {all|5|7|7-8|10|all}
enum Genre {
    HOMME,
    FEMME
}

```

#
---
layout: center
class: text-center
---

# Learn More

[Documentation](https://sli.dev) · [GitHub](https://github.com/slidevjs/slidev) · [Showcases](https://sli.dev/resources/showcases)

<PoweredBySlidev mt-10 />
