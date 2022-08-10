<template>
<v-card class="mx-auto" max-width="80%" elevation="2" outlined :loading="isLoading">

  <v-card-title>Welcome To J Bucks</v-card-title>
  <v-text-field
    label="Username"
    width="50%"
    type="text"
    v-model="loginObject.username"
  ></v-text-field>

  <v-text-field
    label="Password"
    width="50%"
    type="password"
    v-model="loginObject.password"
  ></v-text-field>

  <v-card-actions
    class="justify-center">
    <v-btn 
      elevation="2"
      rounded 
      text 
      :loading="isLoading"
      @click="login">Login</v-btn>
    <v-spacer></v-spacer>
    <v-btn 
      elevation="2"
      to="/create-user"
      rounded
      >Create Account</v-btn>
  </v-card-actions>


  <div style="background-color:#f1f1f1">
    <p>{{ msg }}</p>
  </div>
</v-card>
</template>

<script>
import axios from 'axios';

export default {
  name: 'LoginComponent',
  data() {
    return {
      isLoading: false,
      msg: '',
      loginObject: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    login(){
      this.isLoading = true;
      axios.post("/api/login", this.loginObject)
      .then((res) => {
        this.msg = res.data
        this.isLoading = false;
      })
      .catch((error) => {
        alert(error);
        this.isLoading = false;
      })
    },
    routeToCreateAccount(){

    }
  }
}
</script>

<style>

</style>