package chi.learnglide4.glide

import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.BaseRequestOptions

@GlideExtension
object GlideRadiusApi {

    @JvmStatic
    @GlideOption
    fun doNotCache(
        options: BaseRequestOptions<*>
    ): BaseRequestOptions<*> {
        return options.skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
    }
}
