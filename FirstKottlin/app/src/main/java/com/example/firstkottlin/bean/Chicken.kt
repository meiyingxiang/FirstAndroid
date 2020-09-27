package com.example.firstkottlin.bean

abstract class Chicken(name: String, sex: Int, var voice: String) : Bird(name, sex) {

    val numberArray: Array<String> = arrayOf("一", "二", "三", "四", "五")

    abstract fun callOut(times: Int): String
}