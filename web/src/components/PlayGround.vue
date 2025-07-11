<template>
  <div class="playground">
    <GameMap />
  </div>
</template>

<script>
import GameMap from './GameMap.vue';
export default {
  components: {
    GameMap
  },
};
</script>

<style>
div.playground {
    width: 60vw;
    height: 70vh;
    margin-left: 300px;
    margin-top: 50px;
}
</style>