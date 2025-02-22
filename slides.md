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
layout: two-cols
layoutClass: gap-16
---

# Notion d'Héritage

<<< @/snippets/ClassMere.java#snippet

::right::
<<< @/snippets/ClassFille.java#snippet

---
layout: two-cols
layoutClass: gap-16
---

# Interface
<<< @/snippets/classe.java#snippet


# Notion d'implémentation
<<< @/snippets/classe.java#snippet


# Enumération
<<< @/snippets/classe.java#snippet


# Shiki Magic Move

Powered by [shiki-magic-move](https://shiki-magic-move.netlify.app/), Slidev supports animations across multiple code snippets.

Add multiple code blocks and wrap them with <code>````md magic-move</code> (four backticks) to enable the magic move. For example:

````md magic-move {lines: true}
```ts {*|2|*}
// step 1
const author = reactive({
  name: 'John Doe',
  books: [
    'Vue 2 - Advanced Guide',
    'Vue 3 - Basic Guide',
    'Vue 4 - The Mystery'
  ]
})
```

```ts {*|1-2|3-4|3-4,8}
// step 2
export default {
  data() {
    return {
      author: {
        name: 'John Doe',
        books: [
          'Vue 2 - Advanced Guide',
          'Vue 3 - Basic Guide',
          'Vue 4 - The Mystery'
        ]
      }
    }
  }
}
```

```ts
// step 3
export default {
  data: () => ({
    author: {
      name: 'John Doe',
      books: [
        'Vue 2 - Advanced Guide',
        'Vue 3 - Basic Guide',
        'Vue 4 - The Mystery'
      ]
    }
  })
}
```

Non-code blocks are ignored.

```vue
<!-- step 4 -->
<script setup>
const author = {
  name: 'John Doe',
  books: [
    'Vue 2 - Advanced Guide',
    'Vue 3 - Basic Guide',
    'Vue 4 - The Mystery'
  ]
}
</script>
```
````

---

# Components

<div grid="~ cols-2 gap-4">
<div>

You can use Vue components directly inside your slides.

We have provided a few built-in components like `<Tweet/>` and `<Youtube/>` that you can use directly. And adding your custom components is also super easy.

```html
<Counter :count="10" />
```

<!-- ./components/Counter.vue -->
<Counter :count="10" m="t-4" />

Check out [the guides](https://sli.dev/builtin/components.html) for more.

</div>
<div>

```html
<Tweet id="1390115482657726468" />
```

<Tweet id="1390115482657726468" scale="0.65" />

</div>
</div>

<!--
Presenter note with **bold**, *italic*, and ~~striked~~ text.

Also, HTML elements are valid:
<div class="flex w-full">
  <span style="flex-grow: 1;">Left content</span>
  <span>Right content</span>
</div>
-->

---
class: px-20
---

# Themes

Slidev comes with powerful theming support. Themes can provide styles, layouts, components, or even configurations for tools. Switching between themes by just **one edit** in your frontmatter:

<div grid="~ cols-2 gap-2" m="t-2">

```yaml
---
theme: default
---
```

```yaml
---
theme: seriph
---
```

<img border="rounded" src="https://github.com/slidevjs/themes/blob/main/screenshots/theme-default/01.png?raw=true" alt="">

<img border="rounded" src="https://github.com/slidevjs/themes/blob/main/screenshots/theme-seriph/01.png?raw=true" alt="">

</div>

Read more about [How to use a theme](https://sli.dev/guide/theme-addon#use-theme) and
check out the [Awesome Themes Gallery](https://sli.dev/resources/theme-gallery).

---

# Clicks Animations

You can add `v-click` to elements to add a click animation.

<div v-click>

This shows up when you click the slide:

```html
<div v-click>This shows up when you click the slide.</div>
```

</div>

<br>

<v-click>

The <span v-mark.red="3"><code>v-mark</code> directive</span>
also allows you to add
<span v-mark.circle.orange="4">inline marks</span>
, powered by [Rough Notation](https://roughnotation.com/):

```html
<span v-mark.underline.orange>inline markers</span>
```

</v-click>

<div mt-20 v-click>

[Learn more](https://sli.dev/guide/animations#click-animation)

</div>

---

# Motions

Motion animations are powered by [@vueuse/motion](https://motion.vueuse.org/), triggered by `v-motion` directive.

```html
<div
  v-motion
  :initial="{ x: -80 }"
  :enter="{ x: 0 }"
  :click-3="{ x: 80 }"
  :leave="{ x: 1000 }"
>
  Slidev
</div>
```

<div class="w-60 relative">
  <div class="relative w-40 h-40">
    <img
      v-motion
      :initial="{ x: 800, y: -100, scale: 1.5, rotate: -50 }"
      :enter="final"
      class="absolute inset-0"
      src="https://sli.dev/logo-square.png"
      alt=""
    />
    <img
      v-motion
      :initial="{ y: 500, x: -100, scale: 2 }"
      :enter="final"
      class="absolute inset-0"
      src="https://sli.dev/logo-circle.png"
      alt=""
    />
    <img
      v-motion
      :initial="{ x: 600, y: 400, scale: 2, rotate: 100 }"
      :enter="final"
      class="absolute inset-0"
      src="https://sli.dev/logo-triangle.png"
      alt=""
    />
  </div>

  <div
    class="text-5xl absolute top-14 left-40 text-[#2B90B6] -z-1"
    v-motion
    :initial="{ x: -80, opacity: 0}"
    :enter="{ x: 0, opacity: 1, transition: { delay: 2000, duration: 1000 } }">
    Slidev
  </div>
</div>

<!-- vue script setup scripts can be directly used in markdown, and will only affects current page -->
<script setup lang="ts">
const final = {
  x: 0,
  y: 0,
  rotate: 0,
  scale: 1,
  transition: {
    type: 'spring',
    damping: 10,
    stiffness: 20,
    mass: 2
  }
}
</script>

<div
  v-motion
  :initial="{ x:35, y: 30, opacity: 0}"
  :enter="{ y: 0, opacity: 1, transition: { delay: 3500 } }">

[Learn more](https://sli.dev/guide/animations.html#motion)

</div>

---

# LaTeX

LaTeX is supported out-of-box. Powered by [KaTeX](https://katex.org/).

<div h-3 />

Inline $\sqrt{3x-1}+(1+x)^2$

Block
$$ {1|3|all}
\begin{aligned}
\nabla \cdot \vec{E} &= \frac{\rho}{\varepsilon_0} \\
\nabla \cdot \vec{B} &= 0 \\
\nabla \times \vec{E} &= -\frac{\partial\vec{B}}{\partial t} \\
\nabla \times \vec{B} &= \mu_0\vec{J} + \mu_0\varepsilon_0\frac{\partial\vec{E}}{\partial t}
\end{aligned}
$$

[Learn more](https://sli.dev/features/latex)

---

# Diagrams

You can create diagrams / graphs from textual descriptions, directly in your Markdown.

<div class="grid grid-cols-4 gap-5 pt-4 -mb-6">

```mermaid {scale: 0.5, alt: 'A simple sequence diagram'}
sequenceDiagram
    Alice->John: Hello John, how are you?
    Note over Alice,John: A typical interaction
```

```mermaid {theme: 'neutral', scale: 0.8}
graph TD
B[Text] --> C{Decision}
C -->|One| D[Result 1]
C -->|Two| E[Result 2]
```

```mermaid
mindmap
  root((mindmap))
    Origins
      Long history
      ::icon(fa fa-book)
      Popularisation
        British popular psychology author Tony Buzan
    Research
      On effectiveness<br/>and features
      On Automatic creation
        Uses
            Creative techniques
            Strategic planning
            Argument mapping
    Tools
      Pen and paper
      Mermaid
```

```plantuml {scale: 0.7}
@startuml

package "Some Group" {
  HTTP - [First Component]
  [Another Component]
}

node "Other Groups" {
  FTP - [Second Component]
  [First Component] --> FTP
}

cloud {
  [Example 1]
}

database "MySql" {
  folder "This is my folder" {
    [Folder 3]
  }
  frame "Foo" {
    [Frame 4]
  }
}

[Another Component] --> [Example 1]
[Example 1] --> [Folder 3]
[Folder 3] --> [Frame 4]

@enduml
```

</div>

Learn more: [Mermaid Diagrams](https://sli.dev/features/mermaid) and [PlantUML Diagrams](https://sli.dev/features/plantuml)

---
foo: bar
dragPos:
  square: 691,32,167,_,-16
---

# Draggable Elements

Double-click on the draggable elements to edit their positions.

<br>

###### Directive Usage

```md
<img v-drag="'square'" src="https://sli.dev/logo.png">
```

<br>

###### Component Usage

```md
<v-drag text-3xl>
  <div class="i-carbon:arrow-up" />
  Use the `v-drag` component to have a draggable container!
</v-drag>
```

<v-drag pos="663,206,261,_,-15">
  <div text-center text-3xl border border-main rounded>
    Double-click me!
  </div>
</v-drag>

<img v-drag="'square'" src="https://sli.dev/logo.png">

###### Draggable Arrow

```md
<v-drag-arrow two-way />
```

<v-drag-arrow pos="67,452,253,46" two-way op70 />

---
src: ./pages/imported-slides.md
hide: false
---

---

# Monaco Editor

Slidev provides built-in Monaco Editor support.

Add `{monaco}` to the code block to turn it into an editor:

```ts {monaco}
import { ref } from 'vue'
import { emptyArray } from './external'

const arr = ref(emptyArray(10))
```

Use `{monaco-run}` to create an editor that can execute the code directly in the slide:

```ts {monaco-run}
import { version } from 'vue'
import { emptyArray, sayHello } from './external'

sayHello()
console.log(`vue ${version}`)
console.log(emptyArray<number>(10).reduce(fib => [...fib, fib.at(-1)! + fib.at(-2)!], [1, 1]))
```

---
layout: center
class: text-center
---

# Learn More

[Documentation](https://sli.dev) · [GitHub](https://github.com/slidevjs/slidev) · [Showcases](https://sli.dev/resources/showcases)

<PoweredBySlidev mt-10 />
