package seventeen.mvvm.imagesearchapp.api

import seventeen.mvvm.imagesearchapp.data.UnsplashPhoto


data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)