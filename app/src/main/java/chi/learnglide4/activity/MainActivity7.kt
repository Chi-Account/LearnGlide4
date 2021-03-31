package chi.learnglide4.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity7 : AppCompatActivity() {

    private var loaded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        if (!loaded) {
            loadImage()
            loaded = true
        } else {
            showImage()
        }
    }

    private fun loadImage() {
        Glide.with(this)
            .load(IMAGE_URL)
            .preload()
    }

    private fun showImage() {
        Glide.with(this)
            .load(IMAGE_URL)
            .into(imageView)
    }
}