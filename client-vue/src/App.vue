<template>
  <div id="app">
    <NavBar></NavBar>
    <Home></Home>
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue'
import Home from './components/Home.vue'

export default {
  name: 'App',
  components: {
    NavBar,
    Home,
  }
}
</script>

<style>

</style>
