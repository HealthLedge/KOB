<template>
<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
    <div class="container">
        <router-link class="navbar-brand" :to="{name: 'pk_index'}">King Of Bots</router-link>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <router-link :class="routeName == 'pk_index' ? 'nav-link active' : 'nav-link'" :to="{name:'pk_index'}">对战</router-link>
                </li>
                <li class="nav-item">
                    <router-link :class="routeName == 'record_index' ? 'nav-link active' : 'nav-link'" :to="{name:'record_index'}">对战列表</router-link>
                </li>
                <li class="nav-item">
                    <router-link :class="routeName == 'ranklist_index' ? 'nav-link active' : 'nav-link'" :to="{name:'ranklist_index'}">排行榜</router-link>
                </li>
            </ul>
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Terence
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <router-link class="dropdown-item" :to="{name: 'user_bot_index'}">我的Bot</router-link>
                        </li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="#">退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
</template>

<script>
import { useRoute } from 'vue-router';
import { computed } from 'vue';

export default {
    setup() {
        const route = useRoute();
        let routeName = computed(() => route.name);

        return {
            routeName
        };
    }
}

</script>

<style>

</style>
