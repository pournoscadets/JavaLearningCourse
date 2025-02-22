<template>
  <table>
    <thead>
      <tr>
        <th></th>        
        <th>get</th>
        <th>add</th>
        <th>contains</th>
        <th>next</th>
        <th>remove</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="complexity in complexities" :key="complexity.id">
        <td>{{ complexity.nom }}</td>
        <td :style="{ color: complexity.getcolor }">{{ complexity.get }}</td>                
        <td :style="{ color: complexity.addcolor }">{{ complexity.add }}</td>                
        <td :style="{ color: complexity.containscolor }">{{ complexity.contains }}</td>
        <td :style="{ color: complexity.nextcolor }">{{ complexity.next }}</td>        
        <td :style="{ color: complexity.removecolor }">{{ complexity.remove }}</td>        
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  data() {
    return {
      complexities: [
        { id: 1, nom: 'HashMap', add: 'O(1)', addcolor: 'green', get: 'O(1)', getcolor: 'green', contains: 'O(1)', containscolor: 'green', next: 'O(1)', nextcolor: 'green', remove: 'O(1~n)', removecolor: 'green' },
        { id: 2, nom: 'LinkedHashMap',  add: 'O(1)', addcolor: 'green', get: 'O(1)', getcolor: 'green', contains: 'O(1)', containscolor: 'green', next: 'O(1)', nextcolor: 'green', remove: 'O(1~n)',removecolor: 'green' }, 
        { id: 3, nom: 'TreeMap', add: 'O(log n)', addcolor: 'red', get: 'O(log n)', getcolor: 'red', contains: 'O(log n)', containscolor: 'red', next: 'O(log n)', nextcolor: 'red', remove: '(log n)',removecolor: 'red' }, 
      ]
    }
  }
}
</script>