package com.example.firstkottlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.text = "你好"


        tv.setOnLongClickListener {
            longToast("长按点击")
            ;true
        }

        /*   val num: Int = 8//val只能赋值一次
           var str: String = ""
           var i: Int = 0
           val origin: Float = 65.0f
   //        i = origin.toInt()
           tv.text = i.toString()

           var int_array: IntArray = intArrayOf(1, 4, 2)
           var char_array: CharArray = charArrayOf('1')
           var long_array: LongArray = longArrayOf(2L, 4L)
           var float_array: FloatArray = floatArrayOf(3f, 2f)
           var double_array: DoubleArray = doubleArrayOf(3.0, 90.0)
           var str_array: Array<String> = arrayOf("完美", "天气", "大风", "细雨")

           tv.setOnClickListener {
               toast("点了一下")
           }

           var strs: String = ""
           while (i < str_array.size) {
               var str: String = str_array.get(i)
   //                var str: String  =  str_array[i]
               Log.e("Frank", "Str=$str")
               var index_num: Int = str.indexOf("大")
               Log.e("Frank", "index_num=$index_num")
               var str_fix: String = str.replace("气", "晴")
               Log.e("Frank", "str_fix=$str_fix")
               strs = strs + str + ","
               i++
           }

           Log.e("Frank", "strs=$strs")
           var strList: List<String> = strs.split(",")
           for (str in strList) {
               Log.e("Frank", "str=$str")
           }

           Log.e("Frank", "指定1位置strs=${strs[1].toString()}")
           Log.e("Frank", "特殊字符$${str_array[1]}")*/
        /* if (intNum == 0)
                   toast("当前是0")
               else if (intNum == 1)
                   toast("当前是1")
               else
                   toast("当前是其他")*/

        val satelLites: List<String> = listOf("水星", "金星", "地球", "火星", "木星", "土星")

        val mutList: MutableList<String> = mutableListOf("")

        var intNum: Int = 0
        var count = 7

        var is_found: Boolean = false

        /* outside@ while (intNum < satelLites.size) {
             var j: Int = 0
             var item = satelLites[intNum]
             while (j < item.length) {
                 if (item[j] == '火') {
                     is_found = true
                     Log.e("Frank", "item=${item[j]}")
                     break@outside
                 }
                 j++
             }
             if (is_found) {
                 break
             }
             intNum++
             Log.e("Frank", "is_found=$is_found")
         }*/


        /* for (str in satelLites) {
             if (str == "金星") {
 //                Log.e("Frank", "str=$str")
 //                break
             }
 //            if (str.isBlank()) {
             Log.e("Frank", "str=$str,isBlank=${str.isBlank()}")
 //            }
 //            if (str.isEmpty()) {
             Log.e("Frank", "str=$str,isEmpty=${str.isEmpty()}")
 //            }
 //            if (str.isNotBlank()) {
             Log.e("Frank", "str=$str,isNotBlank=${str.isNotBlank()}")
 //            }
 //            if (str.isNotEmpty()) {
             Log.e("Frank", "str=$str,isNotEmpty=${str.isNotEmpty()}")
 //            }
 //            if (str.isNullOrBlank()) {
             Log.e("Frank", "str=$str,isNullOrBlank=${str.isNullOrBlank()}")
 //            }
 //            if (str.isNullOrEmpty()) {
             Log.e("Frank", "str=$str,isNullOrEmpty=${str.isNullOrEmpty()}")
 //            }
         }*/

        var str_null: String? = ""
        Log.e("Frank", "str_null=${str_null?.length ?: -1}")
        getDoubleData()

        Log.e("Frank","当前时间为:${Date().getNowDateTime()}")

        var bean : Bean = Bean()

    }

    fun getDoubleData() {
        val array: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
        array.swap(0, array.size - 1)

        Log.e("Frank", "交换位置=${array.contentToString()}")
//        for (num in array) {
//            Log.e("Frank", "交换位置2=$num")
//        }
    }

    fun Date.getNowDateTime(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return sdf.format(this)
    }

    fun <T> Array<T>.swap(pos1: Int, pos2: Int) {
        val tmp = this[pos1] //this表示数组自身
        this[pos1] = this[pos2]
        this[pos2] = tmp
    }

    fun getData(str: String) {

    }

    fun getJsonData(str: String): String {
        return ""
    }

}
