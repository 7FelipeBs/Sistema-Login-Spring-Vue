<template>
  <q-layout view="hHh lpR fFf">
    <q-header elevated class="bg-menu text-horizon ">
      <q-toolbar>
        <q-toolbar-title 
        class="row col-auto">
          <div class="col-3">
            <img class="on-left" style="width: 30px" src="../assets/iconHorizonte-2a9d8f.svg">
          </div>
          <div class="col-6 text-format" color="grey-9">
            Horizon
          </div>
        </q-toolbar-title>
      </q-toolbar>
    </q-header>

    <q-page-container>
      <router-view />
    </q-page-container>
  </q-layout>
</template>

<script>

</script>
<style lang="scss" scoped>

.text-format {
  margin-left: 5px;
}
.text-horizon {
  color: #e9c46a;
}
.bg-menu {
  background-color: #264653
}
</style>
