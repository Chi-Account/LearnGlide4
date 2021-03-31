package chi.learnglide4.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import jp.wasabeef.glide.transformations.BlurTransformation
import jp.wasabeef.glide.transformations.GrayscaleTransformation
import kotlinx.android.synthetic.main.activity_main10.*

class MainActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
    }

    fun onClick(view: View) {
        val requestOptions = RequestOptions().transform(
            BlurTransformation(),
            CircleCrop(),
            GrayscaleTransformation(),
        )
        Glide.with(this)
            .load(IMAGE_URL)
            .apply(requestOptions)
            .into(imageView)
    }
}