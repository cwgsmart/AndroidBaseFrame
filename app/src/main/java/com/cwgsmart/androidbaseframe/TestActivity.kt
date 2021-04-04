package com.cwgsmart.androidbaseframe

import android.os.Bundle
import android.view.View
import com.cwgsmart.baseframe.CBaseActivity

/**
 *  @describe
 *  @author   Chen WenGuang
 *  @date     4/3/21 10:37 PM
 *  @email    cwg-1@163.com
 */
class TestActivity : CBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }

    fun show(view: View) {
//        val inflate = layoutInflater.inflate(R.layout.dialog_loading_text, null, false)
        showLoading(R.layout.dialog_loading_text1)}
    fun hide(view: View) {hideLoading()}
}