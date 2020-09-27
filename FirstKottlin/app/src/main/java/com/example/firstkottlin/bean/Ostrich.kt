package com.example.firstkottlin.bean

class Ostrich(name: String = "鸵鸟", sex: Int = Bird.MALE) : Bird(name, sex) {

    override fun getSexName(sex: Int): String {
        return if (sex == MALE) "雄" else "雌"
    }

}