package com.cwgsmart.baseframe

import android.app.Dialog
import android.os.Bundle
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cwgsmart.baseframe.widget.CustomLoading
import com.cwgsmart.baseframe.widget.ProgressLoading

/**
 *  @describe Activity基类
 *  @author   Wining Chen
 *  @date     4/3/21 5:58 PM
 *  @email    cwg-1@163.com
 */
abstract class CBaseActivity : AppCompatActivity() {

    // 定义一个加载框
    private lateinit var mProgressLoading: ProgressLoading
    private lateinit var mCustomLoading: CustomLoading


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mProgressLoading = ProgressLoading(this, R.style.LightProgressDialog)
        mCustomLoading = CustomLoading(this, R.style.LightProgressDialog)
        setContentView(getLayoutId())

    }

    abstract fun getLayoutId(): Int

    protected fun getCustomDialog(): CustomLoading {
        return mCustomLoading
    }

    protected fun showLoading(dialogLayoutId: Int = View.NO_ID) {
        if (dialogLayoutId == View.NO_ID) {
            mProgressLoading.showLoading()
        } else {
            mCustomLoading.setContentView(dialogLayoutId)
            mCustomLoading.showLoading()
        }

    }

    protected fun hideLoading() {
        hideDefaultDialog()
    }

    private fun showDefaultDialog() {

    }

    private fun hideDefaultDialog() {
        mProgressLoading.hideLoading()
    }


}