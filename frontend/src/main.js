import { createApp } from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import router from './router'

loadFonts()

const app = createApp(App).use(router)
.use(vuetify);

// global variable for figuring out if the user is logged in
app.config.globalProperties.$isLoggedIn = false
app.provide('isLoggedIn', app.config.globalProperties.$isLoggedIn)

app.mount('#app')
