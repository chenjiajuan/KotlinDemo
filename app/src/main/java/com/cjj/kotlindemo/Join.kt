package com.cjj.kotlindemo

/**
 * Created by chenjiajuan on 2018/4/8.
 *
 * 顶层函数
 */

fun joinToString3(collection: Collection<String>,
                  separator:String=";",
                  prefix:String="【",
                  postfix:String="】"
             ):String {

    var result=StringBuilder(prefix)
    for ((index,value) in collection.withIndex()){
        if (index>0)
            result.append(separator)
        result.append(value)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 扩展函数
 */
fun String.lastChar():Char=this.get(this.length-1)

/**
 * 接受者对象成员可以不用this来访问
 */
fun String.lastChar2():Char=get(length-1)

/**
 * 别名访问
 */
fun String.lastChar3():Char=get(length-1)