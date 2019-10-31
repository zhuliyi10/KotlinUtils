package com.leory.kotlinutils.utils

import java.math.RoundingMode
import java.text.DecimalFormat

/**
 * Describe : 数据扩展
 * Author : leory
 * Date : 2019-10-30
 */

//默认保留小数点后2位
const val DEFAULT_DECIMAL_NUMBER = 2
//默认分隔符为千分位
const val DEFAULT_SEPARATE_NUMBER = 3

/**
 * @param addComma 是否需要添加逗号，默认不加
 * @param modeFloor 是否使用去尾法，默认true 1.5->1   2.8->2
 * @param decimalNum 小数点后位数
 */
fun Number.format(
    addComma: Boolean = false,
    modeFloor: Boolean = true,
    decimalNum: Int = DEFAULT_DECIMAL_NUMBER
): String {
    val decimalFormat = DecimalFormat()
    decimalFormat.maximumFractionDigits = decimalNum
    decimalFormat.groupingSize = if (addComma) DEFAULT_SEPARATE_NUMBER else 0
    if (modeFloor) decimalFormat.roundingMode = RoundingMode.FLOOR
    return decimalFormat.format(this)
}