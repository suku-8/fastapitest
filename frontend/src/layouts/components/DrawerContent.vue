<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'test' }" />
        <VerticalNavLink
            :item="{
                title: '고객',
                to: '/customers',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '장례정보',
                to: '/funeralInfos',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'python',
                to: '/pythons',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '부고장',
                to: '/obituaries',
            }"
        />
    </ul>
</template>
