<template>
<v-card class="mt-5 mb-8" elevation="2" loading outlined>
  <label for="uname"><b>Username</b></label>
  <input type="text" placeholder="Enter Username" v-model="loginObject.username" required>

  <label for="psw"><b>Password</b></label>
  <input type="password" placeholder="Enter Password" v-model="loginObject.password" required>

  <v-card-actions>

  </v-card-actions>

  <button @click="login">Login</button>

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
      msg: '',
      loginObject: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    login(){
      axios.post("/api/login", this.loginObject)
      .then((res) => {
        this.msg = res.data
      })
      .catch((error) => {
        alert(error);
      })
    }
  }
}
</script>

<style>
form {
  border: 3px solid #f1f1f1;
}

/* Full-width inputs */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
  opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
  width: 40%;
  border-radius: 50%;
}

</style>