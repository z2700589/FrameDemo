package com.example.framedemo.ui.mine


import com.alibaba.android.arouter.launcher.ARouter

import com.example.framedemo.R
import com.example.framedemo.ui.mine.contract.MineContract
import com.example.framedemo.ui.mine.presenter.MinePresenter
import com.example.lib_common.base.BaseApplication
import com.example.lib_common.base.BaseFragment
import com.example.lib_common.constant.RouterPath
import com.example.lib_common.model.UserControl
import com.example.lib_common.utils.ToastUtils
import kotlinx.android.synthetic.main.fragment_mine.*


/**
 * 用户中心
 *
 */
class MineFragment : BaseFragment(),MineContract.View {

    /**
     * 懒加载Presenter
     */
    private val mPresenter by lazy { MinePresenter() }
    init {
        mPresenter.attachView(this)
    }

    companion object {
        fun newInstance() = MineFragment()
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_mine
    }

    override fun initData() {
    }

    override fun initView() {
        tv_login.setOnClickListener {
            if (UserControl.isLogin()){
                ToastUtils.show(BaseApplication.context,"当前登录的用户是："+UserControl.getUser().username)
            }else{
                ARouter.getInstance().build(RouterPath.UserCenter.LOGIN).navigation()
            }
        }
    }

    override fun fragmentShowToUser() {
    }

    override fun fragmentHideToUser() {
    }

    override fun showError(errorMsg: String) {
        ToastUtils.show(BaseApplication.context,errorMsg)
    }

    override fun showUserInfo() {
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

}
