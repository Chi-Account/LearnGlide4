package chi.learnglide4.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        val requestOptions = RequestOptions().override(Target.SIZE_ORIGINAL)
        Glide.with(this)
            .load(IMAGE_URL)
            .apply(requestOptions)
            .into(imageView)
    }
}