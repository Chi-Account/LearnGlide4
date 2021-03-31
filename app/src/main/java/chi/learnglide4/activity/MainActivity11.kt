package chi.learnglide4.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import chi.learnglide4.base.GlideApp
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_main11.*

class MainActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
    }

    fun onClick(view: View) {
        GlideApp.with(this)
            .load(IMAGE_URL)
            .doNotCache()
            .override(Target.SIZE_ORIGINAL)
            .placeholder(R.drawable.ic_load_image_placeholder)
            .error(R.drawable.ic_load_image_failure)
            .into(imageView)
    }
}