<template>
  <div class="container-fluid">
    <div class="card bg-dark text-white header">
      <img src="../assets/13804312464_4656f62a1e_o_header.jpg" class="card-img" alt="synth">
      <div class="card-img-overlay">
        <h1 class="card-title text-monospace">Synthesizrs</h1>
        <div class="card-text">
          <form class="form-inline" style="text-align: center;">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </div>
    </div>
    <div class="card-group">
      <div class="card">
        <img src="../assets/518046941_50a9410063_o.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Non diam</h5>
          <p class="card-text">Dictum varius duis at consectetur lorem donec massa sapien faucibus. </p>
          <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
        </div>
      </div>
      <div class="card">
        <img src="../assets/6928013157_2f1054eb54_o.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Condimentum vitae sapien</h5>
          <p class="card-text">Nulla pellentesque dignissim enim sit amet. Ut porttitor leo a diam sollicitudin. </p>
          <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
        </div>
      </div>
      <div class="card">
        <img src="../assets/20161284852_3b5f293d7c_o.jpg" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">Mattis ullamcorper</h5>
          <p class="card-text">Habitasse platea dictumst vestibulum rhoncus est pellentesque. Semper eget duis at tellus.
            Condimentum vitae sapien pellentesque habitant morbi tristique senectus.</p>
          <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
        </div>
      </div>
    </div>
    <div class="card">
      <div class="card-header">
        Des synthesizerssss
      </div>
      <div class="card-body">
        <h5 class="card-title">Semper eget</h5>
        <p class="card-text">Cestibulum rhoncus est pellentesque. Semper eget duis at tellus.
          Condimentum vitae sapien pellentesque habitant morbi.</p>
        <table class="table">
          <thead>
          <tr>
            <th scope="col">Nom de synth</th>
            <th scope="col">Compagnie de synth</th>
            <th scope="col">Annee de synth</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <th scope="row">1</th>
            <td>Rhytm</td>
            <td>Elektron</td>
            <td>2001</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Prophet</td>
            <td>Rossum</td>
            <td>1980</td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td>Modular</td>
            <td>Eurorack</td>
            <td>1975</td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Home',
  props: {
    msg: String
  }
}
</script>

<style scoped>
  .header {
    text-align: center;
  }

  .header .card-title {
    font-size: 5vw;
    text-shadow: black 5px 5px 5px;
    text-align: center;
    font-weight: bold;
  }
</style>
