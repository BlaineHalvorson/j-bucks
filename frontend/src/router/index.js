import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginComponent from '../components/LoginComponent.vue'
import AboutComponent from '../components/AboutComponent.vue'
import CreateUserComponent from '../components/CreateUserComponent.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutComponent
  },
  {
    path: '/login',
    name: 'login',
    component: LoginComponent
  },
  {
    path: '/create-user',
    name: 'create-user',
    component: CreateUserComponent
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
