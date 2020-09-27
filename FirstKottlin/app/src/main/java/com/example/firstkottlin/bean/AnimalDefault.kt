package com.example.firstkottlin.bean

import android.content.Context
import android.util.Log
import org.jetbrains.anko.toast

open class AnimalDefault @JvmOverloads constructor(mContext: Context?, name: String, sex: Int = 0) {

    init {
        var sexName: String = if (sex == 0) "男" else "女"
        mContext?.toast("叫${name}的性别是${sexName}")
        val judgeSex = WildAnimal.judgeSex("男")
        Log.e("Frank", "judgeSex=${judgeSex}")
    }

    companion object WildAnimal {
        fun judgeSex(sexName: String): Int {
//            var sex: Int = if (sexName == "男") 0 else 1
            var sex: Int = when (sexName) {
                "男", "公", "雄" -> 0
                "女", "母", "雌" -> 1
                else -> -1
            }
            return sex;
        }
    }
}