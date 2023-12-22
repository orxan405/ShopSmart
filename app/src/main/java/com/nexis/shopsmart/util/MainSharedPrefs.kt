package com.nexis.shopsmart.util

import android.content.SharedPreferences

class MainSharedPrefs(val sharedPreferences: SharedPreferences) {

    /**
     * Save data to SharedPreference in Generic Type
     * @param item : [String]-> key for SharedPreference
     * @param value : [T] ->  Save Data in Generic Type
     **/


    fun <T> setSharedData(item: String, value: T) {
        val editor = sharedPreferences.edit()

        when (value) {
            is Int -> {
                editor.putInt(item, value)
            }
            is String -> {
                editor.putString(item, value)
            }
            is Boolean -> {
                editor.putBoolean(item, value)
            }
            else -> {
                editor.putString(item, value as String)
            }
        }
        editor.apply()
    }

    /**
     * Get data fron SharedPreference in Generic Type
     * @param item : [String]-> key for SharedPreference
     * @param default : [T] ->  Default value for getting data
     * @return [T] -> Data in Generic Type
     */


    inline fun <reified T> getSharedData(item: String, default: T): T {
        return when (T::class) {
            Int::class -> {
                sharedPreferences.getInt(item, default as Int) as T
            }
            String::class -> {
                sharedPreferences.getString(item, default as String) as T
            }
            Boolean::class -> {
                sharedPreferences.getBoolean(item, default as Boolean) as T
            }
            else -> {
                sharedPreferences.getString(item, default as String) as T
            }
        }
    }

    fun isContains(prName:String) = sharedPreferences.contains(prName)

    /**
     * Clear all data in SHaredPreference
     */

    fun clearShare(){
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    /**
     * Remove data from SharedPreference by given name
     * @param prName : [String] -> Removed Data's key
     */


    fun removeShare(prName:String){
        val editor = sharedPreferences.edit()
        editor.remove(prName)
        editor.apply()
    }
}