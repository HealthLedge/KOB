<template>
  <div ref="parent" class="gamemap">
    <canvas ref="canvas" tabindex="0"></canvas>
  </div>
</template>

<script>
import {GameMap} from '@/assets/scripts/GameMap.js';
import {ref, onMounted} from 'vue';

export default {
  setup() {
    let parent = ref(null);
    let canvas = ref(null);

    onMounted(() => {
      // Initialize the game map when the component is mounted
      new GameMap(canvas.value.getContext('2d'), parent.value)
    });
    return {
        parent,
        canvas
    }
  }
};
</script>

<style>
div.gamemap {
    width:100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}
</style>