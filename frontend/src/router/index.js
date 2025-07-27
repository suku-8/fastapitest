import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/customers',
      component: () => import('../components/ui/CustomerGrid.vue'),
    },
    {
      path: '/funeralInfos',
      component: () => import('../components/ui/FuneralInfoGrid.vue'),
    },
    {
      path: '/pythons',
      component: () => import('../components/ui/PythonGrid.vue'),
    },
    {
      path: '/obituaries',
      component: () => import('../components/ui/ObituaryGrid.vue'),
    },
  ],
})

export default router;
