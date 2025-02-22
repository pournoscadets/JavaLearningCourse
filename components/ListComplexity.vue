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
        <td>{{ complexity.add }}</td>
        <td>{{ complexity.contains }}</td>
        <td>{{ complexity.next }}</td>
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
        { id: 1, nom: 'ArrayList', get: 'O(1)', getcolor: 'green', add: 'O(1)', contains: 'O(n)', next: 'O(1)', remove: 'O(n)', removecolor: 'red' },
        { id: 2, nom: 'LinkedList', get: 'O(n)', getcolor: 'red', add: 'O(1)', contains: 'O(n)', next: 'O(1)', remove: 'O(1)',removecolor: 'green' }, 
      ]
    }
  }
}
</script>