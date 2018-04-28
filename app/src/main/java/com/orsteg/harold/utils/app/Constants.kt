package com.orsteg.harold.utils.app

import java.util.*

/**
 * Created by goodhope on 4/14/18.
 */
object TimeConstants {
    val SEC: Long = 1000
    val MINUTE = SEC * 60
    val HOUR = MINUTE * 60
    val DAY = HOUR * 24
    val WEEK = DAY * 7

    val DAYS = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    fun getTime() = Calendar.getInstance().timeInMillis

    fun getStartOfDay(c: Calendar = Calendar.getInstance()): Calendar {

        c.set(Calendar.HOUR, 0)
        c.set(Calendar.MINUTE, 0)
        c.set(Calendar.SECOND, 0)
        c.set(Calendar.MILLISECOND, 0)

        return c
    }

}