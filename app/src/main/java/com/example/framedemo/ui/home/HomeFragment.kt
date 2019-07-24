package com.example.framedemo.ui.home



import com.example.framedemo.R
import com.example.framedemo.ui.home.contract.HomeContract
import com.example.framedemo.ui.home.presenter.HomePresenter
import com.example.lib_common.base.BaseApplication
import com.example.lib_common.base.BaseFragment
import com.example.lib_common.model.Banner
import com.example.lib_common.utils.LogUtils
import com.example.lib_common.utils.ToastUtils
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * 首页 fragment
 *
 */
class HomeFragment : BaseFragment(), HomeContract.View {

    /**
     * 懒加载Presenter
     */
    private val mPresenter by lazy { HomePresenter() }
    init {
        mPresenter.attachView(this)
    }

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initData() {
        mPresenter.getBanners()
    }

    override fun initView() {
    }

    override fun setTvTitleBackgroundColor() {
        tv_title.setBackgroundColor(resources.getColor(R.color.colorAccent))
        fake_status_bar.setBackgroundColor(resources.getColor(R.color.colorAccent))
    }

    override fun fragmentShowToUser() {
        LogUtils.ee("222","fragmentShowToUser")
    }

    override fun fragmentHideToUser() {
        LogUtils.ee("222","fragmentHideToUser")
    }

    override fun showError(errorMsg: String) {
        ToastUtils.show(BaseApplication.context,errorMsg)
    }

    override fun showBanners(banners: MutableList<Banner>) {
        LogUtils.ee("222","banners: "+banners.toString())
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onDestroy() {
        mPresenter.detachView()
        super.onDestroy()
    }
}
