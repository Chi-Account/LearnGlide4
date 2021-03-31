package chi.learnglide4.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val requestOptions = RequestOptions().placeholder(R.drawable.ic_load_image_placeholder)
            .error(R.drawable.ic_load_image_failure)
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
        Glide.with(this)
            .load(IMAGE_URL)
            .apply(requestOptions)
            .into(imageView)
    }
}