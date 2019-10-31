package com.leory.kotlinutils.utils

/**
 * Describe : 对象扩展类
 * Author : leory
 * Date : 2019-10-30
 */

val <T : Any>T.TAG
    get() = this::class.simpleName