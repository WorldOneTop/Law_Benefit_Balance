package com.worldonetop.lawbenefitbalance.data.local

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONException


class AppSharedPreferences(context: Context) {
    companion object {
        const val FILE_PATH = "app_setting"
        const val KEY_KEYWORD = "keyword"
    }

    private val preference = context.getSharedPreferences(FILE_PATH, AppCompatActivity.MODE_PRIVATE)
    private val editPreference = preference.edit()

    private fun setKeyword(values: ArrayList<String>) {
        val a = JSONArray()
        for (i in 0 until values.size) {
            a.put(values[i])
        }
        if (values.isNotEmpty()) {
            editPreference.putString(KEY_KEYWORD, a.toString())
        } else {
            editPreference.putString(KEY_KEYWORD, null)
        }
        editPreference.apply()
    }

    private fun getKeyword(): ArrayList<String>? {
        val json = preference.getString(KEY_KEYWORD, null)
        val data = ArrayList<String>()
        try{
            json?.let {
                val a = JSONArray(it)
                for (i in 0 until a.length()) {
                    val url = a.optString(i)
                    data.add(url)
                }
                return data
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return null
    }
}