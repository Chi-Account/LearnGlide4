package chi.learnglide4.activity

import android.os.Bundle
import chi.library.base.pageturner.BasePageTurnerActivity
import chi.library.base.pageturner.Page
import chi.library.util.LogUtil

class PageTurnerActivity : BasePageTurnerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.init(true)
    }

    override fun getPageList(): List<Page> =
        listOf(
            Page("基本使用", MainActivity::class.java),
            Page("占位图", MainActivity2::class.java),
            Page("指定图片大小", MainActivity3::class.java),
            Page("缓存", MainActivity4::class.java),
            Page("指定加载格式", MainActivity5::class.java),
            Page("自定义 Target", MainActivity6::class.java),
            Page("预加载", MainActivity7::class.java),
            Page("下载图片文件", MainActivity8::class.java),
            Page("监听", MainActivity9::class.java),
            Page("图片变换", MainActivity10::class.java),
            Page("Generated API", MainActivity11::class.java)
        )
}