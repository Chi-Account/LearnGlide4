package chi.learnglide4.base

import android.content.Context
import android.util.Log
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule

@GlideModule
class AppGlideModule : com.bumptech.glide.module.AppGlideModule() {

    companion object {
        private const val TAG = "AppGlideModule"
    }

    override fun applyOptions(context: Context, builder: GlideBuilder) {
        Log.i(TAG, "applyOptions")
    }

    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        Log.i(TAG, "registerComponents")
    }
}
