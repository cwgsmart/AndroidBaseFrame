package com.cwgsmart.baseframe.widget

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import com.cwgsmart.baseframe.R


class ProgressLoading constructor(context: Context, theme: Int) : Dialog(context, theme) {

//    companion object {
//        private lateinit var mDialog: ProgressLoading
////        private var animDrawable: AnimationDrawable? = null
//
//        /*
//            创建加载对话框
//         */
//        fun create(context: Context): ProgressLoading {
//            //样式引入
//            mDialog = ProgressLoading(context, R.style.LightProgressDialog)
//            //设置布局
//            mDialog.setContentView(R.layout.progress_dialog)
//            mDialog.setCancelable(true)
//            mDialog.setCanceledOnTouchOutside(false)
//            mDialog.window!!.attributes.gravity = Gravity.CENTER
//
//            val lp = mDialog.window!!.attributes
//            lp.dimAmount = 0.2f
//            //设置属性
//            mDialog.window!!.attributes = lp
//
//            //获取动画视图
////            val loadingView = mDialog.find<ImageView>(R.id.iv_loading)
////            animDrawable = loadingView.background as AnimationDrawable
//
//            return mDialog
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.progress_dialog)
        setCancelable(true)
        setCanceledOnTouchOutside(false)
        window!!.attributes.gravity = Gravity.CENTER
        //设置属性
        val lp = window!!.attributes
        lp.dimAmount = 0.2f
        window!!.attributes = lp
    }

    /*
        显示加载对话框，动画开始
     */
    fun showLoading() {

        super.show()
//        animDrawable?.start()
    }

    /*
        隐藏加载对话框，动画停止
     */
    fun hideLoading() {
        super.dismiss()
//        animDrawable?.stop()
    }
}
