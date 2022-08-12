<template>
  <div>
    <UnauthorizedComponent/>
  </div>
</template>

<script>
import UnauthorizedComponent from '@/components/UnauthorizedComponent.vue';

export default {
  name: 'UnauthorizedAccessView',
  components: {
    UnauthorizedComponent
  }
}
</script>