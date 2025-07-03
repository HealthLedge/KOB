<template>
  <div id="app">
    <div>bot昵称: {{ botname }}</div>
    <div>bot战力: {{ botpower }}</div>
  </div>
  <router-view></router-view>
</template>

<script>
import $ from 'jquery'
import {ref} from 'vue'

export default {
  name: 'App',
    setup() {
      let botname = ref('');
      let botpower = ref('');
    $.ajax({
      url: 'http://localhost:3000/pk/getbotinfo/',
      type: 'GET',
      success: resp => {
        console.log(resp);
        botname.value = resp.nima;
        botpower.value = resp.shabilaji;
      }
    });
    return {
      botname,
      botpower
    }
  }
}
</script>

<style>
body {
  background-image: url('@/assets/image.png');
  background-size: cover;
}
</style>
