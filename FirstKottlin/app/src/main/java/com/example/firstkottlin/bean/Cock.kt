package com.example.firstkottlin.bean

class Cock(name: String = "鸡", sex: Int = Bird.MALE, voice: String = "喔 喔 喔") :
    Chicken(name, sex, voice) {

    override fun callOut(times: Int): String {
        var count = when {
            times <= 0 -> 0
            times >= 10 -> 9
            else -> times
        }
        return "$sexName$name${voice}叫了${numberArray[count]}声,原来他在报晓啊"
    }


}