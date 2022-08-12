import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginComponent from '../components/LoginComponent.vue'
import AboutComponent from '../components/AboutComponent.vue'
import CreateUserComponent from '../components/CreateUserComponent.vue'
import PageNotFoundComponent from '../components/PageNotFoundComponent.vue'
import UnauthorizedAccessComponent from '../components/UnauthorizedComponent.vue'

const routes = [
  {
    path: '/home',
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
    name: 'createUser',
    component: CreateUserComponent
  },
  {
    path: '/:catchAll(.*)*',
    name: "pageNotFound",
    component: PageNotFoundComponent
  },
  {
    path: '/unauthorized',
    name: 'unauthorized',
    component: UnauthorizedAccessComponent
}]

const router = createRouter({
  history: createWebHistory(),
  routes
})

// router.beforeEach(async (to) => {
//   console.log(isLoggedIn);
//   if (isLoggedIn && to.name !== 'login') {
//     // redirect the user to the login page
//     return { name: 'login' }
//   }
// })

export default router
