package chi.learnglide4.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import chi.learnglide.base.IMAGE_URL
import chi.learnglide4.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.FutureTarget
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import kotlin.concurrent.thread

class MainActivity8 : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity8"
    }

    private var downloaded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        if (!downloaded) {
            downloadImage()
        } else {
            showImage()
        }
    }

    private fun downloadImage() {
        thread {
            val target: FutureTarget<File> = Glide.with(applicationContext)
                .asFile()
                .load(IMAGE_URL)
                .submit(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
            val file: File = target.get()
            Log.i(TAG, "File: ${file.absolutePath}")
            downloaded = true
        }
    }

    private fun showImage() {
        Glide.with(this)
            .load(IMAGE_URL)
            .into(imageView)
    }
}