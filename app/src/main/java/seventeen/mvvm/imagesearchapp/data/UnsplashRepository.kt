package seventeen.mvvm.imagesearchapp.data

import seventeen.mvvm.imagesearchapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}